/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.blackjack.logic.cards;

import com.shellucas.casinoapi.bets.factories.AbstractCardFactory;
import com.shellucas.casinoapi.cards.Card;
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
public class DeckTest {
    
    AbstractCardFactory f = new CardFactory();
    
    public DeckTest() {
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
     * Test creation of deck
     */
    @Test
    public void testDeck() {
        Deck instance = new  Deck();
        List<DefaultCard> result = instance.getAllCards();
        assertTrue(result.size() == 52);
        System.out.println(instance.toString());
    }
    
    /**
     * Test of draw method, of class Deck.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Deck instance = new Deck();
        Card expResult = f.getCard(Ranks.ACE, Suits.SPADES);
        Card result = instance.draw();
        assertEquals(expResult, result);
        assertTrue(!instance.getAllCards().contains(expResult));
        
        expResult = f.getCard(Ranks.KING, Suits.SPADES);
        result = instance.draw();
        assertEquals(expResult, result);
        assertTrue(!instance.getAllCards().contains(expResult));
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of returnCard method, of class Deck.
     */
    @Test
    public void testReturnCard() {
        System.out.println("returnCard");
        DefaultCard card = new DefaultCard(Suits.SPADES, Ranks.ACE);
        Deck instance = new Deck();
        instance.draw();
        
        assertTrue(!instance.getAllCards().contains(card));
        instance.returnCard(card);
        assertTrue(instance.getAllCards().contains(card));
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
