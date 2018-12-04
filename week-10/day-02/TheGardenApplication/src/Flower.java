public class Flower extends Garden{
  private int numberOfTrees;

  public Flower(String color){
    super();
    this.numberOfTrees = 2;
  }

  @Override
  public String toString() {
    return "Flower{" +
        "color='" + getColor() + '\'' +
        ", numberOfTrees=" + numberOfTrees +
        '}';
  }
}
