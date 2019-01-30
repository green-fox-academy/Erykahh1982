public class Elephant extends Animal {

  public Elephant(String name) {
    super(name);
  }

  public Elephant(String name, int age, String gender) {
    super(name, age, gender);
  }

  @Override
  public boolean isHungry() {
    return this.getFedTimes() % 2 == 0;
  }

}
