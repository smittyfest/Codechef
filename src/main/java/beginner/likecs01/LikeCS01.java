package beginner.likecs01;

import java.util.HashSet;
import java.util.Set;

/**
 * This class contains logic for solving the
 * "Subsequence Equality" Codechef puzzle:
 * <p>
 * https://www.codechef.com/problems/LIKECS01
 */
public class LikeCS01 {

  public String hasEqualSubsequences(String sequence) {
    Set<Character> elements = new HashSet<>();
    for (int i = 0; i < sequence.length(); i++) {
      if (!elements.add(sequence.charAt(i))) {
        return "yes";
      }
    }
    return "no";
  }
}
