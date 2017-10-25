package beginner.cookoff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Solves the "Chef and Cook-Off Contests" Codechef puzzle:
 * <p>
 * https://www.codechef.com/problems/C00K0FF
 * <p>
 * Chef wants to prepare a Cook-Off contest with 5 problems
 * chosen from a set of N problems. He has marked the
 * difficulty of each problem within a range identified by
 * one of the following strings:
 * <p>
 * "cakewalk",
 * "simple",
 * "easy",
 * "easy-medium",
 * "medium",
 * "medium-hard",
 * "hard".
 * <p>
 * According to this page, a Cook-Off contest must have
 * problems of the following difficulties:
 * <p>
 * exactly one "cakewalk";
 * exactly one "simple";
 * exactly one "easy";
 * one "easy-medium" or one "medium";
 * one "medium-hard" or one "hard".
 * <p>
 * Given the information about the N problems, can you
 * advise Chef if it's possible to pick 5 problems and
 * form a valid Cook-Off contest?
 * <p>
 * Input
 * <p>
 * The first line of input contains one integer T
 * denoting the number of test cases.
 * T test cases follow.
 * The first line of each test case contains a single integer N.
 * Then N lines follow; the i-th line contains a single string si,
 * denoting the difficulty of the i-th problem.
 * <p>
 * Output
 * <p>
 * For each test case, output "Yes" if it's possible to pick
 * 5 problems and form a valid Cook-Off contest; otherwise, output "No".
 * <p>
 * Constraints
 * <p>
 * 1 ≤ T ≤ 100000
 * 5 ≤ N ≤ 100000
 * sum of N in all test cases ≤ 600000
 * si can only be one of the following strings:
 * <p>
 * "cakewalk"
 * "simple"
 * "easy"
 * "easy-medium"
 * "medium"
 * "medium-hard"
 * "hard"
 * <p>
 * Subtask #1 (11 points): N = 5
 * Subtask #2 (27 points): 5 ≤ N ≤ 15, T ≤ 100
 * Subtask #3 (62 points): original constraints
 * <p>
 * Example
 * <p>
 * Input:
 * <p>
 * 3
 * 5
 * easy
 * medium
 * medium-hard
 * simple
 * cakewalk
 * 7
 * simple
 * simple
 * medium
 * medium
 * easy-medium
 * cakewalk
 * easy
 * 7
 * cakewalk
 * simple
 * easy
 * easy-medium
 * medium
 * medium-hard
 * hard
 * <p>
 * Output:
 * <p>
 * Yes
 * No
 * Yes
 * <p>
 * Explanation
 * <p>
 * Example case 2: There are neither problems of "medium-hard" level
 * nor "hard" level, so it's impossible to form a Cook-Off contest.
 */
public class CookOffApp {
  public static void main(String[] args) throws IOException {
    CookOff cookOff = new CookOff();
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int numberOfTestCases = Integer.parseInt(in.readLine());
    for (int i = 0; i < numberOfTestCases; i++) {
      int numberOfProblems = Integer.parseInt(in.readLine());
      Map<String, Integer> problems = new HashMap<>();
      for (int j = 0; j < numberOfProblems; j++) {
        problems.merge(in.readLine(), 1, Integer::sum);
      }
      System.out.println(cookOff.validate(problems));
    }
  }
}
