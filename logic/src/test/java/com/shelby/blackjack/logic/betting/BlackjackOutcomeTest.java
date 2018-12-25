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
    
    BlackjackOutcome outcome;
    final String name = "TestOutcome1";
    final int odds = 3;
    
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
        this.outcome = new BlackjackOutcome(name, odds);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class BlackjackOutcome.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        System.out.println(outcome);
        String expResult = "The odds of placing on TestOutcome1 are 1:3";
        String result = outcome.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of winAmount method, of class BlackjackOutcome.
     */
    @Test
    public void testWinAmount() {
        System.out.println("winAmount");
        double betAmount = 20.0;
        double expResult = 60.0;
        double result = outcome.winAmount(betAmount);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of alterOdds method, of class BlackjackOutcome.
     */
    @Test
    public void testAlterOdds() {
        System.out.println("alterOdds");
        double betAmount = 20.0;
        double expResult = 60.0;
        double result = outcome.winAmount(betAmount);
        assertEquals(expResult, result, 0.0);
        
        outcome.alterOdds(5);
        expResult = 100.0;
        result = outcome.winAmount(betAmount);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
