import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter an operation and two numbers with which I will calculate the result.");
    System.out.println("Pay attention to the style of input it has to be as follows | eg.: {+ 3 3} without the curly parenthesis");
    String userInput = input.nextLine();
    System.out.println("Entered user input is: " + (userInput));
    System.out.println("User input status check done? | " + checkIfInputIsOk(userInput));
    output(calculate(userInput));

  }

  public static boolean checkIfInputIsOk(String input) {
    boolean inputStatus;
    String[] fields = input.split(" ");
    if (fields.length == 3) {
      return inputStatus = true;
    } else {
      return inputStatus = false;
    }
  }

  public static int calculate(String input) {

    if (checkIfInputIsOk(input)) {
      String[] fields = input.split(" ");
      String operationFiled = fields[0];
      int operand1 = Integer.parseInt(fields[1]);
      int operand2 = Integer.parseInt(fields[2]);

      int result = Integer.MIN_VALUE;
      switch (operationFiled) {
        case ("+"):
          result = operand1 + operand2;
          break;
        case ("-"):
          result = operand1 - operand2;
          break;
        case ("*"):
          result = operand1 * operand2;
          break;
        case ("/"):
          result = operand1 / operand2;
          break;
        case ("%"):
          result = operand1 % operand2;
          break;
      }
      return result;
    } else {
      return 0;
    }
  }

  public static void output(int result) {
    if (result == Integer.MIN_VALUE) {
      System.out.println("You may have entered something incorrectly, please try it again");
    } else {
      System.out.println("The result of the calculation is: " + result);
    }
  }

}