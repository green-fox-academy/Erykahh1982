public class Helicopter extends Vehicle implements Flyable {

  private int numberOfPropeller;

  public Helicopter(String name) {
    super(name);
    this.numberOfPropeller = numberOfPropeller;
  }

  @Override
  public void takeOff() {
    System.out.println(getName() + " | " + "A helicopter takes off with a very loud sound");
  }

  @Override
  public void fly() {
    System.out.println(getName() + " | " + "Helicopters after a smooth take-off are flying with a normal speed");
  }

  @Override
  public void land() {
    System.out.println(getName() + " | " + "Helicopters are landing to one point from the air smoothly");
  }
}
