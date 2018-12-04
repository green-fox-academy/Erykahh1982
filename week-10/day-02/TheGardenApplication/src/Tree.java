public class Tree extends Garden {
  private int numberOfTrees;

  public Tree(String color){
    super();
    this.numberOfTrees = 2;
  }

  @Override
  public String toString() {
    return "Tree{" +
        "color='" + getColor() + '\'' +
        ", numberOfTrees=" + numberOfTrees +
        '}';
  }
}
