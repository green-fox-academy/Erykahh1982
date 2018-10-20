import java.util.Scanner;

public class CountFromTo {

    public static void main(String[] args) {
            Scanner scannerInput = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        int userInput1 = scannerInput.nextInt();

        System.out.println("Please enter another number : ");
        int userInput2 = scannerInput.nextInt();

        if (userInput2 <= userInput1){
            System.out.println("The second number should be bigger");
        } else {
            for ( int a = 0; a < (userInput2 - userInput1); a++) {
                System.out.println(userInput1 + a);
            }
        }
    }
}
