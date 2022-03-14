package com.skilldistillery.cards.blackjack;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Person;

public class Player implements Person{
	private BlackJackHand playerHand = new BlackJackHand();
	private Scanner sc = new Scanner(System.in); 

	public Player() {
	}


	public int playerInput() {
		int userInput = 0;
		try {
			userInput = sc.nextInt();
		} catch (Exception e) {
			System.out.println("ERROR |");
		}
		sc.nextLine();
		return userInput;

	}
	public boolean playAgain() {
		try {
			String userInput = sc.nextLine();
			if (userInput.contains("Y") || userInput.contains("y")){
				return true;
			}				
			else if (userInput.contains("N") || userInput.contains("n")){
				return false;
			}
				
		} catch (Exception e) {
			System.out.println("    ERROR   ");
			System.out.println(" 'Y' or 'N' ");
			
		}
		
		return false;
		
	}



	public List<Card> getCards() {
		return playerHand.getCards();
	}
	
	@Override
	public int getHandValue() { 
		return playerHand.getHandValue();
	}

	
	@Override
	public void displayHand() {
		playerHand.displayHand();
	}

	@Override
	public void addToHand() {
	}
	
	public void addToHand(Card card) { //card from dealer
		playerHand.addCard(card);
	}
	
	@Override
	public void clear() {
		playerHand.clear();
	}
}