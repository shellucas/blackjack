package com.shelby.blackjack.logic.betting;

import com.shellucas.casinoapi.bets.Outcome;
import java.util.Objects;

/**
 *
 * @author shelby
 */
public class BlackjackOutcome implements Outcome {

    /**
     * String representation of the outcome of the bet (e.g. 1, "black" "all in")
     */
    private final String name;

    /**
     * Numerator for odds, where the assumed denominator is 1. Hence, the field
     * would be initialized to 10 if the odds where 10:1 ( numerator :
     * denominator ).
     */
    private int odds;
    
    public BlackjackOutcome(String name, int odds) {
        this.name = name;
        this.odds = odds;
    }

    public String getName() {
        return name;
    }
    
    public int getOdds() {
        return odds;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null) { return false; }
        if (getClass() != obj.getClass()) { return false; }
        final BlackjackOutcome other = (BlackjackOutcome) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "The odds of placing on " + this.name + " are 1:" + this.odds;
    }

    @Override
    public double winAmount(double betAmount) {
        return betAmount * this.odds;
    }

    @Override
    public int compareTo(Outcome o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void alterOdds(int numerator) {
        this.odds = numerator;
    }
    
}
