package com.shelby.blackjack.logic.users;

import com.shelby.blackjack.logic.cards.hands.Hand;

import com.shellucas.casinoapi.bets.Bet;
import com.shellucas.casinoapi.players.Player;

import java.util.ArrayList;
import java.util.List;
import com.shellucas.casinoapi.bets.tables.BetPlacable;
import com.shelby.blackjack.logic.cards.HandModifierCard;
import com.shelby.blackjack.table.BlackjackTable;

/**
 * Represents a blackjack player. In this case this class represents the default
 * behavior of a dealer. It is suitable to make use of inheritance to make new
 * strategy players(simulations) or real players by the use of this class.
 * 
 * @author shelby
 */
public class BlackjackPlayer implements Player {

    private final BetPlacable table;
    private List<Hand> hands;
    private double stake;

    public BlackjackPlayer(double stake, BlackjackTable table) {
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
     * Answer to requested even money.
     * @param hand
     * @return 
     */
    public boolean evenMoney(Hand hand) {
        return false;
    }

    /**
     * Answer to requested insurance.
     * @param hand
     * @return 
     */
    public boolean insurance(Hand hand) {
        return false;
    }

    /**
     * Split hand into two hands.
     * @param hand
     * @return 
     */
    public Hand split(Hand hand) {
        HandModifierCard removed = hand.removeLastCard();
        Hand splitHand = new Hand(this, hand.getBet(), removed);
        hands.add(splitHand);
        return splitHand;
    }

    /**
     * Player decides to double down the bets.
     * @param hand
     * @return 
     */
    public boolean doubleDown(Hand hand) {
        return false;
    }

    /**
     * Player decides to hit on the passed hand.
     * @param hand
     * @return 
     */
    public boolean hit(Hand hand) {
        return hand.value() < 17;
    }
    
    /**
     * Player decides not the hit.
     * @return 
     */
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
        setStake(getStake() + wonBet.winAmount());
        table.removeBet(wonBet);
    }

    @Override
    public void lose(Bet lostBet) {
        setStake(getStake() - lostBet.loseAmount());
        table.removeBet(lostBet);
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

    /**
     * Returns the current stake.
     * @return 
     */
    public double getStake() {
        return stake;
    }

    /**
     * Returns the table.
     * @return 
     */
    public BetPlacable getTable() {
        return table;
    }

    /**
     * Alters the stakes.
     * @param stake 
     */
    public void setStake(double stake) {
        this.stake = stake;
    }

    /**
     * Returns all Hands
     * @return 
     */
    public List<Hand> getHands() {
        return hands;
    }

    /**
     * Returns the first hand of the player (most often used unless split).
     * 
     * @return 
     */
    public Hand getFirstHand() {
        return hands.get(0);
    }

}
