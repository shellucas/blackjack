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
public class CardFactoryTest {
    
    public CardFactoryTest() {
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
     * Test of getCard method, of class CardFactory.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        Ranks rank = Ranks.EIGHT;
        Suits suit = Suits.HEARTS;
        Card expResult = new Card(suit, rank);
        Card result = CardFactory.getCard(rank, suit);
        assertEquals(expResult, result);
        
        // Test AceCard
        rank = Ranks.ACE;
        suit = Suits.HEARTS;
        expResult = new AceCard(suit, rank);
        result = CardFactory.getCard(rank, suit);
        assertEquals(expResult, result);
        
        // Test FaceCard
        rank = Ranks.KING;
        suit = Suits.SPADES;
        expResult = new FaceCard(suit, rank);
        result = CardFactory.getCard(rank, suit);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
