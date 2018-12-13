import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {

  private static CountLetters countLetters;

  @Test
  public void testCountLetters() {
    String s = "alma";
    String s2 = "apple";
    Map<Character, Integer> expectedSLetterCounts = new HashMap<>();
    expectedSLetterCounts.put('a', 2);
    expectedSLetterCounts.put('l', 1);
    expectedSLetterCounts.put('m', 1);
    Map<Character, Integer> expectedS2LetterCounts = new HashMap<>();
    expectedS2LetterCounts.put('a', 1);
    expectedS2LetterCounts.put('l', 1);
    expectedS2LetterCounts.put('p', 2);
    expectedS2LetterCounts.put('e', 1);

    Map<Character, Integer> sLetterCounts = CountLetters.countLetters(s);
    Map<Character, Integer> s2LetterCounts = CountLetters.countLetters(s2);

    assertEquals(expectedSLetterCounts, sLetterCounts);
    assertEquals(expectedS2LetterCounts, s2LetterCounts);
  }

  @Test
  public void countLetters_should_returnEmptyMap_when_nullGiven() {
    Map<Character, Integer> expectedResult = new HashMap<>();

    Map<Character, Integer> result = CountLetters.countLetters(null);

    assertEquals(expectedResult, result);
  }

  @Test
  public void countLetters_should_returnEmptyMap_when_emptyGiven() {
    String s = "";
    Map<Character, Integer> expectedResult = new HashMap<>();

    Map<Character, Integer> result = CountLetters.countLetters(s);

    assertEquals(expectedResult, result);
  }

}