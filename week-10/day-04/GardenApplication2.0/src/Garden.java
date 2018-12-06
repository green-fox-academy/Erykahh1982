import javafx.print.PageLayout;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Plant> plants;

  public Garden() {
    this.plants = new ArrayList<>();
  }

  public void addPlant(Plant newPlant) {
    plants.add(newPlant);
  }

  public void water(int amount) {
    float waterEach = amount / getThirstyAMount();
    for (Plant plant : plants) {
      if (plant.isThirsty()) {
        plant.water(waterEach);
      }
    }
  }

  private int getThirstyAMount() {
    int thirstyPlants = 0;
    for (Plant plant : plants) {
      if (plant.isThirsty()) {
        thirstyPlants++;
      }
    }
    return thirstyPlants;
  }

  public String printState() {
    String status = "";
    for (Plant plant : plants) {
      status += plant.toString() + "\n";
    }
    return status;
  }
}
