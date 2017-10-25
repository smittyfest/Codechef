package beginner.chefsum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the correctness of the solution for the "Little Chef and Sums"
 * Codechef puzzle:
 * <p>
 * https://www.codechef.com/problems/CHEFSUM
 */
public class ChefSumTest {

  private ChefSum chefSum;

  @Before
  public void setUp() {
    chefSum = new ChefSum();
  }

  @Test
  public void prefixSumTest_entireArraySummed() {
    int[] nums = {1,2,3,4,5,6,7,8,9}; // sum = 45
    long expected = 45;
    assertEquals(expected, chefSum.prefixSum(nums, nums.length));
  }

  @Test
  public void prefixSumTest_oneElementSummed() {
    int[] nums = {1,2,3,4,5,6,7,8,9}; // sum = 45
    long expected = 1;
    assertEquals(expected, chefSum.prefixSum(nums, 1));
  }

  @Test
  public void prefixSumTest_partialArraySummed() {
    int[] nums = {1,2,3,4,5,6,7,8,9}; // sum(1..5) = 15
    long expected = 15;
    assertEquals(expected, chefSum.prefixSum(nums, 5));
  }

  @Test
  public void suffixSumTest_entireArraySummed() {
    int[] nums = {1,2,3,4,5,6,7,8,9}; // sum = 45
    long expected = 45;
    assertEquals(expected, chefSum.suffixSum(nums, 1));
  }

  @Test
  public void suffixSumTest_oneElementSummed() {
    int[] nums = {1,2,3,4,5,6,7,8,9}; // sum = 45
    long expected = 9;
    assertEquals(expected, chefSum.suffixSum(nums, nums.length));
  }

  @Test
  public void suffixSumTest_partialArraySummed() {
    int[] nums = {1,2,3,4,5,6,7,8,9}; // sum(5..9) = 35
    long expected = 35;
    assertEquals(expected, chefSum.suffixSum(nums, 5));
  }

  @Test
  public void rangeSumTest_entireArraySummed() {
    int[] nums = {1,2,3,4,5,6,7,8,9}; // sum = 45
    long expected = 45;
    assertEquals(expected, chefSum.rangeSum(nums, 1, 9));
  }

  @Test
  public void rangeSumTest_partialArraySummed() {
    int[] nums = {1,2,3,4,5,6,7,8,9}; // sum(3..5) = 12
    long expected = 12;
    assertEquals(expected, chefSum.rangeSum(nums, 3, 5));
  }

  @Test
  public void prefixPlusSuffixTest() {
    int[] nums = {1,2,3};
    int[] nums2 = {2,1,3,1};
    long expected1 = 7;  // prefixSum(1) + suffixSum(1) = 1 + 6 = 7
    long expected2 = 8;  // prefixSum(2) + suffixSum(2) = 3 + 5 = 8
    long expected3 = 9;  // prefixSum(3) + suffixSum(3) = 6 + 3 = 9
    long expected4 = 9;  // prefixSum(1) + suffixSum(1) = 2 + 7 = 9
    long expected5 = 8;  // prefixSum(2) + suffixSum(2) = 3 + 5 = 8
    long expected6 = 10; // prefixSum(3) + suffixSum(3) = 6 + 4 = 10
    long expected7 = 8;  // prefixSum(4) + suffixSum(4) = 7 + 1 = 8
    assertEquals(expected1, chefSum.prefixSum(nums, 1) + chefSum.suffixSum(nums, 1));
    assertEquals(expected2, chefSum.prefixSum(nums, 2) + chefSum.suffixSum(nums, 2));
    assertEquals(expected3, chefSum.prefixSum(nums, 3) + chefSum.suffixSum(nums, 3));
    assertEquals(expected4, chefSum.prefixSum(nums2, 1) + chefSum.suffixSum(nums2, 1));
    assertEquals(expected5, chefSum.prefixSum(nums2, 2) + chefSum.suffixSum(nums2, 2));
    assertEquals(expected6, chefSum.prefixSum(nums2, 3) + chefSum.suffixSum(nums2, 3));
    assertEquals(expected7, chefSum.prefixSum(nums2, 4) + chefSum.suffixSum(nums2, 4));
  }

  @Test
  public void findMinimumIndex() {
    int[] nums = {2,1,3,1};
    int expected = 2;
    assertEquals(expected, chefSum.findMinimumIndex(nums));
  }

  @Test
  public void findMinimumIndexFast() {
    int[] nums = {2,1,3,1};
    int expected = 2;
    assertEquals(expected, chefSum.findMinimumIndexFast(nums));
  }
}

