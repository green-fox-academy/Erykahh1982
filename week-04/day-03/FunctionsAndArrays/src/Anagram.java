import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("I am gonna check if 2 words are anagrams or not");
        System.out.println("Please enter the firs word: ");
        String word1 = userInput.nextLine();
        System.out.println("Please enter the second word: ");
        String word2 = userInput.nextLine();

        if (checkAnagram(word1, word2)) {
            System.out.println("Yay!! They are anagrams!");
        } else {
            System.out.println("Sorry, but they are not anagrams.");
        }
    }

    private static boolean checkAnagram(String s1, String s2) {
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        for (int i = 0; i < s1Array.length - 1; i++) {
            for (int j = i + 1; j < s1Array.length; j++) {
                if (s1Array[i] > s1Array[j]) {
                    char Sort1 = s1Array[j];
                    s1Array[j] = s1Array[i];
                    s1Array[i] = Sort1;
                }
            }
        }
        for (int k = 0; k < s2Array.length - 1; k++) {
            for (int l = k + 1; l < s2Array.length; l++) {
                if (s2Array[k] > s2Array[l]) {
                    char Sort2 = s2Array[l];
                    s2Array[l] = s2Array[k];
                    s2Array[k] = Sort2;
                }
            }
        }
        boolean equal = Arrays.equals(s1Array, s2Array);
        return equal;
    }
}