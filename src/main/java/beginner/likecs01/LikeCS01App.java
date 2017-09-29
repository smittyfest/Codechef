package beginner.likecs01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Solves the "Subsequence Equality" Codechef puzzle:
 * <p>
 * https://www.codechef.com/problems/LIKECS01
 * <p>
 * Chef Tobby is playing a rapid fire with Bhuvan.
 * He gives Bhuvan a string S and each time, Bhuvan has to guess
 * whether there exists 2 equal subsequences in the string or not.
 * <p>
 * Bhuvan got a perfect score in the game with Chef Tobby.
 * However, Chef Tobby has now asked Bhuvan to write a program that
 * will do this automatically given a string S.
 * Bhuvan is an intelligent man but he does not know how to write a code.
 * Can you help him?
 * <p>
 * Find two different subsequences such that they are equal in their value,
 * more formally, find two sequences of indices
 * (a1, a2, ..., ak-1, ak) and (b1, b2, ..., bk-1, bk) such that:
 * <p>
 * 1. 1≤ ai, bi ≤ |S|
 * 2. ai < ai+1 for all valid i
 * 3. bi < bi+1 for all valid i
 * 4. Sai = Sbi for all valid i
 * 5. there exist at least one i such that ai is not equal to bi
 * <p>
 * Input section
 * <p>
 * The first line contains T, the number of test cases.
 * Each of the next T lines contain one string S each.
 * Input will only consist of lowercase english characters.
 * <p>
 * Output section
 * <p>
 * For each test case, output "yes" or "no" (without quotes)
 * as the solution to the problem.
 * <p>
 * Input constraints
 * <p>
 * 1 ≤ T ≤ 1000
 * 1 ≤ length of S ≤ 100
 * <p>
 * Sample Input:
 * <p>
 * 4
 * likecs
 * venivedivici
 * bhuvan
 * codechef
 * <p>
 * Sample Output:
 * <p>
 * no
 * yes
 * no
 * yes
 * <p>
 * Explanation
 * <p>
 * In test case 2, one of the possible equal subsequence is "vi" and "vi".
 * (one at position {0, 3} and other at {4, 7}, assuming 0-based indexing).
 * In test case 4, one of the possible equal subsequence is "ce" and "ce".
 * (one at position {0, 3} and other at {4, 6}, assuming 0-based indexing).
 */
public class LikeCS01App {
  public static void main(String[] args) throws IOException {
    LikeCS01 likeCS01 = new LikeCS01();
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int numberOfTestCases = Integer.parseInt(in.readLine());
    for (int i = 0; i < numberOfTestCases; i++) {
      System.out.println(likeCS01.hasEqualSubsequences(in.readLine()));
    }
  }
}
