package com.shelby.blackjack.logic.cards;

import com.shellucas.casinoapi.cards.Ranks;
import com.shellucas.casinoapi.cards.Suits;

/**
 *
 * @author shelby
 */
public class FaceCard extends DefaultCard {

    public FaceCard(Suits SUIT, Ranks RANK) {
        super(SUIT, RANK);
    }

    @Override
    public int softValue() {
        return 10;
    }
    
    @Override
    public int hardValue() {
        return 10;
    }

}
