
public abstract class Animal {

  private String name;
  private int age;
  private String gender;
  private int fedTimes;


  public Animal(String name) {
    this.name = name;
    this.age = 0;
    this.gender = "unknown";
    this.fedTimes = 0;
  }

  public Animal(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.fedTimes = 0;
  }

  public void eat() {
    fedTimes++;
  }

  public abstract boolean isHungry();

  @Override
  public String toString() {
    return name + " is a "
        + age +
        " years old "
        + gender
        + " animal, and was fed "
        + fedTimes +
        " times.";
  }

  public int getFedTimes() {
    return fedTimes;
  }

}