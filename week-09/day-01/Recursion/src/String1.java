public class String1 {
  public static void main(String[] args) {
    String s = "xoXoxo";
    System.out.println(characterSwap(s, s.length()));
  }

  public static String characterSwap(String s, int stringLength) {
    if (stringLength == 0) {
      return "";
    } else {
      if (s.charAt(stringLength - 1) == 'x') {
        return characterSwap(s, stringLength - 1) + 'y';
      } else {
        return characterSwap(s, stringLength - 1) + s.charAt(stringLength - 1);
      }
    }
  }
}
