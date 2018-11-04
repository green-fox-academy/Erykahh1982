import java.util.Scanner;

public class Factorio {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number for which I will calculate its factorial : ");
        int number = userInput.nextInt();
       System.out.println("The factorial value of the given number is : " + factNum(number));
    }

    public static int factNum(int x) {
        int factorial = 1;
        for (int i = 0; i < x ; i++) {
            factorial = factorial * (i + 1);
        }
        return factorial;
    }
}
