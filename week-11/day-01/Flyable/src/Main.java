import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<Flyable> listOfFlyables = new ArrayList<>();
    listOfFlyables.add(new Helicopter("helicopter01"));
    listOfFlyables.add(new Helicopter("helicopter02"));
    listOfFlyables.add(new Helicopter("helicopter03"));
    listOfFlyables.add(new Birds("Pigeon"));
    listOfFlyables.add(new Birds("Kiwi"));
    listOfFlyables.add(new Birds("Eagle"));

    for (Flyable flyable : listOfFlyables) {
      flyable.takeOff();
    }
    System.out.println();
    for (Flyable flyable : listOfFlyables) {
      flyable.fly();
    }
    System.out.println();
    for (Flyable flyable : listOfFlyables) {
      flyable.land();
    }
  }
}
