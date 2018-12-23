/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.blackjack.logic.cards;

import com.shellucas.casinoapi.cards.Card;
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
public class ShoeTest {
    
    public ShoeTest() {
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
     * Test of addDeck method, of class Shoe.
     */
    @Test
    public void testAddDeck() {
        System.out.println("addDeck");
        Deck deck = null;
        Shoe instance = null;
        instance.addDeck(deck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deal method, of class Shoe.
     */
    @Test
    public void testDeal() {
        System.out.println("deal");
        Shoe instance = null;
        Card expResult = null;
        Card result = instance.deal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnCard method, of class Shoe.
     */
    @Test
    public void testReturnCard() {
        System.out.println("returnCard");
        DefaultCard card = null;
        Shoe instance = null;
        instance.returnCard(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shuffle method, of class Shoe.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        Shoe instance = null;
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
