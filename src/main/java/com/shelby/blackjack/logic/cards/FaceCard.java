package com.shelby.blackjack.logic.cards;

import com.shelby.blackjack.logic.cards.util.Ranks;
import com.shelby.blackjack.logic.cards.util.Suits;

/**
 *
 * @author shelby
 */
public class FaceCard extends Card {

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
