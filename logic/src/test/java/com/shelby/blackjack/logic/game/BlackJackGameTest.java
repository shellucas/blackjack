/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.blackjack.logic.game;

import com.shelby.blackjack.logic.betting.PlayerBet;
import com.shelby.blackjack.logic.cards.CardFactory;
import com.shelby.blackjack.logic.cards.Deck;
import com.shelby.blackjack.logic.cards.Shoe;
import com.shelby.blackjack.logic.cards.hands.Hand;
import com.shelby.blackjack.logic.users.BlackjackPlayer;
import com.shelby.blackjack.table.BlackjackTable;
import com.shellucas.casinoapi.bets.Bet;
import com.shellucas.casinoapi.bets.tables.BetPlacable;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shelby
 */
public class BlackJackGameTest {
    
    BlackjackGame game;
    
    Shoe shoe;
    
    List<Deck> decks;
    Deck deck1;
    Deck deck2;
    Deck deck3;

    BlackjackTable table;
    BlackjackPlayer dealerPlayer;
    Hand dealerHand;
    
    BlackjackPlayer player;
    
    
    
    public BlackJackGameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        table = new BlackjackTable(10000, 10);
        deck1 = new CardFactory().getCardCollection();
        deck2 = new CardFactory().getCardCollection();
        deck3 = new CardFactory().getCardCollection();
        // Just add deck1 for now
        decks.add(deck1);
        
        shoe = new Shoe(decks, 1);
        dealerPlayer = new BlackjackPlayer(10000, table);
        dealerHand = new Hand(dealerPlayer, null);
        
        player = new BlackjackPlayer(1000, table);
        
        game = new BlackjackGame(shoe, dealerHand, table);
        game.addPlayer(player);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void blackboxgame() {
        game.cycle();
    }

//    /**
//     * Test of getTable method, of class BlackJackGame.
//     */
//    @Test
//    public void testGetTable() {
//        System.out.println("getTable");
//        BlackJackGame instance = null;
//        BetPlacable expResult = null;
//        BetPlacable result = instance.getTable();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getShoe method, of class BlackJackGame.
//     */
//    @Test
//    public void testGetShoe() {
//        System.out.println("getShoe");
//        BlackJackGame instance = null;
//        Shoe expResult = null;
//        Shoe result = instance.getShoe();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDealer method, of class BlackJackGame.
//     */
//    @Test
//    public void testGetDealer() {
//        System.out.println("getDealer");
//        BlackJackGame instance = null;
//        Hand expResult = null;
//        Hand result = instance.getDealer();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addPlayer method, of class BlackJackGame.
//     */
//    @Test
//    public void testAddPlayer() {
//        System.out.println("addPlayer");
//        BlackjackPlayer player = null;
//        BlackJackGame instance = null;
//        boolean expResult = false;
//        boolean result = instance.addPlayer(player);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of cycle method, of class BlackJackGame.
//     */
//    @Test
//    public void testCycle() {
//        System.out.println("cycle");
//        BlackJackGame instance = null;
//        instance.cycle();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toString method, of class BlackJackGame.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        BlackJackGame instance = null;
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
