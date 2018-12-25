/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.blackjack.logic.cards;

import com.shelby.blackjack.logic.betting.BlackjackOutcome;
import com.shelby.blackjack.logic.betting.PlayerBet;
import com.shelby.blackjack.logic.cards.hands.Hand;
import com.shelby.blackjack.logic.users.BlackjackPlayer;
import com.shelby.blackjack.table.BlackjackTable;
import com.shellucas.casinoapi.bets.Bet;
import com.shellucas.casinoapi.bets.Outcome;
import com.shellucas.casinoapi.cards.Ranks;
import com.shellucas.casinoapi.cards.Suits;
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
public class CardBlackBoxTest {
    
    BlackjackTable table;
    BlackjackPlayer player;
    Bet bet;
    Outcome outcome;
    
    Hand hand;
    
    CardFactory factory;
    
    HandModifierCard card1;
    HandModifierCard card2;
    HandModifierCard card3;
    HandModifierCard card4;
    HandModifierCard card5;
    HandModifierCard card6;
    
    public CardBlackBoxTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        factory = new CardFactory();
        card1 = factory.getCard(Ranks.TWO, Suits.CLUBS);
        card2 = factory.getCard(Ranks.FOUR, Suits.HEARTS);
        card3 = factory.getCard(Ranks.JACK, Suits.SPADES);
        card4 = factory.getCard(Ranks.KING, Suits.DIAMONDS);
        card5 = factory.getCard(Ranks.ACE, Suits.SPADES);
        card6 = factory.getCard(Ranks.ACE, Suits.HEARTS);
        
        table = new BlackjackTable(10000, 10);
        player = new BlackjackPlayer(1000, table);
        outcome = new BlackjackOutcome("TestOutcome", 3);
        bet = new PlayerBet(10, outcome, player);
        
        hand = new Hand(player, bet);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void blackboxTest1() {
        
        /**
         * Test Factory
         */
        System.out.println("cardFactoryTest");
        // Card 1 should be default card with soft and hard value of 2.
        System.out.println(card1);
        assertTrue(card1 instanceof DefaultCard);
        assertTrue(card1.softValue() == 2);
        assertTrue(card1.hardValue() == 2);

        // Card 3 should be face card with soft and hard value of 10
        System.out.println(card3);
        assertTrue(card3 instanceof FaceCard);
        assertTrue(card3.softValue() == 10);
        assertTrue(card3.hardValue() == 10);

        // Card 5 should be ace card with soft value of 11 and hard value of 1
        System.out.println(card5);
        assertTrue(card5 instanceof AceCard && !(card5 instanceof FaceCard));
        assertTrue(card5.softValue() == 11);
        assertTrue(card5.hardValue() == 1);
        
        /**
         * Test Alt Total
         */
        
    }
}
