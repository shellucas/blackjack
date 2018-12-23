package com.shelby.blackjack.logic.users;

import com.shelby.blackjack.logic.cards.DefaultCard;
import com.shelby.blackjack.logic.cards.Deck;
import com.shelby.blackjack.logic.cards.hands.Hand;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author shelby
 */
public class Player implements User {
    
    private final String name;
    private List<Hand> hands;
    
    /**
     * Generates a random guest name.
     */
    public Player() {
        this.name = "Guest " + (1000 + new Random().nextInt(10000));
        this.hands = new ArrayList<>();
    }
    
    public Player(String name) {
        this.name = name;
        this.hands = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    /**
     * Draws card from the deck.Adds card to the players hand.
     * Returns the drawn card.
     * 
     * @param i
     * @param deck to hit from.
     * @return drawn card.
     */
    @Override
    public DefaultCard hit(int i, Deck deck) {
        DefaultCard card = deck.draw();
        hands.get(i).addAndRecalculate(card);
        return card;
    }
    
    @Override
    public void discardHand() {
        this.hands = new ArrayList<>();
    }

    
}
