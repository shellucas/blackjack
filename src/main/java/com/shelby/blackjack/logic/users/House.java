package com.shelby.blackjack.logic.users;

import com.shelby.blackjack.logic.cards.Card;
import com.shelby.blackjack.logic.cards.Deck;
import com.shelby.blackjack.logic.cards.hands.Hand;

/**
 *
 * @author shelby
 */
public class House implements User {

    private Hand hand;
    
    public House() {
    }

    @Override
    public Card hit(int i, Deck deck) {
        Card drawn = deck.draw();
//        this.hand.addCard(drawn);
        return drawn;
    }

    @Override
    public void discardHand() {
    }
}
