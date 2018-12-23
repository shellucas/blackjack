package com.shelby.blackjack.logic.cards.hands;

import com.shelby.blackjack.logic.cards.DefaultCard;
import com.shellucas.casinoapi.bets.Bet;
import com.shellucas.casinoapi.cards.Card;
import com.shellucas.casinoapi.cards.CardCollection;
import com.shellucas.casinoapi.players.Player;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shelby
 */
public class Hand implements CardCollection {

    private final List<Card> cards;
    public HandHardTotal hard;
    public HandSoftTotal soft;
    private HandTotal altTotal;
    private Bet ante;
    private Player owner;
    private boolean splitDeclined;

    public Hand(Player owner, Bet ante) {
        this.cards = new ArrayList<>();
        hard = new HandHardTotal(this);
        soft = new HandSoftTotal(this);
        altTotal = hard;
        this.ante = ante;
        this.owner = owner;
        this.splitDeclined = false;
    }

    /**
     * Adds the passed card to the hand.
     *
     * @param owner
     * @param ante
     * @param card
     */
    public Hand(Player owner, Bet ante, DefaultCard card) {
        this(owner, ante);
        this.addAndRecalculate(card);
    }

    /**
     * Sets the alt total to the passed hand total.
     *
     * @param handTotal
     */
    public void setAltTotal(HandTotal handTotal) {
        this.altTotal = handTotal;
    }

    /**
     * Adds a card to the hand and recalculates the total.
     *
     * @param cardToAdd
     */
    public final void addAndRecalculate(DefaultCard cardToAdd) {
        this.cards.add(cardToAdd);
        cardToAdd.setAltTotal(this);
    }

    /**
     * Calculates soft or hard total depending on current state.
     * 
     * @return 
     */
    public int value() {
        return this.altTotal.total(null);
    }

    /**
     * Checks if there are exactly 2 cards in hand and if the sum is 21.
     * 
     * @return 
     */
    public boolean blackjack() {
        return this.size() == 2 && this.value() == 21;
    }

    /**
     * Checks if the value of the hand is over 21.
     * 
     * @return 
     */
    public boolean busted() {
        return this.value() > 21;
    }
    
    public Card removeLastCard() {
        return this.getCards().remove(this.getCards().size() - 1);
    }
    
    public void setSplitDeclined() {
        this.splitDeclined = true;
    }
    
    public boolean splittable() {
        if (cards.size() != 2) { 
            setSplitDeclined();
            return false;
        } 
        return cards.get(0).getRANK() == cards.get(1).getRANK();
    }
    
    public Card getUpCard() {
        return this.cards.get(0);
    }

    public Bet getBet() {
        return ante;
    }

    public void setBet(Bet ante) {
        this.ante = ante;
    }

    /**
     * Amount of cards in the hand.
     * 
     * @return 
     */
    @Override
    public int size() {
        return this.cards.size();
    }
    
    /**
     * Returns all cards in the hand as a list.
     * 
     * @return 
     */
    @Override
    public List<Card> getCards() {
        return this.cards;
    }
    
    /**
     * Returns a string containing every card in the hand on a new line.
     * 
     * @return 
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        this.cards.forEach((card) -> sb.append(card).append("\n") );
        return sb.toString();
    }

}
