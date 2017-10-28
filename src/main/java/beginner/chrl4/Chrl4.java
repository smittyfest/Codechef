package beginner.chrl4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

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

  public long subtask1(int[] streets, int k) {
    List<BigInteger> paths = new ArrayList<>();
    paths.add(BigInteger.valueOf(streets[0]));
    for (int i = 1; i < streets.length; i++) {
      BigInteger min = paths.get(i - 1);
      for (int j = 2; j <= k; j++) {
        if (i - j >= 0 && paths.get(i - j).compareTo(min) < 0) {
          min = paths.get(i - j);
        }
      }
      paths.add(min.multiply(BigInteger.valueOf(streets[i])));
    }
    return paths.get(streets.length - 1)
        .mod(BigInteger.valueOf(MODULUS))
        .longValue();
  }

  public long subtask2(int[] streets, int k) {
    long[] min = new long[streets.length];
    PriorityQueue<Pair> queue = new PriorityQueue<>();
    queue.offer(new Pair(Math.log(streets[0]), 0));
    min[0] = streets[0] % MODULUS;
    for (int i = 1; i < streets.length; i++) {
      while (i - queue.peek().index > k) {
        queue.poll();
      }
      int j = queue.peek().index;
      min[i] = (min[j] * streets[i]) % MODULUS;
      queue.offer(new Pair(queue.peek().logValue + Math.log(streets[i]), i));
    }
    return min[streets.length - 1];
  }
}

class Pair implements Comparable<Pair> {

  double logValue;
  int index;

  Pair(double logValue, int index) {
    this.logValue = logValue;
    this.index = index;
  }

  @Override
  public int compareTo(Pair that) {
    return Double.compare(this.logValue, that.logValue);
  }
}
