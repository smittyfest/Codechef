package beginner.chrl4;

/**
 * This class contains logic for solving the
 * "Chef and Way" Codechef puzzle:
 * <p>
 * https://www.codechef.com/problems/CHRL4
 */
public class Chrl4 {

  private static final long MODULUS = 1000000007L;

  public long findWayHome(int[] streets, int k) {
    long minProduct = 1;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < streets.length - 1; i++) {
      int minIndex = 0;
      for (int j = i + 1; j < streets.length; j++) {
        int value = streets[j] - streets[i];
        if (value <= k && value < min) {
          min = streets[j];
          minIndex = j;
        }
      }
      minProduct = (minProduct * min) % MODULUS;
      i = minIndex;
    }
    return minProduct;
  }
}
