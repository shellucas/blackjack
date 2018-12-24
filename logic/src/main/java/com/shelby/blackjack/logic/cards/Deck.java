package com.shelby.blackjack.logic.cards;

import com.shellucas.casinoapi.cards.Card;
import com.shellucas.casinoapi.cards.CardCollection;
import com.shellucas.casinoapi.cards.Ranks;
import com.shellucas.casinoapi.cards.Suits;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author shelby
 */
public class Deck implements CardCollection {

    private final Deque<DefaultCard> deck;

    /**
     * Creates a new Deck with 52 cards one each rank in each suit
     */
    Deck() {
        this.deck = new ArrayDeque<>();
        for (Suits suit : Suits.values()) {
            for (Ranks rank : Ranks.values()) {
                deck.add(new CardFactory().getCard(rank, suit));
            }
        }
    }

    /**
     * Shuffles the deck
     */
    public void shuffle() {
        throw new UnsupportedOperationException("You still need to implement the"
                + " shuffle method");
    }

    public Card draw() {
        return deck.removeLast();
    }

    /**
     * Place a card back at the beginning of the stack.
     *
     * @param card
     */
    public void returnCard(DefaultCard card) {
        deck.addFirst(card);
    }

    /**
     * Gets all cards in the deck while maintaining the current (perhaps
     * shuffled) order. Does not include cards that are not in the deck (e.g. on
     * table).
     *
     * @return DefaultCard list containing all cards currently in the deck.
     */
    public List<DefaultCard> getAllCards() {
        List<DefaultCard> cards = new ArrayList<>();
        cards.addAll(deck);
        return cards;
    }

    @Override
    public int size() {
        return deck.size();
    }

    @Override
    public List<Card> getCards() {
        return Arrays.asList((Card[]) deck.toArray());
    }

    /**
     * Prints each card in deck in order on a new line.
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder total = new StringBuilder();
        for (Iterator<DefaultCard> iter = deck.iterator(); iter.hasNext();) {
            total.append(iter.next().toString()).append("\n");
        }
        return total.toString();
    }

}
