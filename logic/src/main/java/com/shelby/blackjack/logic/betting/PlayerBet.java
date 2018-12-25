package com.shelby.blackjack.logic.betting;

import com.shellucas.casinoapi.bets.Bet;
import com.shellucas.casinoapi.bets.Outcome;
import com.shellucas.casinoapi.players.Player;
import java.util.Objects;

/**
 *
 * @author shelby
 */
public class PlayerBet implements Bet {

    private final double amount;
    private final Outcome outcome;
    private final Player player;

    public PlayerBet(double amount, Outcome outcome, Player player) {
        this.amount = amount;
        this.outcome = outcome;
        this.player = player;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public double winAmount() {
        return outcome.winAmount(amount) + amount;
    }

    @Override
    public double loseAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return amount + " on " + outcome;
    }

    @Override
    public double price() {
        return amount;
    }

    @Override
    public Outcome getOutcome() {
        return this.outcome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.outcome);
        hash = 53 * hash + Objects.hashCode(this.player);
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
        final PlayerBet other = (PlayerBet) obj;
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        if (!Objects.equals(this.outcome, other.outcome)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        return true;
    }
    
    

}
