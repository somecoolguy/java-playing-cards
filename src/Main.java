
public class Main {

	/**
	 * Create a new deck, shuffle it, and then deal out every card
	 * @param args
	 */
	public static void main(String[] args) {
		//Create a new deck and shuffle it
		Deck deckOfCards = new Deck();
		deckOfCards.shuffle();
		
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
