package com.shelby.blackjack.logic.cards.hands;

import com.shelby.blackjack.logic.cards.Card;

/**
 *
 * @author shelby
 */
public class HandSoftTotal extends HandTotal {

    public HandSoftTotal(Hand hand) {
        super(hand);
    }

    @Override
    public int total(Card cardToOmit) {
        int total = 0;
        for (Card card : super.getHand().getCards()) {
            if (card != cardToOmit) total += card.softValue();
        }
        return total;
    }
    
}
