/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.blackjack.logic.cards;

import com.shelby.blackjack.logic.cards.hands.Hand;
import com.shellucas.casinoapi.cards.Card;

/**
 *
 * @author shelby
 */
public interface HandModifierCard extends Card {
    
    public void setAltTotal(Hand hand);
    
    public int softValue();
    
    public int hardValue();
    
}
