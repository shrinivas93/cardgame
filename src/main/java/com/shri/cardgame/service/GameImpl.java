package com.shri.cardgame.service;

import java.util.Map;
import java.util.Set;

import com.shri.cardgame.pojo.Card;
import com.shri.cardgame.pojo.Deck;
import com.shri.cardgame.pojo.Player;

public class GameImpl implements Game{

	@Override
	public Deck generateDeck() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void shuffle(Deck deck) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Player> createPlayers(Integer playerCount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Player, Set<Card>> distributeCards(Set<Player> players, Deck deck, Integer cardsPerPlayer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Player> play(Map<Player, Set<Card>> distributedCards) {
		// TODO Auto-generated method stub
		return null;
	}

}
