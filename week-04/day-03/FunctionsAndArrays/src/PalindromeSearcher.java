import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeSearcher {

    public static void main(String[] args) {

        String word = "racecar";
        boolean palindrome = checkPalindrome(word);
        System.out.println("If the entered word is palindrome or not : " + palindrome);
        System.out.println(findPalindromes(word));
    }
    public static boolean checkPalindrome (String string){

            char[] wordArray = string.toCharArray();
            //System.out.println(Arrays.toString(wordArray));
        for (int i = 0; i < wordArray.length / 2 ; i++) {
            if(wordArray[i] == wordArray[wordArray.length - 1 - i]){
            } else {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<String> findPalindromes (String originalWord){
        ArrayList<String> output = new ArrayList();

        for (int i = 0; i <= originalWord.length() - 1; i++) {
            for (int j = i + 2; j <= originalWord.length() - 1; j++) {
                String partString = originalWord.substring(i, j + 1);
                if (checkPalindrome(partString) == true ){
                    output.add(partString);
                }
            }
        }
        return output;
    }
}
