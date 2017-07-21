package test;

import static org.junit.Assert.*;
import org.junit.*;
import src.*;

/**
 * Tests for the Card class
 * @author dsym
 *
 */
public class TestCard {

	/**
	 * Test to verify that Card.toString works correctly
	 */
	@Test
	public void testToString() {
		Card testCard1 = new Card(Suit.SPADES, Value.ACE);
		assertTrue("testCard1 toString should result in 'ACE of SPADES'", testCard1.toString().equals("ACE of SPADES"));
		
		Card testCard2 = new Card(Suit.HEARTS, Value.THREE);
		assertTrue("testCard2 toString should result in 'THREE of HEARTS'", testCard2.toString().equals("THREE of HEARTS"));
	}

}
