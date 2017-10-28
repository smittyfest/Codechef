package beginner.alextask;

import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

/**
 * Tests the correctness of the solution for the "Task for Alexey"
 * Codechef puzzle:
 * <p>
 * https://www.codechef.com/problems/ALEXTASK
 */
public class AlexTaskTest {

  private AlexTask alexTask;

  @Before
  public void setUp() {
    alexTask = new AlexTask();
  }

  @Test
  public void getTimeOfFreezing() {
    assertThat(alexTask.getTimeOfFreezing(new int[] {5, 3, 2})).isEqualTo(6);
    assertThat(alexTask.getTimeOfFreezing(new int[] {1, 8, 7, 11})).isEqualTo(7);
    assertThat(alexTask.getTimeOfFreezing(new int[] {4, 4, 5, 6})).isEqualTo(4);
  }
}
