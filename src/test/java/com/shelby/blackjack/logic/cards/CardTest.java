/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.blackjack.logic.cards;

import com.shelby.blackjack.logic.cards.util.Ranks;
import com.shelby.blackjack.logic.cards.util.Suits;
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
public class CardTest {
    
    public CardTest() {
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
     * Test of softValue method, of class Card.
     */
    @Test
    public void testSoftValue() {
        System.out.println("softValue");
        Card instance = null;
        int expResult = 0;
        int result = instance.softValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hardValue method, of class Card.
     */
    @Test
    public void testHardValue() {
        System.out.println("hardValue");
        Card instance = null;
        int expResult = 0;
        int result = instance.hardValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRANK method, of class Card.
     */
    @Test
    public void testGetRANK() {
        System.out.println("getRANK");
        Card instance = null;
        Ranks expResult = null;
        Ranks result = instance.getRANK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSUIT method, of class Card.
     */
    @Test
    public void testGetSUIT() {
        System.out.println("getSUIT");
        Card instance = null;
        Suits expResult = null;
        Suits result = instance.getSUIT();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Card.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Card instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Card.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
