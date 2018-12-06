public class Flower extends Plant {

  public static final int waterNeed = 5;
  public static final float waterAbsorbRatio = 0.75f;

  public Flower(String color) {
    super(color, waterNeed, waterAbsorbRatio);

  }
}
