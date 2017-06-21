package com.shri.cardgame;

import java.util.Map;
import java.util.Set;

import com.shri.cardgame.pojo.Card;
import com.shri.cardgame.pojo.Deck;
import com.shri.cardgame.pojo.Player;
import com.shri.cardgame.service.Game;
import com.shri.cardgame.service.GameImpl;

public class Main {

	private Game game;

	public Main() {
		game = new GameImpl();
	}

	public static void main(String[] args) {
		int playerCount = 5;
		int cardsPerPlayer = 5;
		Main main = new Main();
		main.go(playerCount, cardsPerPlayer);
	}

	private void go(int playerCount, int cardsPerPlayer) {
		Deck deck = game.generateDeck();
		System.out.println("ORIGINAL DECK :");
		System.out.println(deck);
		System.out.println();

		game.shuffle(deck);
		System.out.println("SHUFFLED DECK :");
		System.out.println(deck);
		System.out.println();

		Set<Player> players = game.createPlayers(playerCount);
		System.out.println("PLAYERS :");
		System.out.println(players);
		System.out.println();

		Map<Player, Set<Card>> distributedCards = game.distributeCards(players, deck, cardsPerPlayer);
		System.out.println("DISTRIBUTED CARDS :");
		System.out.println(distributedCards);
		System.out.println();

		Set<Player> winners = game.play(distributedCards);
		System.out.println("WINNERS :");
		System.out.println(winners);
		System.out.println();
	}

}
