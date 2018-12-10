
public abstract class Vehicle {

  private int weight;
  private String name;
  private int enginePerformance;
  private  int fuelLevel;
  private int speed;

  public Vehicle(String name){
    this.name = name;
    this.enginePerformance = enginePerformance;
    this.fuelLevel = 0;
    this.speed = 0;
  }

  public void takeOff(String land, String fly){
    System.out.println("This vehicle can take off from anywhere");
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public String getName() {
    return name;
  }
}
