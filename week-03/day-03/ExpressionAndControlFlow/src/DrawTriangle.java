import java.util.Scanner;

import static java.lang.System.*;

public class DrawTriangle {

    public static void main(String[] args) {
            Scanner scannerInput = new Scanner(in);
        System.out.println("Please enter a number : ");
        int input = scannerInput.nextInt();
        String star = "";
        for (int a = 0; a <= input ; a++){
             star = star + "*";
            System.out.println(star);
        }
    }
}
