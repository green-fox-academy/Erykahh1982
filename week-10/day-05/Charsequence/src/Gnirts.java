public class Gnirts implements CharSequence {
  private String word;

  public Gnirts(String word) {
    this.word = word;
  }

  @Override
  public int length() {
    char[] charArray = word.toCharArray();
    return charArray.length;
  }

  @Override
  public char charAt(int index) {
    char[] charArray = word.toCharArray();
    return charArray[charArray.length - 1 - index];
  }

  @Override
  public String subSequence(int start, int end) {
    char[] charArray = word.toCharArray();
    String solution = "";
    for (int i = charArray.length - 1 - start; i >= charArray.length - end; i--) {
      solution += charArray[i];
    }
    return solution;
  }
}
