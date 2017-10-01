package beginner.rgame;

/**
 * This class contains logic for solving the
 * "Rupsa and the Game" Codechef puzzle:
 * <p>
 * https://www.codechef.com/problems/RGAME
 */
public class RGame {

  private static final long MODULUS = 1000000007L;

  public long findSum(int[] elements) {
    if (elements.length < 2) {
      return 0;
    }
    long accu = 0;
    long prev = elements[0];
    long pow = 1;
    for (int i = 1; i < elements.length; i++) {
      accu *= 2;
      long tmp = 2;
      tmp = (tmp * prev * elements[i]) % MODULUS;
      accu = (accu + tmp) % MODULUS;
      prev = (prev + (pow * elements[i]) % MODULUS) % MODULUS;
      pow = (pow * 2) % MODULUS;
    }
    return accu;
  }
}
