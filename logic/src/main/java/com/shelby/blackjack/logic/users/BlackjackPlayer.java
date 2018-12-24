package com.shelby.blackjack.logic.users;

import com.shelby.blackjack.logic.cards.hands.Hand;

import com.shellucas.casinoapi.bets.Bet;
import com.shellucas.casinoapi.players.Player;

import java.util.ArrayList;
import java.util.List;
import com.shellucas.casinoapi.bets.tables.BetPlacable;
import com.shelby.blackjack.logic.cards.HandModifierCard;

/**
 *
 * @author shelby
 */
public class BlackjackPlayer implements Player {

    private double stake;
    private BetPlacable table;
    private List<Hand> hands;

    public BlackjackPlayer(double stake, BetPlacable table) {
        this.stake = stake;
        this.table = table;
        this.hands = new ArrayList<>();
    }

    /**
     * Resets the hands of the player
     */
    public void newGame() {
        hands = new ArrayList<>();
    }
    
    /**
     * Returns the first hand of the player (most often used unless split).
     * 
     * @return 
     */
    public Hand getFirstHand() {
        return hands.get(0);
    }

    public boolean evenMoney(Hand hand) {
        return false;
    }

    public boolean insurance(Hand hand) {
        return false;
    }

    public Hand split(Hand hand) {
        HandModifierCard removed = hand.removeLastCard();
        Hand splitHand = new Hand(this, hand.getBet(), removed);
        hands.add(splitHand);
        return splitHand;
    }

    public boolean doubleDown(Hand hand) {
        return false;
    }

    public boolean hit(Hand hand) {
        return hand.value() < 17;
    }
    
    public boolean standPat() {
        return true;
    }

    @Override
    public boolean isPlaying() {
        return true;
    }

    @Override
    public void placeBets(Bet bet) {
        hands.add(new Hand(this, bet));
        getTable().placeBet(bet);
    }

    @Override
    public void win(Bet wonBet) {
        setStake(getStake() + wonBet.getAmount());
    }

    @Override
    public void lose(Bet lostBet) {
        setStake(getStake() - lostBet.getAmount());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb = (isPlaying())
                ? sb.append("Player is active") : sb.append("Player is not active.");
        sb.append("Player's stake: ")
                .append(getStake())
                .append("\n");
        sb.append("Current hands: ").append("\n");
        for (Hand hand : hands) { sb.append(hand).append("\n"); }
        return sb.toString();
    }

    public double getStake() {
        return stake;
    }

    public BetPlacable getTable() {
        return table;
    }

    public void setStake(double stake) {
        this.stake = stake;
    }

    public void setTable(BetPlacable table) {
        this.table = table;
    }
    
    public List<Hand> getHands() {
        return hands;
    }

}
