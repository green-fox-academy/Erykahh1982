import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a number for which I will calculate its factorial number:  ");
        int number = userInput.nextInt();

        System.out.println("The factorial of the given number is: " + factorio(number));
    }

    private static int factorio(int n){
        int factorial = 1;
        for (int i = 0; i < n; i++) {
            factorial *= i+1;
        }
        return factorial;
    }
}
