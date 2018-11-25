import java.util.ArrayList;

public class Farm {
  private ArrayList<Animal> animalList;
  private int numberOfSlots;

  public ArrayList<Animal> getAnimalList() {
    return animalList;
  }

  public void setAnimalList(ArrayList<Animal> animalList) {
    this.animalList = animalList;
  }

  public int getNumberOfSlots() {
    return numberOfSlots;
  }

  public void setNumberOfSlots(int numberOfSlots) {
    this.numberOfSlots = numberOfSlots;
  }

  public Farm(int numberOfSlots) {
    this.animalList = new ArrayList<>();
    this.numberOfSlots = numberOfSlots;
  }

  public void add(Animal animal) {
    this.animalList.add(animal);
  }

  public void breed() {
    if (numberOfSlots > animalList.size()) {
      animalList.add(new Animal(50, 50));
    } else {
      System.out.println("There's no place for a new animal");
    }
  }

  public void slaughter() {
    int minValueOfHunger = 50;
    for (int i = 0; i < animalList.size(); i++) {
      if (animalList.get(i).getHunger() < minValueOfHunger) {
        minValueOfHunger = animalList.get(i).getHunger();
      }
    }
    int i = 0;
    while (animalList.get(i).getHunger() != minValueOfHunger) {
      i++;
    }
    animalList.remove(animalList.get(i));
  }

  public void display() {
    for (int i = 0; i < animalList.size(); i++) {
      System.out.println(animalList.toString());
    }
  }
}
