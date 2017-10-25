package beginner.chefsum;

import java.util.Arrays;

/**
 * This class contains logic for solving the
 * "Little Chef and Sums" Codechef puzzle:
 * <p>
 * https://www.codechef.com/problems/CHEFSUM
 */
public class ChefSum {
  public long prefixSum(int[] nums, int i) {
    return Arrays.stream(nums).limit(i).sum();
  }

  public long suffixSum(int[] nums, int i) {
    return Arrays.stream(nums).skip(i - 1).sum();
  }

  public long rangeSum(int[] nums, int from, int to) {
    return Arrays.stream(nums).skip(from - 1).limit(to - from + 1).sum();
  }

  /*
   * Passes Subtask #1 : (20 points) 1 ≤ N ≤ 100
   */
  public int findMinimumIndex(int[] nums) {
    long minimum = Long.MAX_VALUE;
    int index = -2;
    for (int i = 1; i <= nums.length; i++) {
      long sum = prefixSum(nums, i) + suffixSum(nums, i);
      if (sum < minimum) {
        minimum = sum;
        index = i;
      }
    }
    return index;
  }

  /*
   * Passes Subtask #1 : (20 points) 1 ≤ N ≤ 100
   * Passes Subtask #2 : (80 points) 1 ≤ T ≤ 10, 1 ≤ N, A[i] ≤ 10^5
   */
  public int findMinimumIndexFast(int[] nums) {
    long minimum = Long.MAX_VALUE;
    int index = -2;
    for (int i = 1; i <= nums.length; i++) {
      if (nums[i-1] < minimum) {
        minimum = nums[i-1];
        index = i;
      }
    }
    return index;
  }
}
