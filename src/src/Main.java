package src;

public class Main {

	/**
	 * Create a new deck, shuffle it, and then deal out every card
	 * @author dsym
	 * @param args
	 */
	public static void main(String[] args) {
		//Create a new deck and shuffle it
		Deck deckOfCards = new Deck();
		
		System.out.println("Deck of cards before shuffling:\n" + deckOfCards.toString());

		deckOfCards.shuffle();
		
		System.out.println("\n\nDeck of cards after shuffling and dealing out all the cards");
		
		//I loop through the deck 53 times because I want to see what happens when it's empty
		for (int i = 0; i < 53; i++) {
			try {
				Card c = deckOfCards.dealOneCard();
				System.out.println(c);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}

	}

}
