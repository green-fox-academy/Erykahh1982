package main.java.animals;

public class Reptile extends ProliferateWithEggs {

  private String typeOfSkin;

  public Reptile(String name, String typeOfSkin) {
    super(name);
    this.typeOfSkin = typeOfSkin;
  }

  @Override
  public String breed() {
    return "mostly laying .";
  }

  @Override
  public String eat() {
    return "vegetables.";
  }

  public String getTypeOfSkin() {
    return typeOfSkin;
  }

}
