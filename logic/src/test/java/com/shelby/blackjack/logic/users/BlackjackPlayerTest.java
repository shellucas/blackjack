/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.blackjack.logic.users;

import com.shelby.blackjack.logic.betting.BlackjackOutcome;
import com.shelby.blackjack.logic.betting.PlayerBet;
import com.shelby.blackjack.logic.cards.CardFactory;
import com.shelby.blackjack.logic.cards.HandModifierCard;
import com.shelby.blackjack.logic.cards.hands.Hand;
import com.shelby.blackjack.table.BlackjackTable;
import com.shellucas.casinoapi.bets.Bet;
import com.shellucas.casinoapi.bets.Outcome;
import com.shellucas.casinoapi.bets.factories.AbstractCardFactory;
import com.shellucas.casinoapi.bets.tables.BetPlacable;
import com.shellucas.casinoapi.cards.Ranks;
import com.shellucas.casinoapi.cards.Suits;
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
public class BlackjackPlayerTest {
    
    BlackjackPlayer player;
    BlackjackTable table;
    Outcome outcome;
    Bet bet;
    CardFactory factory;
    
    public BlackjackPlayerTest() {
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
        player = new BlackjackPlayer(1000, table);
        outcome = new BlackjackOutcome("Test 3:1", 3);
        bet = new PlayerBet(20, outcome, player);
        factory = new CardFactory();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of newGame method, of class BlackjackPlayer.
     */
    @Test
    public void testNewGame() {
        System.out.println("newGame");
        
        // Placing a bet adds a hand.
        player.placeBets(new PlayerBet(20, new BlackjackOutcome("RED", 3), player));
        int exp = 1;
        int result = player.getHands().size();
        assertEquals(exp, result);
        
        // New Game resets hands.
        player.newGame();
        exp = 0;
        result = player.getHands().size();
        assertEquals(exp, result);
    }

    /**
     * Test of split method, of class BlackjackPlayer.
     */
    @Test
    public void testSplit() {
        System.out.println("split");
        player.placeBets(bet);
        int exp = 1;
        int result = player.getHands().size();
        assertEquals(exp, result);
        
        assertTrue(player.getFirstHand() != null);
        player.getFirstHand().addAndRecalculateHand(factory.getCard(Ranks.JACK, Suits.CLUBS));
        player.getFirstHand().addAndRecalculateHand(factory.getCard(Ranks.JACK, Suits.DIAMONDS));
        player.split(player.getFirstHand());
        exp = 2;
        result = player.getHands().size();
        assertEquals(exp, result);
        
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of hit method, of class BlackjackPlayer.
     */
    @Test
    public void testHit() {
        System.out.println("hit");
        Hand hand = null;
        BlackjackPlayer instance = null;
        boolean expResult = false;
        boolean result = instance.hit(hand);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of standPat method, of class BlackjackPlayer.
     */
    @Test
    public void testStandPat() {
        System.out.println("standPat");
        BlackjackPlayer instance = null;
        boolean expResult = false;
        boolean result = instance.standPat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPlaying method, of class BlackjackPlayer.
     */
    @Test
    public void testIsPlaying() {
        System.out.println("isPlaying");
        BlackjackPlayer instance = null;
        boolean expResult = false;
        boolean result = instance.isPlaying();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of placeBets method, of class BlackjackPlayer.
     */
    @Test
    public void testPlaceBets() {
        System.out.println("placeBets");
        Bet bet = null;
        BlackjackPlayer instance = null;
        instance.placeBets(bet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of win method, of class BlackjackPlayer.
     */
    @Test
    public void testWin() {
        System.out.println("win");
        Bet wonBet = null;
        BlackjackPlayer instance = null;
        instance.win(wonBet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lose method, of class BlackjackPlayer.
     */
    @Test
    public void testLose() {
        System.out.println("lose");
        Bet lostBet = null;
        BlackjackPlayer instance = null;
        instance.lose(lostBet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class BlackjackPlayer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BlackjackPlayer instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStake method, of class BlackjackPlayer.
     */
    @Test
    public void testGetStake() {
        System.out.println("getStake");
        BlackjackPlayer instance = null;
        double expResult = 0.0;
        double result = instance.getStake();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTable method, of class BlackjackPlayer.
     */
    @Test
    public void testGetTable() {
        System.out.println("getTable");
        BlackjackPlayer instance = null;
        BetPlacable expResult = null;
        BetPlacable result = instance.getTable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStake method, of class BlackjackPlayer.
     */
    @Test
    public void testSetStake() {
        System.out.println("setStake");
        double stake = 0.0;
        BlackjackPlayer instance = null;
        instance.setStake(stake);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHands method, of class BlackjackPlayer.
     */
    @Test
    public void testGetHands() {
        System.out.println("getHands");
        BlackjackPlayer instance = null;
        List<Hand> expResult = null;
        List<Hand> result = instance.getHands();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
