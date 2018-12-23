package com.shelby.blackjack.logic.cards;

import com.shellucas.casinoapi.bets.factories.AbstractCardFactory;
import com.shellucas.casinoapi.cards.Ranks;
import com.shellucas.casinoapi.cards.Suits;

/**
 *
 * @author shelby
 */
public class CardFactory implements AbstractCardFactory {
    
    /**
     * Default factory for creating cards of rank and suit.
     * 
     * @param rank
     * @param suit
     * @return 
     */
    @Override
    public DefaultCard getCard(Ranks rank, Suits suit) {
        switch (rank) {
            case ACE:
                return new AceCard(suit, rank);
            case JACK:
            case QUEEN:
            case KING:
                return new FaceCard(suit, rank);
            default:
                return new DefaultCard(suit, rank);
        }
    }

}
