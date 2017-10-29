package beginner.sebihwy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * Solves the "Sebi and the Highway" Codechef puzzle:
 * <p>
 * https://www.codechef.com/problems/SEBIHWY
 * <p>
 * Sebi goes to school daily with his father.
 * They cross a big highway in the car to reach the school.
 * Sebi sits in the front seat beside his father at driving seat.
 * To kill boredom, they play a game of guessing speed of other
 * cars on the highway. Sebi makes a guess of other car's speed
 * being SG kph, his father FG kph.
 * The highway is usually empty, so the drivers use cruise control,
 * i.e. vehicles run at a constant speed. There are markers on the
 * highway at a gap of 50 meters. Both father-son duo wants to
 * check the accuracy of their guesses. For that, they start a timer
 * at the instant at which their car and the other car (which speed
 * they are guessing) are parallel to each other (they need not to
 * be against some marker, they can be in between the markers too).
 * After some T seconds, they observe that both the cars are next to
 * some markers and the number of markers in between the markers of
 * their car and the other car is D - 1 (excluding the markers next
 * to both the cars). Also, they can observe these markers easily
 * because the other car is faster than theirs. Speed of Sebi's
 * father's car is S. Using this information, one can find the speed
 * of the other car accurately.
 * <p>
 * An example situation when Sebi's father starts the timer.
 * Notice that both the car's are parallel to each other.
 * |                        |
 *    ______
 *   /|_||_\`.__
 *  (   _    _ _\
 *  =`-(_)--(_)-'
 *  ====  ====  ====  ====  ====  ====  ====  ====  ====  ====
 *    ______
 *   /|_||_\`.__
 *  (   _    _ _\
 *  =`-(_)--(_)-'
 * |                        |
 * Example situation after T seconds.
 * The cars are next to the markers. Here the value of D is 1.
 * The green car is Sebi's and the other car is of blue color.
 * |                        |
 *    ______
 *   /|_||_\`.__
 *  (   _    _ _\
 *  =`-(_)--(_)-'
 *  ====  ====  ====  ====  ====  ====  ====  ====  ====  ====
 *                            ______
 *                           /|_||_\`.__
 *                          (   _    _ _\
 *                          =`-(_)--(_)-'
 * |                        |
 * Sebi's a child, he does not know how to find the check whose guess
 * is close to the real speed of the car. He does not trust his father
 * as he thinks that he might cheat. Can you help to resolve this issue
 * between them by telling whose guess is closer. If Sebi's guess is better,
 * output "SEBI". If his father's guess is better, output "FATHER".
 * If both the guess are equally close, then output "DRAW".
 * <p>
 * Input
 * <p>
 * The first line of the input contains an integer T
 * denoting the number of test cases.
 * <p>
 * Each of the next T lines contain five space separated integers S, SG, FG, D, T
 * corresponding to the Sebi's car speed, Sebi's guess, his father's guess,
 * D as defined in the statement and the time at which both the cars at against
 * the markers (in seconds), respectively.
 * <p>
 * Output
 * <p>
 * For each test case, output a single line containing "SEBI",
 * "FATHER" or "DRAW" (without quotes) denoting whose guess is better.
 * <p>
 * Constraints
 * <p>
 * 1 ≤ T ≤ 10000
 * 0 ≤ S ≤ 130
 * 0 ≤ SG, FG ≤ 300
 * 1 ≤ D ≤ 30
 * 1 ≤ T ≤ 300
 * The other car speed doesn't exceed 300 kph.
 * <p>
 * Example
 * <p>
 * Input:
 * <p>
 * 2
 * 100 180 200 20 60
 * 130 131 132 1 72
 * <p>
 * Output:
 * <p>
 * SEBI
 * FATHER
 * <p>
 * Explanation
 * <p>
 * Example case 1.
 * <p>
 * There are total 20 - 1 = 19 markers in between the Sebi's car and
 * the other car. So, the distance between those cars at time T is
 * 20 * 50 = 1000 meters = 1 km.
 * <p>
 * As T = 60 seconds, i.e. 1 minutes. So, the other car goes 1 km more
 * than Sebi's car in 1 minute. So, the other car will go 60 km more than
 * Sebi's car in 1 hour. So, its speed is 60 kmph more than Sebi's car, i.e. 160 kmph.
 * <p>
 * Sebi had made a guess of 180 kmph, while his father of 200 kmph.
 * Other car's real speed is 160 kmph. So, Sebi's guess is better than his father.
 * Hence he wins the game.
 * <p>
 * Example case 2.
 * <p>
 * The situation of this example is depicted in the image provided in the statement.
 * You can find the speed of other car and see that Father's guess is more accurate.
 */
public class SebiHwyApp {
  public static void main(String [] args) throws IOException {
    SebiHwy sebiHwy = new SebiHwy();
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int numberOfTestCases = Integer.parseInt(in.readLine());
    for (int i = 0; i < numberOfTestCases; i++) {
      int[] params = Stream.of(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      System.out.println(sebiHwy.determineWinner(params));
    }
  }
}
