package com.shelby.blackjack.game;

import com.shelby.blackjack.logic.cards.Deck;
import com.shelby.blackjack.logic.users.House;
import com.shelby.blackjack.logic.users.Player;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author shelby
 */
public class BlackJack {
    
    private List<Player> players;
    private House house;
    private Deck deck;
    
    public BlackJack() {
        this.players = new ArrayList<>();
        this.house = new House();
    }
    
    public BlackJack(int amountOfPlayers) {
        this();
        for (int i = 0; i < amountOfPlayers; i++) {
            players.add(new Player());
        }
    }
    
    public void addPlayer(String name) {
        players.add(new Player(name));
    }

    public Deck getDeck() {
        return deck;
    }
    
}
