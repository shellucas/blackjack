/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.blackjack.logic.cards;

import com.shelby.blackjack.logic.betting.BlackjackOutcome;
import com.shelby.blackjack.logic.betting.PlayerBet;
import com.shelby.blackjack.logic.cards.hands.Hand;
import com.shelby.blackjack.logic.users.BlackjackPlayer;
import com.shelby.blackjack.table.BlackjackTable;
import com.shellucas.casinoapi.cards.Ranks;
import com.shellucas.casinoapi.cards.Suits;
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
public class DefaultCardTest {
    
    DefaultCard card;
    
    public DefaultCardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        card = new DefaultCard(Suits.SPADES, Ranks.TWO);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of softValue method, of class DefaultCard.
     */
    @Test
    public void testSoftValue() {
 
        System.out.println("softValue");
        int expResult = 2;
        int result = card.softValue();
        assertEquals(expResult, result);
        
        card = new DefaultCard(Suits.CLUBS, Ranks.TEN);
        expResult = 10;
        result = card.softValue();
        assertEquals(expResult, result);
        
        card = new DefaultCard(Suits.CLUBS, Ranks.JACK);
        expResult = 11;
        result = card.softValue();
        assertEquals(expResult, result);
        
        card = new DefaultCard(Suits.CLUBS, Ranks.KING);
        expResult = 13;
        result = card.softValue();
        assertEquals(expResult, result);
        
        card = new DefaultCard(Suits.CLUBS, Ranks.ACE);
        expResult = 1;
        result = card.softValue();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of hardValue method, of class DefaultCard.
     */
    @Test
    public void testHardValue() {
        System.out.println("hardValue");
        int expResult = 2;
        int result = card.hardValue();
        assertEquals(expResult, result);
        
        card = new DefaultCard(Suits.CLUBS, Ranks.TEN);
        expResult = 10;
        result = card.hardValue();
        assertEquals(expResult, result);
        
        card = new DefaultCard(Suits.CLUBS, Ranks.JACK);
        expResult = 11;
        result = card.hardValue();
        assertEquals(expResult, result);
        
        card = new DefaultCard(Suits.CLUBS, Ranks.KING);
        expResult = 13;
        result = card.hardValue();
        assertEquals(expResult, result);
        
        card = new DefaultCard(Suits.CLUBS, Ranks.ACE);
        expResult = 1;
        result = card.hardValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    /**
     * Test of setAltTotal method, of class DefaultCard.
     */
    @Test
    public void testSetAltTotal() {
        System.out.println("setAltTotal");
        Hand hand = new Hand(
                new BlackjackPlayer(1000, new BlackjackTable())
                , new PlayerBet(10, new BlackjackOutcome("Test", 10)
                , new BlackjackPlayer(1000, new BlackjackTable())));
        card.setAltTotal(hand);
        
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
