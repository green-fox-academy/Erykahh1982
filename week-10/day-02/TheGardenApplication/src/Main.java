public class Main {
  public static void main(String[] args) {
    Flower daisy = new Flower("yellow");
    Flower iris = new Flower("blue");
    Tree orangeTree = new Tree("orange");
    Tree plumTree = new Tree("purple");

    Garden greenFoxGarden = new Garden("GreenFoxGarden");
    greenFoxGarden.addPlantsToGarden(iris);
    greenFoxGarden.addPlantsToGarden(daisy);
    greenFoxGarden.addPlantsToGarden(orangeTree);
    greenFoxGarden.addPlantsToGarden(plumTree);

    System.out.println("Garden status");
    System.out.println(greenFoxGarden);
    System.out.println("*---------------------------------------*");
    System.out.println();

    System.out.println("Watering with 40 liters of water");
    greenFoxGarden.wateringTheGarden(40);
    System.out.println(greenFoxGarden);
    System.out.println("*---------------------------------------*");
    System.out.println();

    System.out.println("Watering with 70 liters of water");
    greenFoxGarden.wateringTheGarden(70);
    System.out.println(greenFoxGarden);
    System.out.println("*---------------------------------------*");
  }
}