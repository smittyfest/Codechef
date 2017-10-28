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
    int i = streets.length - 1;
    int home = streets[i];
    while (i > 0) {
      int minIndex = 0;
      for (int j = i - 1; j >= 0; j--) {
        int value = streets[i] - streets[j];
        if (value <= k) {
          min = streets[j];
          minIndex = j;
        }
      }
      minProduct = (minProduct * min) % MODULUS;
      i = minIndex;
    }
    minProduct = (minProduct * home) % MODULUS;
    return minProduct;
  }
}
