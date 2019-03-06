import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnagramTest {

  public static Anagram anagram;

  @BeforeClass
  public static void generate() {
    anagram = new Anagram();
  }

  @Test
  public void checkIfStringsExists() {
    String input1 = "word";
    String input2 = "sentence";

    boolean expectedResult = false;
    boolean actualResult = anagram.checkIfAnagram(input1, input2);
    Assert.assertTrue(expectedResult == actualResult);
  }

  @Test
  public void checkIfStringsAreNull() {
    String input1 = null;
    String input2 = null;

    boolean expectedRestult = false;
    boolean actualResult = anagram.checkIfAnagram(input1, input2);
    Assert.assertTrue(expectedRestult == actualResult);
  }

  @Test
  public void checkIfStringsAreEqual() {
    String input1 = "akire";
    String input2 = "erika";

    boolean expectedResult = true;
    boolean actualResult = anagram.checkIfSizeEquals(input1, input2);

    Assert.assertTrue(expectedResult == actualResult);
  }

  @Test
  public void checkIfStringsNotEqual() {
    String input1 = "word";
    String input2 = "sentence";

    boolean expectedResult = false;
    boolean actualResult = anagram.checkIfSizeEquals(input1, input2);

    Assert.assertTrue(expectedResult == actualResult);
  }

  @Test
  public void checkIfInputsAreAnagram() {
    String input1 = "erika";
    String input2 = "akire";

    boolean expectedResult = true;
    boolean actualResult = anagram.checkIfAnagram(input1, input2);

    Assert.assertTrue(expectedResult == actualResult);
  }

  @Test
  public void checkIfInputsAreNotAnagram() {
    String input1 = "erika";
    String input2 = "eeeee";

    boolean expectedResult = false;
    boolean actualResult = anagram.checkIfAnagram(input1, input2);

    Assert.assertFalse(expectedResult == actualResult);
  }

  @Test
  public void checkIfInputsAreEmpty() {
    String input1 = "";
    String input2 = "";

    boolean expectedResult = false;
    boolean actualResult = anagram.checkIfAnagram(input1, input2);

    Assert.assertTrue(expectedResult == actualResult);
  }

}