package beginner.alextask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * Solves the "Task for Alexey" Codechef puzzle:
 * <p>
 * https://www.codechef.com/problems/ALEXTASK
 * <p>
 * Alexey is trying to develop a program for a very simple microcontroller.
 * It makes readings from various sensors over time, and these readings
 * must happen at specific regular times.
 * Unfortunately, if two of these readings occur at the same time,
 * the microcontroller freezes and must be reset.
 * There are N different sensors that read data on a regular basis.
 * For each i from 1 to N, the reading from sensor i will occur every
 * Ai milliseconds with the first reading occurring exactly Ai milliseconds
 * after the microcontroller is powered up. Each reading takes precisely
 * one millisecond on Alexey's microcontroller.
 * Alexey wants to know when the microcontroller will freeze after he turns it on.
 * <p>
 * Input
 * <p>
 * The first line of the input contains an integer T
 * denoting the number of test cases. The description of T test cases follows.
 * <p>
 * The first line contains single integer N denoting the number of sensors.
 * The second line contains N space-separated integers A1, A2, ..., AN
 * denoting frequency of measurements. Namely, sensor i will be read every
 * Ai milliseconds with the first reading occurring Ai milliseconds after the
 * microcontroller is first turned on.
 * <p>
 * Output
 * <p>
 * For each test case, output a single line containing the number of milliseconds
 * until the microcontroller freezes.
 * <p>
 * Constraints
 * <p>
 * 1 ≤ T ≤ 10
 * 2 ≤ N ≤ 500
 * 1 ≤ Ai ≤ 109
 * <p>
 * Subtasks
 * <p>
 * Subtask #1 (10 points) 1 ≤ T ≤ 10, 2 ≤ N ≤ 9, 1 ≤ Ai ≤ 500
 * Subtask #2 (20 points) 1 ≤ T ≤ 10, 2 ≤ N ≤ 500, 1 ≤ Ai ≤ 1000
 * Subtask #3 (70 points) original constraints
 * <p>
 * Example
 * <p>
 * Input:
 * 3
 * 3
 * 2 3 5
 * 4
 * 1 8 7 11
 * 4
 * 4 4 5 6
 * <p>
 * Output:
 * 6
 * 7
 * 4
 * <p>
 * Explanation
 * <p>
 * Case 1: in 6 milliseconds, the third reading will be attempted
 * from the 1st sensor and the second reading will be attempted from the 2nd sensor.
 * <p>
 * Case 2: in 7 milliseconds the seventh reading will be attempted
 * from the 1st sensor and the first reading will be attempted from the 3rd sensor.
 * <p>
 * Case 3: in 4 milliseconds, the first readings from the first two sensors will be attempted.
 */
public class AlexTaskApp {
  public static void main(String[] args) throws IOException {
    AlexTask alexTask = new AlexTask();
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int numberOfTestCases = Integer.parseInt(in.readLine());
    for (int i = 0; i < numberOfTestCases; i++) {
      int numberOfSensors = Integer.parseInt(in.readLine());
      int[] frequencies = Stream.of(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      System.out.println(alexTask.getTimeOfFreezing(frequencies));
    }
  }
}
