package com.shelby.blackjack.logic.users;

import com.shelby.blackjack.logic.cards.DefaultCard;
import com.shelby.blackjack.logic.cards.hands.Hand;
import com.shellucas.casinoapi.bets.Bet;
import com.shellucas.casinoapi.bets.tables.BetPlacer;
import com.shellucas.casinoapi.cards.Card;
import com.shellucas.casinoapi.players.Player;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shelby
 */
public class BlackjackPlayer extends Player{

    private List<Hand> hands;
    
    public BlackjackPlayer(double stake, int roundsToGo, BetPlacer table) {
        super(stake, roundsToGo, table);
        hands = new ArrayList<>();
    }
    
    public void newGame() {
        hands = new ArrayList<>();
    }
    
    public Hand getFirstHand() {
        return hands.get(0);
    }

    public List<Hand> getHands() {
        return hands;
    }
    
    public boolean evenMoney(Hand hand) {
        return false;
    }
    
    public boolean insurance(Hand hand) {
        return false;
    }
    
    public Hand split(Hand hand, Bet bet) {
        Card removed = hand.removeLastCard();
        Hand splitHand = new Hand(this, bet, (DefaultCard) removed);
        return splitHand;
    }
    
    public boolean doubleDown(Hand hand) {
        return false;
    }
    
    public boolean hit(Hand hand) {
        return hand.value() < 17;
    }

    @Override
    public boolean isPlaying() {
        return true;
    }

    @Override
    public void placeBets(Bet bet) {
        hands.add(new Hand(this, bet));
        super.getTable().placeBet(bet);
    }

    @Override
    public void win(Bet wonBet) {
        super.setStake(super.getStake() + wonBet.getAmount());
    }

    @Override
    public void lose(Bet lostBet) {
        super.setStake(super.getStake() - lostBet.getAmount());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb = (isPlaying()) 
                ? sb.append("Player is active") : sb.append("Player is not active.");
        sb.append("Player's stake: ")
                .append(super.getStake())
                .append("\n");
        sb.append("Current hands: ").append("\n");
        for (Hand hand : hands) { sb.append(hand).append("\n"); }
        return sb.toString();
    }

}
