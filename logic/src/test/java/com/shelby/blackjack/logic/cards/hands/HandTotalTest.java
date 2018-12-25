/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.blackjack.logic.cards.hands;

import com.shelby.blackjack.logic.betting.BlackjackOutcome;
import com.shelby.blackjack.logic.betting.PlayerBet;
import com.shelby.blackjack.logic.cards.DefaultCard;
import com.shelby.blackjack.logic.cards.CardFactory;
import com.shelby.blackjack.logic.users.BlackjackPlayer;
import com.shelby.blackjack.table.BlackjackTable;
import com.shellucas.casinoapi.bets.Bet;
import com.shellucas.casinoapi.cards.Ranks;
import com.shellucas.casinoapi.cards.Suits;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.shellucas.casinoapi.bets.tables.BetPlacable;
import org.junit.Ignore;

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

//    @Ignore
//    @Test
//    public void testHandtotal() {
//        System.out.println("Black box");
//        CardFactory f = new CardFactory();
//        BetPlacable table = new BlackjackTable();
//        
//        BlackjackPlayer player = new BlackjackPlayer(100, table);
//        
//        Bet bet = new PlayerBet(10, new BlackjackOutcome("RED", 10), player);
//        Hand hand = new Hand(player, bet);
////        HandTotal hard = new HandHardTotal(hand);
//        int exp = 0;
//        int result = hand.value();
//        assertEquals(exp, result);
//
//        hand.addAndRecalculateHand(f.getCard(Ranks.KING, Suits.HEARTS));
//        hand.addAndRecalculateHand(f.getCard(Ranks.THREE, Suits.DIAMONDS));
//        exp = 13;
//        result = hand.value();
//        assertEquals(exp, result);
//
//        DefaultCard aceClubs = f.getCard(Ranks.ACE, Suits.CLUBS);
//        DefaultCard kingDiamonds = f.getCard(Ranks.KING, Suits.DIAMONDS);
//        hand = new Hand(player, bet, aceClubs);
//        hand.addAndRecalculateHand(kingDiamonds);
//
//        assertTrue(hand.getCards().get(0).getRANK() == Ranks.ACE);
//        System.out.println(hand);
//
//        exp = 21;
//        result = hand.value();
//        assertEquals(exp, result);
//
//        hand = new Hand(player, bet);
//        DefaultCard threeDiamonds = f.getCard(Ranks.THREE, Suits.DIAMONDS);
//        DefaultCard kingClubs = f.getCard(Ranks.KING, Suits.CLUBS);
//        DefaultCard AceDiamonds = f.getCard(Ranks.ACE, Suits.DIAMONDS);
//        DefaultCard AceHearts = f.getCard(Ranks.ACE, Suits.HEARTS);
//
//        hand.addAndRecalculateHand(threeDiamonds);
//        hand.addAndRecalculateHand(kingClubs);
//        exp = 13;
//        result = hand.value();
//        assertEquals(exp, result);
//
//        hand.addAndRecalculateHand(AceDiamonds);
//        exp = 14;
//        result = hand.value();
//        assertEquals(exp, result);
//
//        hand.addAndRecalculateHand(AceHearts);
//        exp = 15;
//        result = hand.value();
//        assertEquals(exp, result);
//
////        fail("Fail");
//    }

    /**
     * Test of getHand method, of class HandTotal.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        HandTotal instance = null;
        Hand expResult = null;
        Hand result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of total method, of class HandTotal.
     */
    @Test
    public void testTotal() {
        System.out.println("total");
        DefaultCard cardToOmit = null;
        HandTotal instance = null;
        int expResult = 0;
        int result = instance.total(cardToOmit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class HandTotalImpl extends HandTotal {

        public HandTotalImpl() {
            super(null);
        }

        public int total(DefaultCard cardToOmit) {
            return 0;
        }
    }

}
