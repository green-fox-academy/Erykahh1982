public class Bunnies2 {
  public static void main(String[] args) {
    System.out.println(bunnies2(4));
  }

  private static int bunnies2(int n) {
    if (n == 1) {
      return 2;
    } else if (n == 2) {
      return 5;
    } else {
      if (n % 2 == 0) {
        return 3 + bunnies2(n - 1);
      } else {
        return 2 + bunnies2(n - 1);
      }
    }
  }
}
