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
        total = super.getHand().getCards()
                .stream()
                .filter((card) -> card != cardToOmit)
                .map((card) -> card.softValue())
                .reduce(total, Integer::sum);
        return total;
    }
    
}
