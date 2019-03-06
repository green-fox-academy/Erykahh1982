import java.util.Arrays;

public class Anagram {

  //Create a function that takes two strings,
// and returns a boolean that should be True if the strings are anagrams
// and False otherwise.

  public boolean checkIfAnagram(String input1, String input2) {

    if (input1 == null || input2 == null || checkIfSizeEquals(input1, input2) == false) {
      return false;
    } else {

      char[] fromInput1 = input1.toCharArray();
      char[] fromInput2 = input2.toCharArray();

      for (int i = 0; i < fromInput1.length; i++) {
        if (fromInput1[i] == fromInput2[i]) {
          return true;
        }
      }
    }
    return false;
  }

  public boolean checkIfSizeEquals(String input1, String input2) {
    if (input1.length() == input2.length()) {
      return true;
    }
    return false;
  }

}

