/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.blackjack.logic.cards.hands;

import com.shelby.blackjack.logic.cards.Card;
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
     * Test of setAltTotal method, of class Hand.
     */
    @Test
    public void testSetAltTotal() {
        System.out.println("setAltTotal");
        HandTotal handTotal = null;
        Hand instance = new Hand();
        instance.setAltTotal(handTotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAndRecalculate method, of class Hand.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Card cardToAdd = null;
        Hand instance = new Hand();
        instance.addAndRecalculate(cardToAdd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of value method, of class Hand.
     */
    @Test
    public void testValue() {
        System.out.println("value");
        Hand instance = new Hand();
        int expResult = 0;
        int result = instance.value();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Hand.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Hand instance = new Hand();
        int expResult = 0;
        int result = instance.size();
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
        Hand instance = new Hand();
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
        Hand instance = new Hand();
        boolean expResult = false;
        boolean result = instance.busted();
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
        Hand instance = new Hand();
        List<Card> expResult = null;
        List<Card> result = instance.getCards();
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
        Hand instance = new Hand();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
