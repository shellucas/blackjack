package com.shelby.blackjack.logic.game;

import com.shelby.blackjack.logic.cards.Shoe;
import com.shelby.blackjack.logic.cards.hands.Hand;
import com.shelby.blackjack.table.BlackjackTable;
import com.shellucas.casinoapi.players.Player;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shelby
 */
public class BlackJackGame {

    private BlackjackTable table;
    private Shoe shoe;
    private Hand dealer;
    private List<BlackJackPlayer> players;

    /**
     * Default game with a maximum accumulation of bets of 10000 and a minimum
     * bet of 10.
     *
     * @param shoe
     * @param dealer
     */
    public BlackJackGame(Shoe shoe, Hand dealer) {
        this.table = new BlackjackTable(1000, 10);
        this.shoe = shoe;
        this.dealer = dealer;
        this.players = new ArrayList<>();
    }
    
    public BlackJackGame(Shoe shoe, Hand dealer, double limit, double minimum) {
        this(shoe, dealer);
        this.table = new BlackjackTable(limit, minimum);
    }

    public BlackjackTable getTable() {
        return table;
    }

    public Shoe getShoe() {
        return shoe;
    }

    public Hand getDealer() {
        return dealer;
    }
    
    public void start() {
        for (BlackJackPlayer player : players) {
       
        }
    }
    
    

}
