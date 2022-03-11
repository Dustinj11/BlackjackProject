package com.skilldistillery.cards.common;

import java.util.Objects;

public class Card {

	private Rank rank;
	private Suit suit;

	public Card(Rank rank, Suit suit) {
		// super(); instructor had this
		this.rank = rank;
		this.suit = suit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(rank);
		builder.append(" of ");
		builder.append(suit);
		return builder.toString();
	}

	public int getValue() {
		return this.rank.getValue();
	}

}
