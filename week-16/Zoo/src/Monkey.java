public class Monkey extends Animal {

  public Monkey(String name) {
    super(name);
  }

  public Monkey(String name, int age, String gender) {
    super(name, age, gender);
  }

  @Override
  public boolean isHungry() {
    int randomNumber = (int) (Math.random()) * 2;
    return randomNumber == 1;
  }

}