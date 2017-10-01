package beginner.rgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * Solves the "Rupsa and the Game" Codechef puzzle:
 * <p>
 * https://www.codechef.com/problems/RGAME
 * <p>
 * Princess Rupsa saw one of her friends playing a special game.
 * The game goes as follows:
 * <p>
 * N+1 numbers occur sequentially (one at a time) from A0 to AN.
 * You must write the numbers on a sheet of paper, such that A0 is written first.
 * The other numbers are written according to an inductive rule —
 * after Ai-1 numbers have been written in a row, then Ai can be written at either
 * end of the row. That is, you first write A0, and then A1 can be written on its
 * left or right to make A0A1 or A1A0, and so on.
 * Ai must be written before writing Aj, for every i < j.
 * For a move in which you write a number Ai (i>0), your points increase by the
 * product of Ai and its neighbour. (Note that for any move it will have only one
 * neighbour as you write the number at an end).
 * <p>
 * Total score of a game is the score you attain after placing all the N + 1 numbers.
 * Princess Rupsa wants to find out the sum of scores obtained by all possible different
 * gameplays. Two gameplays are different, if after writing down all N + 1 numbers,
 * when we read from left to right, there exists some position i, at which the gameplays
 * have aj and ak written at the ith position such that j ≠ k. But since she has recently
 * found her true love, a frog Prince, and is in a hurry to meet him, you must help her
 * solve the problem as fast as possible. Since the answer can be very large,
 * print the answer modulo 109 + 7.
 * <p>
 * Input:
 * <p>
 * The first line of the input contains an integer T denoting the number of test cases.
 * The first line of each test case contains a single integer N.
 * The second line contains N + 1 space-separated integers denoting A0 to AN.
 * <p>
 * Output:
 * <p>
 * For each test case, output a single line containing an integer denoting the answer.
 * <p>
 * Constraints
 * <p>
 * 1 ≤ T ≤ 10
 * 1 ≤ N ≤ 105
 * 1 ≤ Ai ≤ 109
 * <p>
 * Sub tasks
 * <p>
 * Subtask #1: 1 ≤ N ≤ 10 (10 points)
 * Subtask #2: 1 ≤ N ≤ 1000 (20 points)
 * Subtask #3: Original Constraints (70 points)
 * <p>
 * Example
 * <p>
 * Input:
 * 2
 * 1
 * 1 2
 * 2
 * 1 2 1
 * <p>
 * Output:
 * 4
 * 14
 * <p>
 * Explanation
 * <p>
 * There are 2 possible gameplays. A0A1 which gives score of 2 and A1A0
 * which also gives score of 2. So the answer is 2 + 2 = 4
 */
public class RGameApp {
  public static void main(String[] args) throws IOException {
    RGame rGame = new RGame();
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int numberOfTestCases = Integer.parseInt(in.readLine());
    for (int i = 0; i < numberOfTestCases; i++) {
      int n = Integer.parseInt(in.readLine());
      long sum = rGame.findSum(Stream.of(
          in.readLine().split(" "))
          .mapToInt(Integer::parseInt)
          .toArray());
      System.out.println(sum);
    }
  }
}
