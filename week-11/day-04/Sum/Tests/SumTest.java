import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

  private static Sum sum;

  @BeforeClass
  public static void init(){
    sum = new Sum();
  }

  @Test
  public void sumNumbersOriginalMultipleElement() {
    ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25));

    int expectedSumResult = 75;
    int calculatedSumResult = sum.sumNumbers(listOfNumbers);

    assertEquals(expectedSumResult,calculatedSumResult);
  }

  @Test
  public void sumNumbersWithEmptyList() {
    ArrayList<Integer> listOfNumbers = new ArrayList<>();

    int expectedSumResult = 0;
    int calculatedSumResult = sum.sumNumbers(listOfNumbers);

    assertEquals(expectedSumResult,calculatedSumResult);
  }

  @Test
  public void sumNumbersWithOneElement() {
    ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1));

    int expectedSumResult = 1;
    int calculatedSumResult = sum.sumNumbers(listOfNumbers);

    assertEquals(expectedSumResult,calculatedSumResult);
  }

  @Test
  public void sumNumbersWithNull() {
    ArrayList<Integer> listOfNumbers = null;

    int expectedSumResult = 0;
    int calculatedSumResult = sum.sumNumbers(listOfNumbers);

    assertEquals(expectedSumResult,calculatedSumResult);
  }
}