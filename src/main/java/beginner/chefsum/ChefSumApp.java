package beginner.chefsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * Solves the "Little Chef and Sums" Codechef puzzle:
 * <p>
 * https://www.codechef.com/problems/CHEFSUM
 * <p>
 * Our little chef is fond of doing additions/sums in his free time.
 * Today, he has an array A consisting of N positive integers and he
 * will compute prefix and suffix sums over this array.
 * He first defines two functions prefixSum(i) and suffixSum(i) for
 * the array as follows. The function prefixSum(i) denotes the sum of
 * the first i numbers of the array. Similarly, he defines suffixSum(i)
 * as the sum of last N - i + 1 numbers of the array.
 * <p>
 * Little Chef is interested in finding the minimum index i for which
 * the value prefixSum(i) + suffixSum(i) is the minimum. In other words,
 * first you should minimize the value of prefixSum(i) + suffixSum(i),
 * and then find the least index i for which this value is attained.
 * <p>
 * Since, he is very busy preparing the dishes for the guests,
 * can you help him solve this problem?
 * <p>
 * Input
 * The first line of the input contains an integer T denoting the number
 * of test cases.
 * The first line of each test case contains a single integer N denoting
 * the number of integers in the array A.
 * The second line contains N space-separated integers A1, A2, ...,
 * AN denoting the array A.
 * <p>
 * Output
 * For each test case, output a single line containing the answer.
 * <p>
 * Constraints
 * 1 ≤ T ≤ 10
 * 1 ≤ N, A[i] ≤ 105
 * <p>
 * Subtasks
 * Subtask #1 : (20 points) 1 ≤ N ≤ 100
 * Subtask #2 : (80 points) Original constraints
 * <p>
 * Example
 * Input:
 * 2
 * 3
 * 1 2 3
 * 4
 * 2 1 3 1
 * <p>
 * Output:
 * 1
 * 2
 * <p>
 * Explanation
 * Example case 1. Let's calculate prefixSum(i) + suffixSum(i)
 * for all indexes i in the sample case.
 * <p>
 * prefixSum(1) + suffixSum(1) = 1 + 6 = 7
 * prefixSum(2) + suffixSum(2) = 3 + 5 = 8
 * prefixSum(3) + suffixSum(3) = 6 + 3 = 9
 * <p>
 * The minimum value of the function is 7,
 * which is attained at index 1, so the answer would be 1.
 * <p>
 * Example case 2. Let's calculate prefixSum(i) + suffixSum(i)
 * for all indexes i in the sample case.
 * <p>
 * prefixSum(1) + suffixSum(1) = 2 + 7 = 9
 * prefixSum(2) + suffixSum(2) = 3 + 5 = 8
 * prefixSum(3) + suffixSum(3) = 6 + 4 = 10
 * prefixSum(4) + suffixSum(4) = 7 + 1 = 8
 * <p>
 * The minimum value of the function is 8, which is achieved for
 * indices 2 and 4. The minimum of these two indices 2, 4 is index 2.
 * Hence, the answer will be 2.
 */
public class ChefSumApp {
  public static void main(String[] args) throws IOException {
    ChefSum chefSum = new ChefSum();
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int numberOfTestCases = Integer.parseInt(in.readLine());
    for (int i = 0; i < numberOfTestCases; i++) {
      int numberOfElements = Integer.parseInt(in.readLine());
      int[] elements = Stream.of(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      System.out.println(chefSum.findMinimumIndex(elements));
    }
  }
}
