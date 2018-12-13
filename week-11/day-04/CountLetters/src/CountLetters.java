import java.util.HashMap;
import java.util.Map;

public class CountLetters {

  public static Map<Character, Integer> countLetters(String s) {
    if (s == null) return new HashMap<>();
    Map<Character, Integer> letterCounts = new HashMap<>();
    char[] letters = s.toCharArray();

    for (char letter : letters) {
      if (letterCounts.containsKey(letter)) {
        letterCounts.put(letter, letterCounts.get(letter) + 1);
      } else {
        letterCounts.put(letter, 1);
      }
    }

    return letterCounts;
  }

}
