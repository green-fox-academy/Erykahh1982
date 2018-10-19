import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        Scanner userInput1 = new Scanner(System.in);
        System.out.println("Enter the number of GIRLS that comes to the party: ");
        int girlNumber = userInput1.nextInt();

        Scanner userInput2 = new Scanner(System.in);
        System.out.println("Enter the number of BOYS that comes to the party : ");
        int boyNumber = userInput2.nextInt();

        int numberOfPeopleTotal = boyNumber + girlNumber;

        if ((girlNumber == boyNumber) && (numberOfPeopleTotal >= 20)) {
            System.out.println("The party is excellent!");
        } else if ((girlNumber != boyNumber) && (numberOfPeopleTotal >= 20)) {
            System.out.println("Quite cool party!");
        } else if (numberOfPeopleTotal < 20) {
            System.out.println("Average party ...");
        }
        if (girlNumber == 0) {
            System.out.println("Sausage party");
        }
    }
}