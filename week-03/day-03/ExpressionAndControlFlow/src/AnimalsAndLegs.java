import java.util.Scanner;
public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner userInputChicken = new Scanner(System.in);
        System.out.println("How many chickens does the farmer have ? ");
        int chickenLegs = userInputChicken.nextInt() * 2 ;

        Scanner userInputPigs = new Scanner(System.in);
        System.out.println("How many pigs does the owner have ? ");
        int pigLegs = userInputPigs.nextInt() * 4 ;

        int totalLegs = chickenLegs + pigLegs;
        System.out.println("The total animal legs on the farm are : " + totalLegs);
    }
}
