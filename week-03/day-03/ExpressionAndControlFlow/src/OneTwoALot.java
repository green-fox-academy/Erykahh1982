import java.util.Scanner;
public class OneTwoALot {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter an Optional Number ");
        int optionalNumber = userInput.nextInt();
        if (optionalNumber <= 0){
            System.out.println("Not enough");
        } else if (optionalNumber == 1){
         System.out.println("One");
        } else if (optionalNumber == 2){
            System.out.println("Two");
        } else {
            System.out.println("A Lot");
        }
    }
}
