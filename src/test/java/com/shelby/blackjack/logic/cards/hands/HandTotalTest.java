/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.blackjack.logic.cards.hands;

import com.shelby.blackjack.logic.cards.Card;
import com.shelby.blackjack.logic.cards.CardFactory;
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
public class HandTotalTest {
    
    public HandTotalTest() {
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
    
    @Test
    public void testHandtotal() {
        System.out.println("Black box");
        Hand hand = new Hand();
//        HandTotal hard = new HandHardTotal(hand);
        int exp = 0;
        int result = hand.value();
        assertEquals(exp, result);
        
        hand.addAndRecalculate(CardFactory.getCard(Ranks.KING, Suits.HEARTS));
        hand.addAndRecalculate(CardFactory.getCard(Ranks.THREE, Suits.DIAMONDS));
        exp = 13;
        result = hand.value();
        assertEquals(exp, result);
        
        Card aceClubs = CardFactory.getCard(Ranks.ACE, Suits.CLUBS);
        Card kingDiamonds = CardFactory.getCard(Ranks.KING, Suits.DIAMONDS);
        hand = new Hand(aceClubs);
        hand.addAndRecalculate(kingDiamonds);
        
        assertTrue(hand.getCards()
                .get(0).getRANK() == Ranks.ACE);
        System.out.println(hand);
        
        exp = 21;
        result = hand.value();
        assertEquals(exp, result);
        
        hand = new Hand();
        Card threeDiamonds = CardFactory.getCard(Ranks.THREE, Suits.DIAMONDS);
        Card kingClubs = CardFactory.getCard(Ranks.KING, Suits.CLUBS);
        Card AceDiamonds = CardFactory.getCard(Ranks.ACE, Suits.DIAMONDS);
        Card AceHearts = CardFactory.getCard(Ranks.ACE, Suits.HEARTS);
        
        hand.addAndRecalculate(threeDiamonds);
        hand.addAndRecalculate(kingClubs);
        exp = 13;
        result = hand.value();
        assertEquals(exp, result);
        
        hand.addAndRecalculate(AceDiamonds);
        exp = 14;
        result = hand.value();
        assertEquals(exp, result);
        
        hand.addAndRecalculate(AceHearts);
        exp = 15;
        result = hand.value();
        assertEquals(exp, result);
        
//        fail("Fail");
    }
    
    public class HandTotalImpl extends HandTotal {

        public HandTotalImpl() {
            super(null);
        }

        public int total(Card cardToOmit) {
            return 0;
        }
    }
    
}
