package beginner.rgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the correctness of the solution for the "Rupsa and the Game"
 * Codechef puzzle:
 *
 * https://www.codechef.com/problems/RGAME
 */
public class RGameTest {

  private RGame rgame;

  @Before
  public void setUp() {
    rgame = new RGame();
  }

  @Test
  public void findSum() {
    int[] sequence = {1, 2};
    long expected = 4;
    assertEquals(expected, rgame.findSum(sequence));
  }
}
