import java.util.ArrayList;

public class Garden {
  private String name;
  private ArrayList<Plants> treesAndFlowers;

  public Garden(String name) {
    this.treesAndFlowers = new ArrayList<>();
    this.name = name;
  }

  public void addPlantsToGarden(Plants plants) {
    treesAndFlowers.add(plants);
  }

  public int countThirstyPlants(){
    int counter = 0;
    for(Plants plant : treesAndFlowers){
      plant.checkWaterDemand();
      if(plant.doesItNeedWater()){
        counter++;
      }
    }
    return counter;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void wateringWith40() {

  }

  public void wateringWith70() {

  }

  public void displayGarden(){
    for (int i = 0; i <treesAndFlowers.size() ; i++) {
      System.out.println();

    }
  }

  @Override
  public String toString() {
    String allPlants = "";
    for (Plants plant : treesAndFlowers){
      allPlants = allPlants + plant.toString() + "\n";
    }
    return allPlants;
  }
}

