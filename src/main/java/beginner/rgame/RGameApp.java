package beginner.rgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

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
