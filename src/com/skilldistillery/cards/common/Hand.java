package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	
	private List<Card> cards = new ArrayList<>(); 

	public List<Card> getCards() { 
		return cards;
	}
	
	public void addCard(Card card) { 
		getCards().add(card);
	}

	public int getHandValue() {  
		int value = 0;
		for (Card card : getCards()) {
			value += card.getValue();
		}
		return value;
	}

	public void fold() { 	
		getCards().clear();
	}

	public void displayHand() {  
		if (getCards().size() == 0) {
			System.out.println("No cards.");
		} else {
			for (Card card : getCards()) {
				System.out.println(card);
			}
		}
	}

}
