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

    boolean calculatedResult = anagram.checkAnagram(s1, s2);

    assertTrue(calculatedResult);
  }

  @Test
  public void checkAnagramWithDifferentStringInput() {

    String s1 = "god";
    String s2 = "dgg";

    boolean calculatedResult = anagram.checkAnagram(s1, s2);

    assertFalse(calculatedResult);
  }
  @Test
  public void checkAnagramWithDifferentLengthStringInput() {

    String s1 = "lead";
    String s2 = "dog";

    boolean calculatedResult = anagram.checkAnagram(s1, s2);

    assertFalse(calculatedResult);
  }

  @Test
  public void checkAnagramWithNullStringInput() {

    String s1 = null;
    String s2 = null;

    boolean calculatedResult = anagram.checkAnagram(s1, s2);

    assertFalse(calculatedResult);
  }
  @Test
  public void checkAnagramForCaseSensitivity() {

    String s1 = "DoG";
    String s2 = "dOg";

    boolean calculatedResult = anagram.checkAnagram(s1, s2);

    assertFalse(calculatedResult);
  }

  @Test
  public void checkAnagramForEmptyString() {

    String s1 = "";
    String s2 = "";

    boolean calculatedResult = anagram.checkAnagram(s1, s2);

    assertFalse(calculatedResult);
  }

}
