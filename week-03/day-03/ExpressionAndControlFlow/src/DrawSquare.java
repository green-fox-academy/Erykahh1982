import java.util.Scanner;

public class DrawSquare {

    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("Please enter a number!");
        int numberOfRows = scannerInt.nextInt();

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfRows; j++) {
                if ((j == 0) || (j == numberOfRows - 1) || (i == 0) || (i == numberOfRows - 1)) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
