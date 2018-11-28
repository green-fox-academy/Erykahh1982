public class String2 {
  public static void main(String[] args) {
    String s = "xoxoxkmzx";
    System.out.println(removeXx(s, s.length()));
  }

  private static String removeXx(String s, int length) {
    if (length == 0) {
      return "";
    } else {
      if (s.charAt(length - 1) == 'x') {
        return removeXx(s, length - 1);
      } else {
        return removeXx(s, length - 1) + s.charAt(length - 1);
      }
    }
  }
}
