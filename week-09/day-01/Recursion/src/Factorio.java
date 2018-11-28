public class Factorio {
  public static void main(String[] args) {
    int factorial = 4;
    System.out.println(calcfactorial(factorial));
  }

  private static int calcfactorial(int factorial) {
    if (factorial == 0) {
      return 1;
    } else {
      return calcfactorial(factorial - 1) * factorial;
    }
  }
}
