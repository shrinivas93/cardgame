package com.shri.cardgame.pojo;

import java.util.Set;

public class Deck {
	private Set<Card> cards;

	public Deck(Set<Card> cards) {
		super();
		this.cards = cards;
	}

	public void setCards(Set<Card> cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		return "Deck [cards=" + cards + "]";
	}

}
