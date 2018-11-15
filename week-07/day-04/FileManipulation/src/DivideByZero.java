import java.util.Scanner;

public class DivideByZero {

  public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);
    System.out.println("Please enter a number to divide with!");
    int divisor = userInput.nextInt();
    divide(divisor);
  }

  public static void divide(int number) {
    try {
      int result = 10 / number;
      System.out.println("The result of the division with the choosen number is : " + result);
    } catch (ArithmeticException arEx) {
      System.out.println("You cannot divide by zero!! Try choosing another number!");
    }
  }
}

