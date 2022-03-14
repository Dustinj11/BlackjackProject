package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackJackHand extends Hand {
	private List<Card> cards = new ArrayList<>();

	public void addCard(Card card) {
		getCards().add(card);
	}

	public void clear() {
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

	public int getHandValue() {
		int value = 0;
		for (Card card : this.getCards()) {
			value += card.getValue();
		}
		return value;
	}
	
	public List<Card> getCards() {
		return cards;
	}
	
	public boolean isBlackJack() {
		if (getHandValue() ==  21) {
			System.out.println("Black Jack! You win!");
			return true;
		}
		return false;
		
	}
	public boolean isBust() {
		if (getHandValue() > 21) {
			System.out.println("Bust");
			return true;
		}
		return false;
		
	}
	

}