public class Counter {
  public static void main(String[] args) {
    System.out.println(recursiveCounter(15));
  }

  public static String recursiveCounter(int n) {
    if (n == 0) {
      return "0\n";
    } else {
      return n + "\n" + recursiveCounter(n - 1);
    }
  }
}


// Write a recursive function that takes one parameter: n and counts down from n.
