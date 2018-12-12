import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

  private static Apple apple;

  @BeforeClass
  public static void init(){
    apple = new Apple("apple");
  }

  @Test
  public void getApple() {
    Apple myObject = new Apple("apple");
    assertEquals("apple",myObject.getApple());
  }
}