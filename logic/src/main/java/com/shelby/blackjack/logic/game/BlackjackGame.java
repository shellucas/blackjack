package com.shelby.blackjack.logic.game;

import com.shelby.blackjack.logic.cards.DefaultCard;
import com.shelby.blackjack.logic.cards.Shoe;
import com.shelby.blackjack.logic.cards.hands.Hand;
import com.shelby.blackjack.logic.users.BlackjackPlayer;
import com.shelby.blackjack.table.BlackjackTable;
import com.shellucas.casinoapi.bets.tables.BetPlacable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author shelby
 */
public class BlackjackGame {

    private BetPlacable table;
    private Shoe shoe;
    private Hand dealer;
    private List<BlackjackPlayer> players;
    private boolean dealerIsBust;

    /**
     * Default game with a maximum accumulation of bets of 10000 and a minimum
     * bet of 10.
     *
     * @param shoe
     * @param dealer
     */
    public BlackjackGame(Shoe shoe, Hand dealer) {
        this.shoe = shoe;
        this.players = new ArrayList<>();
        this.table = new BlackjackTable(1000, 10);
        this.dealer = dealer;
        this.dealerIsBust = false;
    }

    public BlackjackGame(Shoe shoe, Hand dealer, BlackjackTable table) {
        this(shoe, dealer);
        this.table = table;
    }

    public BetPlacable getTable() {
        return table;
    }

    public Shoe getShoe() {
        return shoe;
    }

    public Hand getDealer() {
        return dealer;
    }

    public boolean addPlayer(BlackjackPlayer player) {
        return players.add(player);
    }

    /**
     * Cycles one round of the game. In order; deal players, deal dealer, offer
     * insurances, offer split hands, fill hands, check if dealer is busted if
     * so non-bust hands, otherwise resolves all hands compared to dealer.
     */
    public void cycle() {
        dealPlayers();
        dealToDealer();
        getInsurances();
        getSplits();
        fillHands();
        if (dealerIsBust) {
            resolveBust();
        } else {
            resolveHands();
        }
    }

    /**
     * Deal cards to all players
     */
    private void dealPlayers() {
        players.forEach((player) -> {
            player.newGame();
            dealTo(player.getFirstHand());
        });
    }

    /**
     * Deal cards to dealer
     */
    private void dealToDealer() {
        dealer.clear();
        dealTo(dealer);
    }

    /**
     * Deal cards to hand
     *
     * @param handToDeal
     */
    private void dealTo(Hand handToDeal) {
        handToDeal.addAndRecalculateHand(shoe.deal());
        handToDeal.addAndRecalculateHand(shoe.deal());
    }

    /**
     * Offer insurance for each hand of each player if the upcard is an ace.
     */
    private void getInsurances() {
        DefaultCard upCard = (DefaultCard) dealer.getUpCard();
        if (upCard.offerInsurance()) {
            insurance();
        }
    }
    
    /**
     * Checks for each player if they have blackjack and offers insurance.
     */
    private void insurance() {
        players.stream()
                .map((player) -> player.getFirstHand())
                .filter((playerHand) -> (playerHand.blackjack()))
                .map((playerHand) -> {
                    evenMoney(playerHand);
                    return playerHand;
                })
                .forEachOrdered((playerHand) -> {
                    // Hand bet may have been altered by even money
                    playerHand.getOwner().win(playerHand.getBet());
                });
    }
    
    /**
     * Offers insurance and if accepted handles insurance and returns true.
     * @param thand
     * @return 
     */
    private boolean evenMoney(Hand hand) {
        if (hand.getOwner().evenMoney(hand)) {
            hand.getBet().getOutcome().alterOdds(1);
            hand.getOwner().win(hand.getBet());
            return true;
        } return false;
    }
    
    

    /**
     * Offer to split hands and deal a card to the original and new hand.
     */
    private void getSplits() {
        getAllHands().forEach((player, hands) -> {
            hands.forEach((hand) -> {
                if (hand.splittable() && !hand.isSplitDeclined()) {
                    Hand splitHand = player.split(hand);
                    hand.addAndRecalculateHand(shoe.deal());
                    splitHand.addAndRecalculateHand(shoe.deal());
                }
            });
        });
    }

    private void fillHands() {
        getAllHands().forEach((player, hands) -> {
            for (Hand hand : hands) {
                if (hand.blackjack()) {
                    break;
                }
                offerChoices(player, hand);
            }
        });
        fillDealer();
    }

    /**
     * Offer choices to hit while not busted or choosing to stand pat.
     *
     * @param player
     * @param hand
     */
    private void offerChoices(BlackjackPlayer player, Hand hand) {
        while (true) {
            if (hand.busted())  break;
            
            if (player.doubleDown(hand)) {
                player.hit(hand);
                hand.addAndRecalculateHand(shoe.deal());
                break;
            }
            
            if (player.hit(hand)) {
                hand.addAndRecalculateHand(shoe.deal());
            } else if (player.standPat()) {
                break;
            }
        }
    }

    /**
     * Fill dealer until busted or hand's value is over 16.
     */
    private void fillDealer() {
        while (true) {
            if (dealer.busted()) {
                this.dealerIsBust = true;
                break;
            } else if (dealer.value() < 17) {
                dealer.addAndRecalculateHand(shoe.deal());
            } else {
                break;
            }
        }
    }

    private void resolveBust() {
        getAllHands().forEach((player, hands) -> {
            hands.stream()
                    .filter((hand) -> (!hand.busted()))
                    .forEachOrdered((hand) -> player.win(hand.getBet()));
        });
    }

    private void resolveHands() {
        getAllHands().forEach((player, hands) -> {
            hands.forEach((hand) -> {
                if (hand.busted() || hand.compareTo(dealer) <= 0) {
                    player.lose(hand.getBet());
                } else {
                    player.win(hand.getBet());
                }
            });
        });
    }

    /**
     * Get a list of all players hands.
     *
     * @return
     */
    private Map<BlackjackPlayer, List<Hand>> getAllHands() {
        Map<BlackjackPlayer, List<Hand>> hands = new HashMap<>();
        players.forEach((player) -> {
            List<Hand> playerHands = player.getHands();
            hands.put(player, playerHands);
        });
        return hands;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Blackjack status").append("\n");
        sb.append("Dealers hand: ").append(dealer);
        getAllHands().forEach((player, hands) -> {
            sb.append(player).append(" hands: ");
            hands.forEach((hand) -> sb.append(hand).append("\n"));
        });
        return sb.toString();
    }
    
}
