import org.junit.Test;

import static org.junit.Assert.*;

public class CowsAndBullsTest {

  @Test
  public void guess_should_return4cows_when_allRight() {
    String numberToGuess = "1234";
    CowsAndBulls cowsAndBulls = new CowsAndBulls(numberToGuess);
    String guess = numberToGuess;
    String expectedResult = "4 cows";

    String result = cowsAndBulls.guess(guess);

    assertEquals(expectedResult, result);
  }

  @Test
  public void guess_should_return1Cow_when_1Cow() {
    String numberToGuess = "1234";
    CowsAndBulls cowsAndBulls = new CowsAndBulls(numberToGuess);
    String guess = "1567";
    String expectedResult = "1 cow";

    String result = cowsAndBulls.guess(guess);

    assertEquals(expectedResult, result);
  }

  @Test
  public void guess_should_return1Cow1Bull_when_1CowAn1Bull() {
    String numberToGuess = "1234";
    CowsAndBulls cowsAndBulls = new CowsAndBulls(numberToGuess);
    String guess = "1562";
    String expectedResult = "1 cow, 1 bull";

    String result = cowsAndBulls.guess(guess);

    assertEquals(expectedResult, result);
  }

  @Test
  public void guess_should_returnNothing_when_noMatch() {
    String numberToGuess = "1234";
    CowsAndBulls cowsAndBulls = new CowsAndBulls(numberToGuess);
    String guess = "5678";
    String expectedResult = "Nothing :(";

    String result = cowsAndBulls.guess(guess);

    assertEquals(expectedResult, result);
  }

  @Test
  public void guess_should_returnError_when_longerNumber() {
    String numberToGuess = "1234";
    CowsAndBulls cowsAndBulls = new CowsAndBulls(numberToGuess);
    String guess = "56789";
    String expectedResult = "Your guess should contain only 4 digits.";

    String result = cowsAndBulls.guess(guess);

    assertEquals(expectedResult, result);
  }

  @Test
  public void guess_should_returnError_when_notDigit() {
    String numberToGuess = "1234";
    CowsAndBulls cowsAndBulls = new CowsAndBulls(numberToGuess);
    String guess = "AB3D";
    String expectedResult = "Your guess should contain only 4 digits.";

    String result = cowsAndBulls.guess(guess);

    assertEquals(expectedResult, result);
  }

  @Test
  public void defaultConstructor_should_initializeNumberToGuess() {
    int expectedLength = 4;

    CowsAndBulls cowsAndBulls = new CowsAndBulls();
    String numberToGuess = cowsAndBulls.getNumberToGuess();

    assertEquals(expectedLength, numberToGuess.length());
    assertFalse(isNumberFormatException(numberToGuess));
  }

  @Test
  public void stringConstructor_should_initializeNumberToGuessProperly() {
    String numberToGuess = "1234";

    CowsAndBulls cowsAndBulls = new CowsAndBulls(numberToGuess);

    assertEquals(numberToGuess, cowsAndBulls.getNumberToGuess());
  }

  private boolean isNumberFormatException(String numberToGuess) {
    try {
      Integer.parseInt(numberToGuess);
      return false;
    } catch (Exception e) {
      return true;
    }
  }

}