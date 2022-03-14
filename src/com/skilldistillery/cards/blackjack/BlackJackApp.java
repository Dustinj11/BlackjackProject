package com.skilldistillery.cards.blackjack;


public class BlackJackApp {
		Player player = new Player(); 
		Dealer dealer = new Dealer(); 

		public static void main(String[] args) {
			BlackJackApp blackJackGame = new BlackJackApp();
			blackJackGame.run();

		}

		private void run() {
			System.out.println("Welcome to BlackJack");
			System.out.println("Cards are being dealt...");
			int cardsDealt = 2;
			boolean playAgain;
			do {
				for (int i = 0; i < cardsDealt; i++) {
					player.addToHand(dealer.dealHand());
					dealer.addToHand();
				}
				boolean checkMenu = true;
				System.out.println("You're current hand is: " + player.getHandValue());
				player.displayHand();
				System.out.println("The dealer is showing: ");
				while (player.getHandValue() < 21 && checkMenu == true) {
					showMenu(); 
					checkMenu = menuSwitch(player.playerInput());  
				}
				dealer.turn(); 
				System.out.println("");
				System.out.println("");
				System.out.println("Your hand:  " + player.getHandValue());
				System.out.println("Dealer hand:  " + dealer.getHandValue());
				System.out.println();
				winnerOutcome(player.getHandValue(), dealer.getHandValue());
				player.clear();
				dealer.clear(); // clears both hands for the next round was originally adding more cards to the original hand dealt. 
				dealer.newDeck(); // new game new deck
				System.out.println("\nPlay again?\n(Y or N)");
				playAgain = player.playAgain();
			} while(playAgain == true);
			System.out.println("Thank you for playing");
		}


		private void showMenu() {
			System.out.println("Value of current hand: " + player.getHandValue());
			System.out.println("Next move: select (1 or 2)");
			System.out.println("");
			System.out.println("1) Hit");
			System.out.println("2) Stay");
			System.out.println("");
		}
		
		private boolean menuSwitch(int userInput) {
			
			switch (userInput) {
			case 1: 
				System.out.println("Your next card is flipped... ");
				player.addToHand(dealer.dealHand());
				System.out.println("you now have: ");
				player.displayHand();
				System.out.println(player.getHandValue() + " total");
				break;

			case 2:
				System.out.println("Player is standing.");
				return false;
			default:
				System.out.println("ERROR | select 1-2");
				break;
			}
			
			return true;

		}

		private void winnerOutcome(int playerHand, int dealerHand) {
			if (player.getCards().size() == 2 && player.getHandValue() == 21) {
				System.out.println("Blackjack! You win!");
			} else if (playerHand <= 21 && dealerHand <= 21 && playerHand > dealerHand) {
				System.out.println("You win!");
			} else if (playerHand <= 21 && dealerHand > 21) {
				System.out.println("You win!");
			} else if (playerHand <= 21 && playerHand == dealerHand) {
				System.out.println("Draw");
			} else if (playerHand > 21) {
				System.out.println("Bust");
			} else {
				System.out.println("Dealer won!");
			}
			
		}

	}