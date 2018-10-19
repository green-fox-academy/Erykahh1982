import java.util.Scanner;
public class AverageOfInput {
    public static void main(String[] args) {

        Scanner userInput1 = new Scanner(System.in);
        System.out.println("How old are you ? ");
        int myAge = userInput1.nextInt();

        Scanner userInput2 = new Scanner(System.in);
        System.out.println("How old is your mother ? ");
        int motherAge = userInput2.nextInt();

        Scanner userInput3 = new Scanner(System.in);
        System.out.println("How old is your father ? ");
        int fatherAge = userInput3.nextInt();

        Scanner userInput4 = new Scanner(System.in);
        System.out.println("How old is your grandmother ? ");
        int grandmotherAge = userInput4.nextInt();

        Scanner userInput5 = new Scanner(System.in);
        System.out.println("How old is your grandfather ? ");
        int grandfatherAge = userInput5.nextInt();

        int sumOfFamilyAge = (grandfatherAge + grandmotherAge + myAge + motherAge + fatherAge);
        int averageOfFamilyAge = (sumOfFamilyAge / 5 );

        System.out.println("The sum of your family age is : " + sumOfFamilyAge);
        System.out.println("The average age of your family is : " + averageOfFamilyAge);
    }
}
