import java.util.Scanner;

public class AnimalsAndLegs {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many chickens does the farmer have ? ");
        int chickenLegs = userInput.nextInt() * 2 ;

        System.out.println("How many pigs does the owner have ? ");
        int pigLegs = userInput.nextInt() * 4 ;

        int totalLegs = chickenLegs + pigLegs;
        System.out.println("The total animal legs on the farm are : " + totalLegs);
    }
}
