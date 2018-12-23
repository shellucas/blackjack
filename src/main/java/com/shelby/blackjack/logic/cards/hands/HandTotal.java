package com.shelby.blackjack.logic.cards.hands;

import com.shelby.blackjack.logic.cards.Card;

/**
 *
 * @author shelby
 */
public abstract class HandTotal {

    private final Hand hand;

    public HandTotal(Hand hand) {
        this.hand = hand;
    }

    public Hand getHand() {
        return hand;
    }

    /**
     * Computes a total of all the cards in the associated hand. If card is not
     * None, omits the indicated card from the total.
     *
     * @param cardToOmit
     * @return
     */
    public abstract int total(Card cardToOmit);

}
