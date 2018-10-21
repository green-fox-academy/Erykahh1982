import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int storedNumber = 73;
            System.out.println("Try to guess the number I was thinking about between 0-100, enter a tip!");

            for (int a = 0; a < 100; a++) {
            int userGuess = userInput.nextInt();
            if (storedNumber < userGuess) {
                System.out.println("The stored number is lower");
            } else if (storedNumber > userGuess) {
                System.out.println("The stored number is higher");
            } else {
                System.out.println("You found the number: " + storedNumber);
            }
        }
    }
}
