package com.shelby.blackjack.table;

import com.shelby.blackjack.logic.cards.hands.Hand;
import com.shellucas.casinoapi.bets.Bet;
import java.util.ArrayList;
import java.util.List;
import com.shellucas.casinoapi.bets.tables.BetPlacable;

/**
 *
 * @author shelby
 */
public class BlackjackTable implements BetPlacable {
    
    /**
     * Limit for sum of a player's bets.
     */
    private double limit;
    
    /**
     * Minimum amount for a player's single bet.
     */
    private double minimum;

    private List<Bet> bets;
    
    public BlackjackTable() {
        this.bets = new ArrayList<>();
    }
    
    public BlackjackTable(double limit, double minimum) {
        this();
        this.limit = limit;
        this.minimum = minimum;
    }
    
    public void placeBet(Bet bet, Hand hand) {
        hand.setBet(bet);
        this.bets.add(bet);
    }

    @Override
    public double getLimit() {
        return this.limit;
    }

    @Override
    public double getMinimum() {
        return this.minimum;
    }

    @Override
    public void placeBet(Bet bet) {
        bets.add(bet);
    }
    
    @Override
    public Bet removeBet(Bet bet) {
        bets.remove(bet);
        return bet;
    }
    
}
