import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userInput = scannerInt.nextInt();
        for (int a = 0; a < 10; a++) {
            System.out.println((a + 1) + " * " + userInput + " = " + ((a + 1) * userInput));
        }
    }
}
