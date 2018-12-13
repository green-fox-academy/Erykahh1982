import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  private static Anagram anagram;

  @BeforeClass
  public static void init(){
    anagram = new Anagram();
  }

  @Test
  public void checkAnagramWithSameStringInput() {

    String s1 = "god";
    String s2 = "dog";

    boolean expectedResult = true;
    boolean calculatedResult = anagram.checkAnagram(s1, s2);

    assertEquals(expectedResult, calculatedResult);
  }

  @Test
  public void checkAnagramWithDifferentStringInput() {

    String s1 = "one";
    String s2 = "dog";

    boolean expectedResult = true;
    boolean calculatedResult = anagram.checkAnagram(s1, s2);

    assertEquals(expectedResult, calculatedResult);
  }
}
