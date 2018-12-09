public class Shifter implements CharSequence {
  private String s;
  private int numberOfShifts;

  public Shifter(String s, int numberOfShifts) {
    this.s = s;
    this.numberOfShifts = numberOfShifts;
  }

  @Override
  public int length() {
    char[] charArray = s.toCharArray();
    return charArray.length;
  }

  @Override
  public char charAt(int index) {
    char[] charArray = s.toCharArray();
    return charArray[charArray.length - 1 - (index + numberOfShifts)];
  }

  @Override
  public String subSequence(int start, int end) {
    char[] charArray = s.toCharArray();
    String solution = "";
    for (int i = charArray.length - 1 - start; i >= charArray.length - end; i--) {
      solution += charArray[i + numberOfShifts];
    }
    return solution;
  }
}
