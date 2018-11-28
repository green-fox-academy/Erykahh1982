public class String3 {
  public static void main(String[] args) {
    String s = "erika";
    int length = s.length();
    int totalLength = s.length();
    System.out.println(addAsterisks(s, length, totalLength));
  }

  private static String addAsterisks(String s, int length, int totalLength) {
    if (length == 0) {
      return "";
    } else if (length == totalLength) {
      return addAsterisks(s, length - 1, totalLength) + s.charAt(length - 1);
    } else {
      return addAsterisks(s, length - 1, totalLength) + s.charAt(length - 1) + '*';
    }
  }
}

