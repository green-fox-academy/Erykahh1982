import java.util.Scanner;

public class Summing {

    public static void sumAll(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of the entered numbers is : " + sum);
    }

    public static void main(String[] args) {
        int num;
        Scanner userInput = new Scanner(System.in);
        System.out.print("How many numbers you want to add together: ");
        num = userInput.nextInt();
        int[] arr2 = new int[num];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter Num" + (i + 1) + ": ");
            arr2[i] = userInput.nextInt();
        }
        sumAll(arr2);
    }
}
