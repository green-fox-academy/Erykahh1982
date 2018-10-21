import java.util.Scanner;

public class ParametricAverage {

    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Please enter a number between 0-100! Then we will calculate with as many numbers you have entered here! Be careful!!");

        int numberOfNumbers = scannerInput.nextInt();
        int sum = 0;
        int number;

        for (int a = 0; a < numberOfNumbers; a++){
            System.out.println("Please enter another number!");
            number = scannerInput.nextInt();
            sum = sum + number;
        }
        double average = sum / numberOfNumbers;
        System.out.println("The sum of the entered numbers is : " + sum);
        System.out.println("The average of the entered numbers is : " + average);
    }
}
