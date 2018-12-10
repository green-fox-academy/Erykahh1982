package main.java.animals;

public class Mammal extends Animal {

  private String nutrition;
  private String heatRegulation;

  public Mammal(String name) {
    super(name);

  }

  @Override
  public String breed() {
    return "pushing miniature versions out of themselves.";
  }

  @Override
  public String eat() {
    return "everything, as it is omnivorous.";
  }

}
