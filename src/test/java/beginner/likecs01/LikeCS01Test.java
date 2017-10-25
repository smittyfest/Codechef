package beginner.likecs01;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the correctness of the solution for the "Subsequence Equality"
 * Codechef puzzle:
 * <p>
 * https://www.codechef.com/problems/LIKECS01
 */
public class LikeCS01Test {

  private LikeCS01 likeCS01;

  @Before
  public void setUp() {
    likeCS01 = new LikeCS01();
  }

  @Test
  public void hasEqualSubsequences_success() {
    String one = "venivedivici";
    String two = "codechef";
    assertEquals("yes", likeCS01.hasEqualSubsequences(one));
    assertEquals("yes", likeCS01.hasEqualSubsequences(two));
  }

  @Test
  public void hasEqualSubsequences_failure() {
    String one = "abcdefghij";
    String two = "meow";
    assertEquals("no", likeCS01.hasEqualSubsequences(one));
    assertEquals("no", likeCS01.hasEqualSubsequences(two));
  }
}
