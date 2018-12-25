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
public class BlackjackOutcomeTest {
    
    public BlackjackOutcomeTest() {
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
     * Test of getName method, of class BlackjackOutcome.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        BlackjackOutcome instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOdds method, of class BlackjackOutcome.
     */
    @Test
    public void testGetOdds() {
        System.out.println("getOdds");
        BlackjackOutcome instance = null;
        int expResult = 0;
        int result = instance.getOdds();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class BlackjackOutcome.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        BlackjackOutcome instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class BlackjackOutcome.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        BlackjackOutcome instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class BlackjackOutcome.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BlackjackOutcome instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of winAmount method, of class BlackjackOutcome.
     */
    @Test
    public void testWinAmount() {
        System.out.println("winAmount");
        double betAmount = 0.0;
        BlackjackOutcome instance = null;
        double expResult = 0.0;
        double result = instance.winAmount(betAmount);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class BlackjackOutcome.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Outcome o = null;
        BlackjackOutcome instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterOdds method, of class BlackjackOutcome.
     */
    @Test
    public void testAlterOdds() {
        System.out.println("alterOdds");
        int numerator = 0;
        BlackjackOutcome instance = null;
        instance.alterOdds(numerator);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
