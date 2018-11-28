public class Fibonacci {
  public static void main(String[] args) {
    int n = 7;
    System.out.println(nthFibonacci(n));
  }

  private static int nthFibonacci(int n) {
    if(n == 0){
      return 0;
    } else if(n == 1){
      return 1;
    } else{
     return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }
  }
}
