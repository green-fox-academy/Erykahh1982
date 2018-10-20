import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter an optional number");
        int number1 = userInput.nextInt();

        System.out.println("Please enter another optional number");
        int number2 = userInput.nextInt();
        if (number1 > number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }
}
