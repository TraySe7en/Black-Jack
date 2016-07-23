package me.trayseven.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> deck;
	
	public Deck() {
		buildDeck();
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public Card draw() {
		Card draw = deck.get(0);
		deck.remove(0);
		return draw;
	}
	
	public void buildDeck() {
		deck = new ArrayList<>();
		for(Value value : Value.values()) {
			for(Suit suit : Suit.values()) {
				Card card = new Card(value, suit);
				deck.add(card);
			}
		}
	}

}
