package com.shelby.blackjack.logic.game;

import com.shelby.blackjack.logic.cards.DefaultCard;
import com.shelby.blackjack.logic.cards.Shoe;
import com.shelby.blackjack.logic.cards.hands.Hand;
import com.shelby.blackjack.logic.users.BlackjackPlayer;
import com.shelby.blackjack.table.BlackjackTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author shelby
 */
public class BlackJackGame {

    private BlackjackTable table;
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
    public BlackJackGame(Shoe shoe, Hand dealer) {
        this.shoe = shoe;
        this.players = new ArrayList<>();
        this.table = new BlackjackTable(1000, 10);
        this.dealer = dealer;
        this.dealerIsBust = false;
    }

    public BlackJackGame(Shoe shoe, Hand dealer, BlackjackTable table) {
        this(shoe, dealer);
        this.table = table;
    }

    public BlackjackTable getTable() {
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

    public void cycle() {
        dealPlayers();
        dealToDealer();
        getInsurances();
        getSplits();
        fillHands();
        // TODO 7 Resolve ante bets if dealer busts
        
        
        // TODO 8 Resolve compare bets
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
            getAllHands().forEach((player, hands) -> {
                hands.forEach((hand) -> {
                    player.insurance(hand);
                });
            });
        }
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
     * @param player
     * @param hand 
     */
    private void offerChoices(BlackjackPlayer player, Hand hand) {
        while (true) {
            if (hand.busted()) { break; }
            if (player.hit(hand)) { hand.addAndRecalculateHand(shoe.deal()); } 
            else if (player.standPat()) { break; }
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
            for (Hand hand : hands) {
                if (!hand.busted() && ) {
                    
                }
            }
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

}
