import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

  private static Apple apple;

  @BeforeClass
  public static void init(){
    apple = new Apple("pear");
  }

  @Test
  public void getApple1() {
    String expectedApple = "pear";
    String result = apple.getApple();

    assertEquals(expectedApple,result);
  }
}