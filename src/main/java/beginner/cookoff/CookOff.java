package beginner.cookoff;

import java.util.Map;

/**
 * This class contains logic for solving the
 * "Chef and Cook-Off Contests" Codechef puzzle:
 * <p>
 * https://www.codechef.com/problems/C00K0FF
 */
public class CookOff {

  public String validate(Map<String, Integer> problems) {
    boolean cakewalk = problems.getOrDefault("cakewalk", 0) > 0;
    boolean simple = problems.getOrDefault("simple", 0) > 0;
    boolean easy = problems.getOrDefault("easy", 0) > 0;
    boolean easyMedium = problems.getOrDefault("easy-medium", 0) > 0;
    boolean medium = problems.getOrDefault("medium", 0) > 0;
    boolean mediumHard = problems.getOrDefault("medium-hard", 0) > 0;
    boolean hard = problems.getOrDefault("hard", 0) > 0;
    return cakewalk && simple && easy && (easyMedium || medium) && (mediumHard || hard) ? "Yes" : "No";
  }
}
