import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("How old are you ? ");
        int myAge = userInput.nextInt();

        System.out.println("How old is your mother ? ");
        int motherAge = userInput.nextInt();

        System.out.println("How old is your father ? ");
        int fatherAge = userInput.nextInt();

        System.out.println("How old is your grandmother ? ");
        int grandmotherAge = userInput.nextInt();

        System.out.println("How old is your grandfather ? ");
        int grandfatherAge = userInput.nextInt();

        int sumOfFamilyAge = (grandfatherAge + grandmotherAge + myAge + motherAge + fatherAge);
        int averageOfFamilyAge = (sumOfFamilyAge / 5 );

        System.out.println("The sum of your family age is : " + sumOfFamilyAge);
        System.out.println("The average age of your family is : " + averageOfFamilyAge);
    }
}
