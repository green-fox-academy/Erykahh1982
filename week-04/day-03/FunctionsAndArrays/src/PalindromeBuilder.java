
import java.util.Scanner;

public class PalindromeBuilder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput;
        System.out.println("Please enter a word or a sequence, I'll build a palindrome from it!");
        userInput = scanner.nextLine().toLowerCase();
        System.out.println(buildingAPalindrome(userInput));
    }

    public static char[] buildingAPalindrome(String input) {

        char[] word = input.toCharArray();
        char[] palindrome = new char[word.length * 2];
        int j = word.length - 1;

        for (int i = 0; i < word.length * 2; i++) {
            if (i < word.length) {
                palindrome[i] = word[i];
            } else {
                palindrome[i] = word[j];
                j--;
            }
        }
        return palindrome;
    }
}
