import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many kilometers did you walked today? ");
        int distanceInKm = userInput.nextInt();
        double distanceInMiles = (distanceInKm * 0.621371);
        System.out.println("The daily kilometers walked in miles are : " + distanceInMiles );
    }
}
