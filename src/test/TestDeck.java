package test;

import src.*;
import static org.junit.Assert.*;
import org.junit.*;

public class TestDeck {

	//dummyDeck will be a deck object that we use for testing
	private Deck dummyDeck;
	
	//orderedDeckString is the string that a new deck's toString method should return
	private final String orderedDeckString;

	public TestDeck() {
		//Initialize orderedDeckString (needs to be done in constructor since it's a final variable)
		orderedDeckString = "TWO of HEARTS\n" + 
				"THREE of HEARTS\n" + 
				"FOUR of HEARTS\n" + 
				"FIVE of HEARTS\n" + 
				"SIX of HEARTS\n" + 
				"SEVEN of HEARTS\n" + 
				"EIGHT of HEARTS\n" + 
				"NINE of HEARTS\n" + 
				"TEN of HEARTS\n" + 
				"JACK of HEARTS\n" + 
				"QUEEN of HEARTS\n" + 
				"KING of HEARTS\n" + 
				"ACE of HEARTS\n" + 
				"TWO of SPADES\n" + 
				"THREE of SPADES\n" + 
				"FOUR of SPADES\n" + 
				"FIVE of SPADES\n" + 
				"SIX of SPADES\n" + 
				"SEVEN of SPADES\n" + 
				"EIGHT of SPADES\n" + 
				"NINE of SPADES\n" + 
				"TEN of SPADES\n" + 
				"JACK of SPADES\n" + 
				"QUEEN of SPADES\n" + 
				"KING of SPADES\n" + 
				"ACE of SPADES\n" + 
				"TWO of CLUBS\n" + 
				"THREE of CLUBS\n" + 
				"FOUR of CLUBS\n" + 
				"FIVE of CLUBS\n" + 
				"SIX of CLUBS\n" + 
				"SEVEN of CLUBS\n" + 
				"EIGHT of CLUBS\n" + 
				"NINE of CLUBS\n" + 
				"TEN of CLUBS\n" + 
				"JACK of CLUBS\n" + 
				"QUEEN of CLUBS\n" + 
				"KING of CLUBS\n" + 
				"ACE of CLUBS\n" + 
				"TWO of DIAMONDS\n" + 
				"THREE of DIAMONDS\n" + 
				"FOUR of DIAMONDS\n" + 
				"FIVE of DIAMONDS\n" + 
				"SIX of DIAMONDS\n" + 
				"SEVEN of DIAMONDS\n" + 
				"EIGHT of DIAMONDS\n" + 
				"NINE of DIAMONDS\n" + 
				"TEN of DIAMONDS\n" + 
				"JACK of DIAMONDS\n" + 
				"QUEEN of DIAMONDS\n" + 
				"KING of DIAMONDS\n" + 
				"ACE of DIAMONDS\n";
	}
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Setting up test deck");
		//Initialize dummyDeck as a new deck
		dummyDeck = new Deck();
		
	}

	/**
	 * Test that verifies the Deck constructor and toString method work
	 */
	@Test
	public void testDeckAndToString() {
		System.out.println("Testing Deck constructor and toString method");
		assertEquals("dummyDeck.toString should match orderedDeckString", dummyDeck.toString(), orderedDeckString);
	}

	/**
	 * Test that verifies the Deck.shuffle method is working
	 */
	@Test
	public void testShuffle() {
		System.out.println("Testing shuffle method");
		
		String unshuffledString = dummyDeck.toString();
		assertEquals("The unshuffled string should match dummyDeck.toString before shuffling", unshuffledString, dummyDeck.toString());
		
		//Verify that after shuffling, the new order of cards is different from the order before shuffling
		// (We do this by checking unshuffledString against dummyDeck.toString() after dummyDeck is shuffled.)
		dummyDeck.shuffle();
		assertNotEquals("The unshuffled string should not match dummyDeck.toString after shuffling", unshuffledString, dummyDeck.toString());		
	}

	/**
	 * Test that verifies the Deck.dealOneCard is working
	 */
	@Test
	public void testDealOneCard() {
		System.out.println("Testing dealOneCard method");
		
		//Draw a card 52 times and verify they're always valid
		for (int i = 0; i < 52; i++) {
			Card currCard = dummyDeck.dealOneCard();
			assertNotNull("There should be no problem drawing any of the first 52 cards in the deck", currCard);
		}
		
		
		//Try drawing another card. An exception should be thrown since there are no cards left in the deck
		try {
			Card currCard = dummyDeck.dealOneCard();
			fail("dealOneCard should throw an exception when there are no cards left in the deck");
		} catch (Exception e) {
			
		}
		
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("Tearing down test deck");
		dummyDeck = null;
		assertNull(dummyDeck);
	}

}
