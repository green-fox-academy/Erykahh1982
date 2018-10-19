import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args) {
        Scanner scannerUserName = new Scanner(System.in);
        System.out.println("Please Enter your name! ");
        String userName = scannerUserName.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}