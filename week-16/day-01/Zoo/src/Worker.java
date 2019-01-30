import java.util.ArrayList;

public class Worker {

  private String name;
  ArrayList<Animal> animalsToLookAfter;

  public Worker(String name) {
    this.name = name;
    this.animalsToLookAfter = new ArrayList<>();
  }

  public Worker(String name, ArrayList<Animal> animalsToLookAfter) {
    this.name = name;
    this.animalsToLookAfter = animalsToLookAfter;
  }

  public void addAnimal(Animal animal) {
    animalsToLookAfter.add(animal);
  }

  public void doDailyRoutine() {

    for (int i = 0; i < animalsToLookAfter.size(); i++) {
      if (animalsToLookAfter.get(i).isHungry()) {
        animalsToLookAfter.get(i).eat();
      }
    }
  }

  public String status() {
    if (animalsToLookAfter.size() == 0) {
      return "The zoo is empty";
    }
    String statusToPrint = "This is my zoo. " +
        "\n"
        + "I have "
        + animalsToLookAfter.size()
        + " animals in it. The details are the following: "
        + "\n";

    for (Animal animal : animalsToLookAfter) {
      statusToPrint += animal.toString() + "\n";
    }
    return statusToPrint;
  }

}
