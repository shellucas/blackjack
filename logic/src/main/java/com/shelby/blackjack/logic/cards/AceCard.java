package com.shelby.blackjack.logic.cards;

import com.shelby.blackjack.logic.cards.hands.Hand;
import com.shellucas.casinoapi.cards.Ranks;
import com.shellucas.casinoapi.cards.Suits;

/**
 *
 * @author shelby
 */
public class AceCard extends DefaultCard {

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
    public boolean offerInsurance() {
        return true;
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
