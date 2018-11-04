import java.util.Scanner;

public class Factorio_2{

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number for which I will calculate its factorial : ");
        int number = userInput.nextInt();
        display(factNum(number));
    }

    public static int factNum(int x) {
        int factorial = 1;
        for (int i = 0; i < x ; i++) {
            factorial = factorial * (i + 1);
        }
        return factorial;
    }

    public static void  display(int y){
        System.out.println("Result is: " + y);
        }
    }


