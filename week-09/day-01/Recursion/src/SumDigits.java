public class SumDigits {
  public static void main(String[] args) {
    int num = 456;
    int result = sum_of_digit(num);
    System.out.println("The sum of digits is : " + "is " + result);
  }

  public static int sum_of_digit(int n) {
    if (n == 0) {
      return 0;
    } else {
      return(n % 10 + sum_of_digit(n/10));
    }
  }
}
