import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<Tree> trees = new ArrayList<>();
    ArrayList<Flower> flowers = new ArrayList<>();


    Tree tree1 = new Tree("purple");
    Tree tree2 = new Tree("orange");

    Flower flower1 = new Flower("yellow");
    Flower flower2 = new Flower("blue");

    trees.add(1,tree1);
    trees.add(2,tree2);
    flowers.add(1, flower1);
    flowers.add(2, flower2);




  }
}
