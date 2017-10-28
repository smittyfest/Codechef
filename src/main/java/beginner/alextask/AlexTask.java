package beginner.alextask;

/**
 * This class contains logic for solving the
 * "Task for Alexey" Codechef puzzle:
 * <p>
 * https://www.codechef.com/problems/ALEXTASK
 */
public class AlexTask {

  public long getTimeOfFreezing(int[] frequencies) {
    long min = Long.MAX_VALUE;
    for (int i = 0; i < frequencies.length - 1; i++) {
      for (int j = i + 1; j < frequencies.length; j++) {
        long result = lcm(frequencies[i], frequencies[j]);
        if (result < min) {
          min = result;
        }
      }
    }
    return min;
  }

  private static long lcm(long a, long b) {
    return a * (b / gcd(a, b));
  }

  private static long gcd(long a, long b) {
    while (b > 0) {
      long tmp = b;
      b = a % b;
      a = tmp;
    }
    return a;
  }
}
