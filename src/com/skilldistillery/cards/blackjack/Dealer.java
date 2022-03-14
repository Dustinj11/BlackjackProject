package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.common.Hand;
import com.skilldistillery.cards.common.Person;

public class Dealer extends Hand implements Person{
	private BlackJackHand dealerHand = new BlackJackHand(); 
	private Deck deck = new Deck(); 
		
		
	
	public Card dealHand() {
		deck.shuffle(); // ensures the deck is shuffled before the cards are dealt
		//this shuffle ensures the user and dealer get different cards when app is ran
		return deck.dealCard(); 
	}

	public void newDeck() {
		deck = new Deck();
	}

	@Override
	public int getHandValue() { 
		return dealerHand.getHandValue();
	}
	
	@Override
	public void displayHand() { 
		dealerHand.displayHand();
	}

	@Override
	public void addToHand() { 
		dealerHand.addCard(deck.dealCard());
	}

	@Override
	public void clear() {
		dealerHand.clear();
	}

	public void turn() {
		System.out.println("Dealer flips his card and is showing a: " + dealerHand.getHandValue());
		dealerHand.displayHand();
		while (dealerHand.getHandValue() < 17) {
			addToHand();
			System.out.println("Dealer hits and is showing: ");
			dealerHand.displayHand();
		}
		System.out.println("Dealer has a final hand of: " + dealerHand.getHandValue());
	}


}