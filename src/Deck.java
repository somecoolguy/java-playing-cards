import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {
	private List<Card> cards;
	
	public Deck() {
		this.cards = new ArrayList<Card>();
		
		//Loop through every combination of suit and value
		for (Suit suit: Suit.values()) {
			for (Value val: Value.values()) {
				//Create a card with the current suit and value and add it to the deck
				Card c = new Card(suit, val);
				cards.add(c);
			}
		}
	}
	
	/**
	 * Randomly shuffle the deck.
	 * This function works by repeatedly choosing 2 random cards and swapping
	 * their positions.
	 */
	public void shuffle() {
		
		/*
		 * This loop will repeatedly choose 2 random cards and swap their positions.
		 * The loop will do as many swaps as there are cards in the deck.
		 * Increasing the number of swaps will make the shuffle more random.  
		 */
		for (int i = 0; i < cards.size(); i++) {
			//Choose 2 random indexes for the cards to swap
			int firstRandIndex = ThreadLocalRandom.current().nextInt(0, cards.size());
			int secondRandIndex = ThreadLocalRandom.current().nextInt(0, cards.size());
			
			//Swap the cards at firstRandIndex and secondRandIndex
			Card temp = cards.get(firstRandIndex);
			cards.set(firstRandIndex, cards.get(secondRandIndex));
			cards.set(secondRandIndex, temp);
		}
	}
	
	/**
	 * Remove the last card from the deck and return it to the caller
	 * @return the card at position 0 in the deck. 
	 * @throws IndexOutOfBoundsException if the deck has no cards left
	 */
	public Card dealOneCard() {
		//The position of the last card is the size of the deck - 1.
		int lastCardPos = cards.size() - 1;
		
		//If the position of the last card is less than 0, it means there are no cards to return
		if (lastCardPos < 0)
			throw new IndexOutOfBoundsException("The deck has no cards left to deal");
		
		//Get the last card, remove it from the deck, and return it.
		Card lastCard = cards.get(lastCardPos);
		cards.remove(lastCardPos);
		return lastCard;
	}
}
