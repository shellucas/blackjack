package com.shelby.blackjack.logic.cards.hands;

import com.shelby.blackjack.logic.cards.Card;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shelby
 */
public class Hand {

    private final List<Card> cards;
    public HandHardTotal hard;
    public HandSoftTotal soft;
    private HandTotal altTotal;

    public Hand() {
        this.cards = new ArrayList<>();
        hard = new HandHardTotal(this);
        soft = new HandSoftTotal(this);
        altTotal = hard;
    }

    /**
     * Adds the passed card to the hand.
     *
     * @param card
     */
    public Hand(Card card) {
        this();
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
    public final void addAndRecalculate(Card cardToAdd) {
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
     * Amount of cards in the hand.
     * 
     * @return 
     */
    public int size() {
        return this.cards.size();
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
    
    /**
     * Returns all cards in the hand as a list.
     * 
     * @return 
     */
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
        for (Card card : this.cards) {
            sb.append(card).append("\n");
        }
        return sb.toString();
    }

}
