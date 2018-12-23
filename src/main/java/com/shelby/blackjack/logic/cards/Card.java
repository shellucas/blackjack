package com.shelby.blackjack.logic.cards;

import com.shelby.blackjack.logic.cards.hands.Hand;
import com.shelby.blackjack.logic.cards.util.Ranks;
import com.shelby.blackjack.logic.cards.util.Suits;
import java.util.Objects;

/**
 *
 * @author shelby
 */
public class Card {
    
    private final Ranks RANK;
    private final Suits SUIT;

    public Card(Suits SUIT, Ranks RANK) {
        this.SUIT = SUIT;
        this.RANK = RANK;
    }
    
    /**
     * Sets the alt total of the hand depending on the sum of the cards including
     * this card. If the soft value of the hand plus the soft value of this card
     * 
     * 
     * @param hand 
     */
    public void setAltTotal(Hand hand) {
        int totalExclThisCard = hand.soft.total(this);
        if (totalExclThisCard + this.softValue() > 21) {
            hand.setAltTotal(hand.hard);
        }
    }

    public int softValue() {
        return this.RANK.getRank();
    }   
    
    public int hardValue() {
        return this.RANK.getRank();
    }

    public Ranks getRANK() {
        return this.RANK;
    }
    
    public Suits getSUIT() {
        return this.SUIT;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.RANK);
        hash = 47 * hash + Objects.hashCode(this.SUIT);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Card other = (Card) obj;
        return this.RANK == other.RANK && this.SUIT == other.SUIT;
    }

    @Override
    public String toString() {
        return this.RANK + " of " + this.SUIT;
    }
}
