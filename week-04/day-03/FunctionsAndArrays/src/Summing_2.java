import java.util.Scanner;

public class Summing_2 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int number = userInput.nextInt();
        System.out.println("The sum of the numbers from 1 till the given number is : " + sumNumber(number));
    }

    public static int sumNumber(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
