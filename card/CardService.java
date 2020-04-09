package com.jse.card;

public class CardService {
	private Card[] cards;
	private int i;
	
	public CardService() {
		cards = new Card[3];
		i = 0;
	}
	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	public Card[] getCards() {
		return cards;
	}
	public void add(Card card) {
		cards[i] = card;
		i++;
	}
}
