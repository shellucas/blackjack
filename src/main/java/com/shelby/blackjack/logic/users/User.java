/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.blackjack.logic.users;

import com.shelby.blackjack.logic.cards.Card;
import com.shelby.blackjack.logic.cards.Deck;

/**
 *
 * @author shelby
 */
public interface User {
    
    /**
     * Draw a card from a deck.
     * @param hand
     * @param deck
     * @return drawn card.
     */
    Card hit(int hand, Deck deck);
    
    /**
     * Reset hand to a fresh new hand
     */
    void discardHand();
    
}
