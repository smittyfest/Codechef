package beginner.chrl4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * Solves the "Chef and Way" Codechef puzzle:
 * <p>
 * https://www.codechef.com/problems/CHRL4
 * <p>
 * After visiting a childhood friend, Chef wants to get back to his home.
 * Friend lives at the first street, and Chef himself lives at the N-th (and the last) street.
 * Their city is a bit special: you can move from the X-th street to the Y-th street if and only if
 * 1 <= Y - X <= K, where K is the integer value that is given to you.
 * Chef wants to get home in such a way that the product of all the visited streets'
 * special numbers is minimal (including the first and the N-th street).
 * Please, help him to find such a product.
 * <p>
 * Input
 * <p>
 * The first line of input consists of two integer numbers - N and K -
 * the number of streets and the value of K respectively. The second line consists
 * of N numbers - A1, A2, ..., AN respectively, where Ai equals the special number
 * of the i-th street.
 * <p>
 * Output
 * <p>
 * Please output the value of the minimal possible product, modulo 1000000007.
 * <p>
 * Constraints
 * <p>
 * 1 ≤ N ≤ 10^5
 * 1 ≤ Ai ≤ 10^5
 * 1 ≤ K ≤ N
 * <p>
 * Example
 * <p>
 * Input:
 * 4 2
 * 1 2 3 4.
 * <p>
 * Output:
 * 8
 * <p>
 * Scoring
 * <p>
 * Subtask 1 (30 points): N <= 80
 * <p>
 * Subtask 2 (70 points): See the constraints.
 */
public class Chrl4App {
  public static void main(String[] args) throws IOException {
    Chrl4 chrl4 = new Chrl4();
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int[] params = Stream.of(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int numberOfStreets = params[0];
    int k = params[1];
    int[] streets = Stream.of(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    if (numberOfStreets <= 80) {
      System.out.println(chrl4.subtask1(streets, k));
    } else {
      System.out.println(chrl4.subtask2(streets, k));
    }
  }
}
