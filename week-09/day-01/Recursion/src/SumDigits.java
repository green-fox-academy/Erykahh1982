public class SumDigits {
  public static void main(String[] args) {
    int num = 456;
    int result = sumOfDigit(num);
    System.out.println("The sum of digits " + " of number " + num + " is : " + result);
  }

  public static int sumOfDigit(int n) {
    if (n == 0) {
      return 0;
    } else {
      return n % 10 + sumOfDigit(n / 10);
    }
  }
}
