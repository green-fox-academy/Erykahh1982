public class Tree extends Plant {

  public static final int waterNeed = 10;
  public static final float waterAbsorbRatio = 0.4f;

  public Tree(String color) {
    super(color, waterNeed, waterAbsorbRatio);
  }
}
