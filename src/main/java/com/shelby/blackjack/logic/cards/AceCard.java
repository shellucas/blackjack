package com.shelby.blackjack.logic.cards;

import com.shelby.blackjack.logic.cards.hands.Hand;
import com.shelby.blackjack.logic.cards.util.Ranks;
import com.shelby.blackjack.logic.cards.util.Suits;

/**
 *
 * @author shelby
 */
public class AceCard extends Card {

    public AceCard(Suits SUIT, Ranks RANK) {
        super(SUIT, RANK);
    }
    
    @Override
    public void setAltTotal(Hand hand) {
        int totalExclThisCard = hand.soft.total(this);
        if (totalExclThisCard + this.softValue() > 21) {
            hand.setAltTotal(hand.hard);
        } else {
            hand.setAltTotal(hand.soft);
        }
    }

    @Override
    public int softValue() {
        return 11;
    }
    
    @Override
    public int hardValue() {
        return 1;
    }

}
