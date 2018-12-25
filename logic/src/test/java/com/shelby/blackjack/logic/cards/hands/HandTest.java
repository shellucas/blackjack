/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.blackjack.logic.cards.hands;

import com.shelby.blackjack.logic.cards.HandModifierCard;
import com.shelby.blackjack.logic.users.BlackjackPlayer;
import com.shellucas.casinoapi.bets.Bet;
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
public class HandTest {
    
    public HandTest() {
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
     * Test of addAndRecalculateHand method, of class Hand.
     */
    @Test
    public void testAddAndRecalculateHand() {
        System.out.println("addAndRecalculateHand");
        HandModifierCard cardToAdd = null;
        Hand instance = null;
        instance.addAndRecalculateHand(cardToAdd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of value method, of class Hand.
     */
    @Test
    public void testValue() {
        System.out.println("value");
        Hand instance = null;
        int expResult = 0;
        int result = instance.value();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of blackjack method, of class Hand.
     */
    @Test
    public void testBlackjack() {
        System.out.println("blackjack");
        Hand instance = null;
        boolean expResult = false;
        boolean result = instance.blackjack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of busted method, of class Hand.
     */
    @Test
    public void testBusted() {
        System.out.println("busted");
        Hand instance = null;
        boolean expResult = false;
        boolean result = instance.busted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLastCard method, of class Hand.
     */
    @Test
    public void testRemoveLastCard() {
        System.out.println("removeLastCard");
        Hand instance = null;
        HandModifierCard expResult = null;
        HandModifierCard result = instance.removeLastCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class Hand.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Hand instance = null;
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of splittable method, of class Hand.
     */
    @Test
    public void testSplittable() {
        System.out.println("splittable");
        Hand instance = null;
        boolean expResult = false;
        boolean result = instance.splittable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSplitDeclined method, of class Hand.
     */
    @Test
    public void testSetSplitDeclined() {
        System.out.println("setSplitDeclined");
        Hand instance = null;
        instance.setSplitDeclined();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAltTotal method, of class Hand.
     */
    @Test
    public void testSetAltTotal() {
        System.out.println("setAltTotal");
        HandTotal handTotal = null;
        Hand instance = null;
        instance.setAltTotal(handTotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSplitDeclined method, of class Hand.
     */
    @Test
    public void testIsSplitDeclined() {
        System.out.println("isSplitDeclined");
        Hand instance = null;
        boolean expResult = false;
        boolean result = instance.isSplitDeclined();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUpCard method, of class Hand.
     */
    @Test
    public void testGetUpCard() {
        System.out.println("getUpCard");
        Hand instance = null;
        HandModifierCard expResult = null;
        HandModifierCard result = instance.getUpCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBet method, of class Hand.
     */
    @Test
    public void testGetBet() {
        System.out.println("getBet");
        Hand instance = null;
        Bet expResult = null;
        Bet result = instance.getBet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBet method, of class Hand.
     */
    @Test
    public void testSetBet() {
        System.out.println("setBet");
        Bet ante = null;
        Hand instance = null;
        instance.setBet(ante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Hand.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Hand instance = null;
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCards method, of class Hand.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        Hand instance = null;
        List<HandModifierCard> expResult = null;
        List<HandModifierCard> result = instance.getCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Hand.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Hand instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Hand.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Hand o = null;
        Hand instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOwner method, of class Hand.
     */
    @Test
    public void testGetOwner() {
        System.out.println("getOwner");
        Hand instance = null;
        BlackjackPlayer expResult = null;
        BlackjackPlayer result = instance.getOwner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
