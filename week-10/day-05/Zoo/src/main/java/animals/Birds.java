package main.java.animals;

public class Birds extends ProliferateWithEggs {

  private boolean canItFly;
  private int speedOfFly;

  public Birds(String name, int speedOfFly) {
    super(name);
    this.speedOfFly = speedOfFly;
  }

  @Override
  public String breed() {
    return "usually laying eggs.";
  }

  @Override
  public String eat() {
    return "seeds.";
  }

  public int getSpeedOfFly() {
    return speedOfFly;
  }

}
