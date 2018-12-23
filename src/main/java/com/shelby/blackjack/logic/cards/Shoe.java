package com.shelby.blackjack.logic.cards;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

/**
 *
 * @author shelby
 */
public class Shoe {
    
    private final Deque<Card> shoe;
    
    /**
     * Shoe contains N amount of decks where 0 < N < 9.
     * 
     * @param decks
     * @param stopDeal
     */
    public Shoe(List<Deck> decks, int stopDeal) {
        if (decks.size() < 1 || decks.size() > 8) {
            throw new IllegalArgumentException("Shoe can only contain N amount "
                    + "of decks where 0 < N < 9.");
        }
        
        this.shoe = new ArrayDeque<>();
        for (Deck deck : decks) { shoe.addAll(deck.getAllCards()); }
    }
    
    /**
     * Adds the deck to the list of decks.
     * @param deck 
     */
    public void addDeck(Deck deck) {
        shoe.addAll(deck.getAllCards());
    }
    
    /**
     * Draws a card from the top of the stack.
     * 
     * @return drawn card
     */
    public Card deal() {
        return shoe.getLast();
    }
    
    /**
     * Adds a card back to the shoe.
     * 
     * @param card 
     */
    public void returnCard(Card card) {
        shoe.addFirst(card);
    }
    
    /**
     * Shuffles the shoe
     */
    public void shuffle() {
        Collections.shuffle(Arrays.asList(shoe));
    }
    
    
    
}
