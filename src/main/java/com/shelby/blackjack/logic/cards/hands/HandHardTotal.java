package com.shelby.blackjack.logic.cards.hands;

import com.shelby.blackjack.logic.cards.DefaultCard;

/**
 *
 * @author shelby
 */
public class HandHardTotal extends HandTotal {

    public HandHardTotal(Hand hand) {
        super(hand);
    }

    @Override
    public int total(DefaultCard cardToOmit) {
        return super.getHand().getCards()
                .stream()
                .map(c -> (DefaultCard) c)
                .filter((card) -> card != cardToOmit)
                .mapToInt((card) -> card.hardValue())
                .sum();
    }

}
