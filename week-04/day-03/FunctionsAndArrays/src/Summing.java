//Not working properly at the moment//

import java.util.Scanner;

public class Summing {

    public static void main(String[] args) {
        System.out.println("Please enter an optional number : ");
        Scanner userInput = new Scanner(System.in);
        int numberByUser = userInput.nextInt();
        System.out.println("The sum of the numbers you have entered is : " + sum(numberByUser));
    }
    public static int sum(int ... number){
        int sum = 0;
        for (int i : number)
            sum += number.length;
        return(sum);
    }
}
