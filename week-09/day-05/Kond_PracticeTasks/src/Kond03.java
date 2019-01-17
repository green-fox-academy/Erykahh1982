import java.util.ArrayList;

public class Kond03 {
  public static void main(String[] args) {
    //Írj egy functiont, ami ha kap két szöveget, visszadja a betűnként összefésült új szöveget.
    // Pl: alma, traktor » atlrmaaktor
    String second = "alma";
    String first = "traktor";
    System.out.println(concatenate(first, second).toString());
  }

  private static ArrayList<Character> concatenate(String s1, String s2) {
    ArrayList<Character> charList = new ArrayList<>();
    char[] characters1 = s1.toCharArray();
    char[] characters2 = s2.toCharArray();

    if (s1.length() > s2.length()) {
      for (int i = 0; i < s2.length(); i++) {
        charList.add(characters2[i]);
        charList.add(characters1[i]);
      }
      for (int i = s2.length(); i < s1.length(); i++) {
        charList.add(characters1[i]);
      }
    }
    return charList;
  }
}
