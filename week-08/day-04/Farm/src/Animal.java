public class Animal {
  private int hunger;
  private int thirst;

  Animal() {
  }

  public Animal(int hunger, int thirst) {
    this.hunger = 50;
    this.thirst = 50;
  }

  public void eat() {
    hunger--;
  }

  public void drink() {
    thirst--;
  }

  public void play() {
    thirst--;
    hunger--;
  }

  public int getHunger() {
    return hunger;
  }

  public int getThirst() {
    return thirst;
  }

  @Override
  public String toString() {
    return "Animal{" +
        "hunger=" + hunger +
        ", thirst=" + thirst +
        '}';
  }

  public void setHunger(int hunger) {
    this.hunger = hunger;
  }
}



