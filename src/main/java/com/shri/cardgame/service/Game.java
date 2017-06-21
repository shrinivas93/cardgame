package com.shri.cardgame.service;

import java.util.Map;
import java.util.Set;

import com.shri.cardgame.pojo.Card;
import com.shri.cardgame.pojo.Deck;
import com.shri.cardgame.pojo.Player;

public interface Game {
	/**
	 * Generates a standard deck containing 52 unique cards.
	 * 
	 * @return {@link Deck} of cards
	 */
	Deck generateDeck();

	/**
	 * Shuffles the deck
	 * 
	 * @param deck
	 *            {@link Deck} containing cards
	 */
	void shuffle(Deck deck);

	/**
	 * Creates <code>n</code> players that will play the game
	 * 
	 * @param playerCount
	 *            numbers of players
	 * @return {@link Set} of {@link Player}
	 */
	Set<Player> createPlayers(Integer playerCount);

	/**
	 * 
	 * @param players
	 *            {@link Set} of {@link Player} playing the game
	 * @param deck
	 *            {@link Deck} containing {@link Set} of {@link Card}
	 * @param cardsPerPlayer
	 *            Number of cards to be distributed per player
	 * @return {@link Map}<{@link Player}, {@link Set}<{@link Card}>> describing the
	 *         distributed cards per player
	 */
	Map<Player, Set<Card>> distributeCards(Set<Player> players, Deck deck, Integer cardsPerPlayer);

	/**
	 * Play the game and determine the winner(s)
	 * 
	 * @param distributedCards
	 *            {@link Map}<{@link Player}, {@link Set}<{@link Card}>> describing
	 *            the distributed cards per player
	 * @return {@link Set} of {@link Player} denoting the winner(s)
	 */
	Set<Player> play(Map<Player, Set<Card>> distributedCards);
}
