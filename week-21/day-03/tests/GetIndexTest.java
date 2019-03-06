import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GetIndexTest {

  public static GetIndex getIndexInstance;

  @BeforeClass
  public static void generate() {
    getIndexInstance = new GetIndex();
  }

  @Test
  public void checkMethod() {
    List inputList = null;
    int inputValue = 0;
    int expectedValue = 0;
    Assert.assertTrue(getIndexInstance.findIndex(inputList, inputValue) == expectedValue);
  }

  @Test
  public void checkIfValueIsInList() {
    List inputList = fillList0To50();
    int inputValue = 5;
    int expectedResult = 4;
    int actualResult = getIndexInstance.findIndex(inputList, inputValue);
    Assert.assertTrue(actualResult == expectedResult);
  }

  @Test
  public void valueIsNotInList() {
    List inputList = fillList0To50();
    int inputValue = 66;
    int expectedResult = -1;
    int actualResult = getIndexInstance.findIndex(inputList, inputValue);

    Assert.assertTrue(expectedResult == actualResult);
  }

  public List fillList0To50() {
    List list = new ArrayList<>();

    for (int i = 1; i <= 50; i++) {
      list.add(i);
    }
    return list;
  }

}