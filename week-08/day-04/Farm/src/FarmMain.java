import java.util.ArrayList;

public class FarmMain {
  public static void main(String[] args) {
    Farm newFarm = new Farm(5);
    for (int i = 0; i < 4; i++) {
      newFarm.add(new Animal(50, 50));
    }

    newFarm.display();
    System.out.println();

    newFarm.getAnimalList().get(1).play();
    newFarm.getAnimalList().get(2).eat();
    newFarm.getAnimalList().get(1).drink();
    System.out.println();

    newFarm.display();
    System.out.println();

    newFarm.breed();
    newFarm.breed();
    newFarm.breed();
    newFarm.display();
    System.out.println();

    newFarm.slaughter();
    newFarm.display();
  }
}

