import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

public class Power {
  public static void main(String[] args) {
    System.out.println(power(3, 5));
  }

  public static int power(int base, int n) {
    int result = 1;
    if (n == 0) {
      return 1;
    }
    return power(base, n - 1) * base;
  }
}
