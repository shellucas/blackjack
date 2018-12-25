/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.blackjack.logic.betting;

import com.shellucas.casinoapi.bets.Outcome;
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
public class PlayerBetTest {
    
    public PlayerBetTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAmount method, of class PlayerBet.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        PlayerBet instance = null;
        double expResult = 0.0;
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of winAmount method, of class PlayerBet.
     */
    @Test
    public void testWinAmount() {
        System.out.println("winAmount");
        PlayerBet instance = null;
        double expResult = 0.0;
        double result = instance.winAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loseAmount method, of class PlayerBet.
     */
    @Test
    public void testLoseAmount() {
        System.out.println("loseAmount");
        PlayerBet instance = null;
        double expResult = 0.0;
        double result = instance.loseAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PlayerBet.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PlayerBet instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of price method, of class PlayerBet.
     */
    @Test
    public void testPrice() {
        System.out.println("price");
        PlayerBet instance = null;
        double expResult = 0.0;
        double result = instance.price();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOutcome method, of class PlayerBet.
     */
    @Test
    public void testGetOutcome() {
        System.out.println("getOutcome");
        PlayerBet instance = null;
        Outcome expResult = null;
        Outcome result = instance.getOutcome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class PlayerBet.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        PlayerBet instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class PlayerBet.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        PlayerBet instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
