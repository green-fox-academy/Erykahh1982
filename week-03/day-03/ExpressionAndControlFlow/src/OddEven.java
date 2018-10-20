import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int aNumber = userInput.nextInt();
        if (aNumber % 2 == 0) {
            System.out.println("Your Number is an Even Number");
        } else {
            System.out.println("Your Number is and Odd Number");
        }
    }
}