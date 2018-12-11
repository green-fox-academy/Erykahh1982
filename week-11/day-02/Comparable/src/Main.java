import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));

    System.out.println("Printing the original domino list");
    System.out.println(dominoes);

    Collections.sort(dominoes, new Comparator<Domino>() {
      @Override
      public int compare(Domino o1, Domino o2) {
        return o1.getLeftSide() - o2.getLeftSide();
      }
    });
    System.out.println();
    System.out.println("Printing the sorted domino list");
    System.out.println(dominoes);
    System.out.println();

    ArrayList<Thing> things = new ArrayList<>();

    Thing getUp = new Thing("Get up");
    getUp.complete();
    things.add(getUp);

    Thing washMyTeeth = new Thing("Wash my teeth");
    washMyTeeth.complete();
    things.add(washMyTeeth);

    Thing eatBreakfast = new Thing("Eat breakfast");
    things.add(eatBreakfast);

    Thing packTheBagpack = new Thing("Pack the backpack");
    things.add(packTheBagpack);

    Thing dressUp = new Thing("Dress up");
    dressUp.complete();
    things.add(dressUp);

    Thing leaveTheHouse = new Thing("Leave the house");
    leaveTheHouse.complete();
    things.add(leaveTheHouse);

    System.out.println("Printing the original Things list");
    System.out.println(things);
    System.out.println();
    Collections.sort(things);
    System.out.println("Printing the sorted Things list");
    System.out.println(things);
  }

}
