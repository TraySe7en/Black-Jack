package me.trayseven.blackjack;

public class Card {
	
	private Value value;
	
	private Suit suit;
	
	public Card(Value value, Suit suit) {
		this.suit = suit;
		this.value = value;
	}
	
	public Value getValue() {
		return value;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public void setValue(Value value) {
		this.value = value;
	}
	
	public void setSuit(Suit suit) {
		this.suit = suit;
	}

}
