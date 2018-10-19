import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        Scanner userInput1 = new Scanner(System.in);
        System.out.println("Please enter an optional number");
        int number1 = userInput1.nextInt();

        Scanner userInput2 = new Scanner(System.in);
        System.out.println("Please enter another optional number");
        int number2 = userInput2.nextInt();

        if (number1 > number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }
}
