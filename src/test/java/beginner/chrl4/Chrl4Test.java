package beginner.chrl4;

import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

/**
 * Tests the correctness of the solution for the "Chef and Way"
 * Codechef puzzle:
 * <p>
 * https://www.codechef.com/problems/CHRL4
 */
public class Chrl4Test {

  private Chrl4 chrl4;

  @Before
  public void setUp() {
    chrl4 = new Chrl4();
  }

  @Test
  public void findWayHome() {
    int k = 2;
    int[] streets = {1, 2, 3, 4};
    assertThat(chrl4.findWayHome(streets, k)).isEqualTo(8);
  }

  @Test
  public void subtask1() {
    int k = 2;
    int[] streets = {1, 2, 3, 4};
    assertThat(chrl4.subtask1(streets, k)).isEqualTo(8);
  }

  @Test
  public void subtask2() {
    int k = 2;
    int[] streets = {1, 2, 3, 4};
    assertThat(chrl4.subtask2(streets, k)).isEqualTo(8);
  }

}
