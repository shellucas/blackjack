package com.shelby.blackjack.logic.cards;

import com.shelby.blackjack.logic.cards.util.Ranks;
import com.shelby.blackjack.logic.cards.util.Suits;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author shelby
 */
public class Deck {

    private final Deque<Card> deck;

    /**
     * Creates a new Deck with 52 cards one each rank in each suit
     */
    public Deck() {
        this.deck = new ArrayDeque<>();
        for (Suits suit : Suits.values()) {
            for (Ranks rank : Ranks.values()) {
                deck.add(CardFactory.getCard(rank, suit));
            }
        }
    }
    
    /**
     * Shuffles the deck
     */
    public void shuffle() {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Draw a card from the top of the stack.
     * 
     * @return 
     */
    public Card draw() {
        return deck.removeLast();
    }
    
    /**
     * Place a card back at the beginning of the stack.
     * 
     * @param card 
     */
    public void returnCard(Card card) {
        deck.addFirst(card);
    }
    
    /**
     * Gets all cards in the deck while maintaining the current (perhaps shuffled)
     * order. Does not include cards that are not in the deck (e.g. on table).
     * 
     * @return Card list containing all cards currently in the deck.
     */
    public List<Card> getAllCards() {
        List<Card> cards = new ArrayList<>();
        cards.addAll(deck);
        return cards;
    }

    /**
     * Prints each card in deck in order on a new line.
     * 
     * @return 
     */
    @Override
    public String toString() {
        StringBuilder total = new StringBuilder();
        for (Iterator<Card> iter = deck.iterator(); iter.hasNext();) {
            total.append(iter.next().toString()).append("\n");
        }
        return total.toString();
    }
}
