package main.java.animals;

public class ProliferateWithEggs extends Animal {

  private int countOfEggsLayed;
  private int countOfNests;


  public ProliferateWithEggs(String name) {
    super(name);
  }

  public String breed() {
    return "they are laying eggs";
  }

  @Override
  public String eat() {
    return "They are eating almost everything green";
  }

}
