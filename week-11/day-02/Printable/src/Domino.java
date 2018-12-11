import java.util.Arrays;

public class Domino implements Printable {

  private final int left;
  private final int right;
  private Iterable<? extends Domino> dominoes;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }

  @Override
  public void printAllFields() {
    System.out.println(String.format("{%d | %d}", left, right));
  }

}



