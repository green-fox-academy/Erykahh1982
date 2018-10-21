import java.util.Scanner;

public class DrawDiagonal {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number!");

        int numberOfRows = userInput.nextInt();
        for (int a = 0; a < numberOfRows; a++) {
            for (int b = 0; b < numberOfRows; b++) {
                if (a == 0 || a == (numberOfRows - 1) || a == b || b == 0 || b == (numberOfRows - 1)) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
