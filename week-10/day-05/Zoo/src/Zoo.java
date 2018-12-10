import main.java.animals.Birds;
import main.java.animals.Mammal;
import main.java.animals.Reptile;

public class Zoo {
  public static void main(String[] args) {

    Birds bird01 = new Birds("Pigeon", 30);
    Reptile reptile01 = new Reptile("Crocodile", "rough");
    Mammal mammal01 = new Mammal("Koala");

    System.out.println("How do you breed?");
    System.out.println("A " + bird01.getName() + " is breeding by " + bird01.breed());
    System.out.println("A " + reptile01.getName() + " is breeding by " + reptile01.breed());
    System.out.println(("A " + mammal01.getName() + " is breeding by " + mammal01.breed()));
    System.out.println();
    System.out.println("What do they eat?");
    System.out.println("A " + bird01.getName() + " eats " + bird01.eat());
    System.out.println("A " + reptile01.getName() + " eats " + reptile01.eat());
    System.out.println(("A " + mammal01.getName() + " eats " + mammal01.eat()));
    System.out.println();
    System.out.println("The name of the animal is :" + bird01.getName());
    System.out.println("The speed of fly of this bird is : " + bird01.getSpeedOfFly() + " km/h.");
    System.out.println();
    System.out.println("The name of this animal is :"
        + reptile01.getName()
        + " , the type of skin it has is : "
        + reptile01.getTypeOfSkin() + ".");
  }

}
