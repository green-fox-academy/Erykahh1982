import java.util.Scanner;

public class DrawPyramid {

    public static void main(String[] args) {
            Scanner scannerInput = new Scanner(System.in);
        System.out.println("Please enter an optional number:");
        int height = scannerInput.nextInt();

        for (int i = 0; i < height; i++) {
            int emptySpaces = (height - i - 1);
            for (int j = 0; j < (height * 2 - 1); j++) {
                if ((j < emptySpaces) || (j > 2 * i + emptySpaces)){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}