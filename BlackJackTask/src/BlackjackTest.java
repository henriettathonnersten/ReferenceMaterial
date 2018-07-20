import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BlackjackTest {
	Blackjack bj;
	@BeforeEach
	public void setUp() {
		 bj = new Blackjack();
	}
	@Test
	public void testingDifferenceFinder() {
		assertEquals("Difference mismatch", bj.getDifference(10,21),11);
	}
	
	@Test
	public void testingBlackjackFirstWinner() {
		assertEquals("First Number did not win", bj.play(20,18),20);
	}
	@Test
	public void testingBlackjackSecondWinner() {
		assertEquals("Secodn Number did not win", bj.play(17,19),19);
	}
	@Test
	public void testingBlackjackDraw() {
		assertEquals("Game did not end in a draw", bj.play(18,18),18);
	}
	@Test
	public void testingBlackjackFirstNumberExceeds21() {
		assertEquals("22 Exceeds 21, but the answer is not 18", bj.play(22,18),18);
	}
	@Test
	public void testingBlackjackSecondNumberExceeds21() {
		assertEquals("22 Exceeds 21, but the answer is not 18", bj.play(22,18),18);
	}
	@Test
	public void testingBlackjackBothOver21() {

		assertEquals("Both numbers exceed 21, but the result was not 0", bj.play(22,23),0);
	}
	
}
