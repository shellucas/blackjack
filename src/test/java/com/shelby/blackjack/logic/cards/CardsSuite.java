/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.blackjack.logic.cards;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author shelby
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.shelby.blackjack.logic.cards.ShoeTest.class
        , com.shelby.blackjack.logic.cards.CardFactoryTest.class
        , com.shelby.blackjack.logic.cards.DefaultCardTest.class
        , com.shelby.blackjack.logic.cards.DeckTest.class})
public class CardsSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
