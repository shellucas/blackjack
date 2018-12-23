package com.shelby.blackjack.logic.cards;

import com.shelby.blackjack.logic.cards.util.Ranks;
import com.shelby.blackjack.logic.cards.util.Suits;

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
    public static Card getCard(Ranks rank, Suits suit) {
        switch (rank) {
            case ACE:
                return new AceCard(suit, rank);
            case JACK:
            case QUEEN:
            case KING:
                return new FaceCard(suit, rank);
            default:
                return new Card(suit, rank);
        }
    }

}
