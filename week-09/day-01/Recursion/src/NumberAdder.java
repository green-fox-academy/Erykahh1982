public class NumberAdder {
  public static void main(String[] args) {
    int sum = addNumberWithRecursion(10);
    System.out.println(sum);
  }

  public static int addNumberWithRecursion(int n) {
    if (n > 1) {
      return addNumberWithRecursion(n - 1) + n;
    }
    return 1;
  }
}
