/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.blackjack.logic.cards.hands;

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
@Suite.SuiteClasses({com.shelby.blackjack.logic.cards.hands.HandHardTotalTest.class, com.shelby.blackjack.logic.cards.hands.HandSoftTotalTest.class, com.shelby.blackjack.logic.cards.hands.HandTotalTest.class})
public class HandsSuite {

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
