package me.trayseven.blackjack;

public enum Suit {
	
	HEART("\u2661"), DIAMOND("\u2662"), SPADE("\u2660"), CLUB("\u2663");
	
	private String altCode;
	
	private Suit(String altCode) {
		this.altCode = altCode;
	}
	
	public String getAltCode() {
		return altCode;
	}

}
