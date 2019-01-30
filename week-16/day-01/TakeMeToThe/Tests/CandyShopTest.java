import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CandyShopTest {

  private static CandyShop candyShop;

  @BeforeClass
  public static void init() {
    candyShop = new CandyShop(100);
  }

  @Test
  public void testFindNumberOfCandies() {
    int counter = 0;
    int expectedResult = 0;
    int result = candyShop.findNumberOfCandies();
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void testFindNumberOfCandies_2() {
    int counter = 1;
    int expectedResult = 0;
    int result = candyShop.findNumberOfCandies();
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void testFindNumberOfCandiesNullCounter() {
    int expectedResult = 0;
    int result = candyShop.findNumberOfCandies();
    Assert.assertEquals(expectedResult, result);
  }

}