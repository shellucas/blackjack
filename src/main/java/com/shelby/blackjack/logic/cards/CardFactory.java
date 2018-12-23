package com.shelby.blackjack.logic.cards;

import com.shellucas.casinoapi.cards.Ranks;
import com.shellucas.casinoapi.cards.Suits;

/**
 *
 * @author shelby
 */
public interface CardFactory {
    
    /**
     * Default factory for creating cards of rank and suit.
     * 
     * @param rank
     * @param suit
     * @return 
     */
    public static DefaultCard getCard(Ranks rank, Suits suit) {
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
