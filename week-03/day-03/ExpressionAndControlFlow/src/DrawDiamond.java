import java.util.Scanner;

public class DrawDiamond {

    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);
        System.out.println("Please enter an ODD number!");

        int userInput = scannerIn.nextInt();
        int numberOfColumns = 1;
        int numberOfSpaces = userInput / 2;
        for (int numberOfRows = 1; numberOfRows <= userInput; numberOfRows++) {
            for (int k = numberOfSpaces; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int numberOfStars = 1; numberOfStars <= numberOfColumns; numberOfStars++) {
                System.out.print("*");
            }
            System.out.println();
            if (numberOfRows < userInput / 2 + 1) {
                numberOfColumns += 2;
                numberOfSpaces -= 1;
            } else {
                numberOfColumns -= 2;
                numberOfSpaces += 1;
            }
        }
    }
}
