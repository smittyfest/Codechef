package beginner.cookoff;

import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the correctness of the solution for the "Chef and Cook-Off Contests"
 * Codechef puzzle:
 * <p>
 * https://www.codechef.com/problems/C00K0FF
 */
public class CookOffTest {

  private CookOff cookOff;

  @Before
  public void setUp() {
    cookOff = new CookOff();
  }

  @Test
  public void cakewalk_false() {
    Map<String, Integer> problems = Stream.of(
        new AbstractMap.SimpleEntry<>("cakewalk", 0),
        new AbstractMap.SimpleEntry<>("simple", 1),
        new AbstractMap.SimpleEntry<>("easy", 1),
        new AbstractMap.SimpleEntry<>("easy-medium", 1),
        new AbstractMap.SimpleEntry<>("medium", 1),
        new AbstractMap.SimpleEntry<>("medium-hard", 1),
        new AbstractMap.SimpleEntry<>("hard", 1))
        .collect(Collectors.toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue));
    assertEquals("No", cookOff.validate(problems));
  }

  @Test
  public void simple_false() {
    Map<String, Integer> problems = Stream.of(
        new AbstractMap.SimpleEntry<>("cakewalk", 1),
        new AbstractMap.SimpleEntry<>("simple", 0),
        new AbstractMap.SimpleEntry<>("easy", 1),
        new AbstractMap.SimpleEntry<>("easy-medium", 1),
        new AbstractMap.SimpleEntry<>("medium", 1),
        new AbstractMap.SimpleEntry<>("medium-hard", 1),
        new AbstractMap.SimpleEntry<>("hard", 1))
        .collect(Collectors.toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue));
    assertEquals("No", cookOff.validate(problems));
  }

  @Test
  public void easy_false() {
    Map<String, Integer> problems = Stream.of(
        new AbstractMap.SimpleEntry<>("cakewalk", 1),
        new AbstractMap.SimpleEntry<>("simple", 1),
        new AbstractMap.SimpleEntry<>("easy", 0),
        new AbstractMap.SimpleEntry<>("easy-medium", 1),
        new AbstractMap.SimpleEntry<>("medium", 1),
        new AbstractMap.SimpleEntry<>("medium-hard", 1),
        new AbstractMap.SimpleEntry<>("hard", 1))
        .collect(Collectors.toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue));
    assertEquals("No", cookOff.validate(problems));
  }

  @Test
  public void easyMedium_false() {
    Map<String, Integer> problems = Stream.of(
        new AbstractMap.SimpleEntry<>("cakewalk", 1),
        new AbstractMap.SimpleEntry<>("simple", 1),
        new AbstractMap.SimpleEntry<>("easy", 1),
        new AbstractMap.SimpleEntry<>("medium-hard", 1),
        new AbstractMap.SimpleEntry<>("hard", 1))
        .collect(Collectors.toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue));
    assertEquals("No", cookOff.validate(problems));
  }

  @Test
  public void hard_false() {
    Map<String, Integer> problems = Stream.of(
        new AbstractMap.SimpleEntry<>("cakewalk", 1),
        new AbstractMap.SimpleEntry<>("simple", 1),
        new AbstractMap.SimpleEntry<>("easy", 1),
        new AbstractMap.SimpleEntry<>("easy-medium", 1),
        new AbstractMap.SimpleEntry<>("hard", 0))
        .collect(Collectors.toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue));
    assertEquals("No", cookOff.validate(problems));
  }

  @Test
  public void success() {
    Map<String, Integer> problems = Stream.of(
        new AbstractMap.SimpleEntry<>("cakewalk", 1),
        new AbstractMap.SimpleEntry<>("simple", 1),
        new AbstractMap.SimpleEntry<>("easy", 1),
        new AbstractMap.SimpleEntry<>("easy-medium", 1),
        new AbstractMap.SimpleEntry<>("medium", 1),
        new AbstractMap.SimpleEntry<>("medium-hard", 1),
        new AbstractMap.SimpleEntry<>("hard", 1))
        .collect(Collectors.toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue));
    assertEquals("Yes", cookOff.validate(problems));
  }
}
