public class Kond03String {
  public static void main(String[] args) {
    String first = "alma";
    String second = "traktor";
    System.out.println(concatStrings(first, second));
  }

  private static String concatStrings(String first, String second) {
    String result = "";
    int shorterWord = Math.min(first.length(), second.length());
    for (int i = 0; i < shorterWord; i++) {
      result += first.charAt(i) + "" + second.charAt(i);
    }
    if (first.length() > second.length()) {
      result += first.substring(second.length());
    } else {
      result += second.substring(first.length());
    }
    return result;
  }

}