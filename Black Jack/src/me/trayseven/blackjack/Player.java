package me.trayseven.blackjack;

import java.util.List;

public class Player {
	
	private List<Card> hand;
	
	private int totalPoints;
	
	public Player(List<Card> hand, int totalPoints) {
		this.hand = hand;
		this.totalPoints = totalPoints;
	}
	
	public void addCard(Card card) {
		hand.add(card);
	}
	
	public void increaseTotal(int amount) {
		totalPoints += amount;
	}

}
