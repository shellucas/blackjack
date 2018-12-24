package com.shelby.blackjack.logic.betting;

import com.shellucas.casinoapi.bets.Bet;
import com.shellucas.casinoapi.bets.Outcome;
import com.shellucas.casinoapi.players.Player;

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

}
