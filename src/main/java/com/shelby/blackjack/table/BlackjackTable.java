package com.shelby.blackjack.table;

import com.shelby.blackjack.logic.cards.hands.Hand;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shelby
 */
public class BlackjackTable {
    
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
        
        this.bets.add(bet);
    }
    
}
