public class Birds extends Animal implements Flyable {

  private boolean canItFly;
  private int speedOfFly;

  public Birds(String name) {
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

  @Override
  public void takeOff() {
    System.out.println(getName() + " | " + " The birds are taking off from their nests");

  }

  @Override
  public void fly() {
    System.out.println(getName()+ " | " + "Birds are flying with their wings in the sky");
  }

  @Override
  public void land() {
    System.out.println(getName() + " | " + "Birds are landing anywhere using their 2 legs");
  }
}
