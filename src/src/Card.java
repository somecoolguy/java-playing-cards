package src;
/**
 * A class to represent a Card with a suit and a value
 * @author dsym
 */
public class Card {
	private Suit suit;
	private Value value;
	
	/**
	 * Construct a new Card object with the given suit and value
	 * 
	 * @param  suit - the suit to be assigned
	 * @param  value - the value to be assigned
	 */
	public Card(Suit suit, Value value) {
		this.suit = suit;
		this.value = value;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public Value getValue() {
		return value;
	}
	
	public String toString() {
		return value + " of " + suit;
	}
	
}
