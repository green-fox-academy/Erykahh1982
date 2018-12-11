import java.util.ArrayList;
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

    for (Domino d : dominoes) {
      d.printAllFields();
    }
    System.out.println();

    List<Things> things = new ArrayList<>();
    things.add(new Things("Get up"));
    things.add(new Things("Dress up"));
    things.add(new Things("Wash teeth"));
    things.add(new Things("Pack the bag"));
    things.add(new Things("Eat breakfast"));
    things.add(new Things("Leave the house"));

    things.get(0).complete();
    things.get(4).complete();

    for (Things t : things) {
      t.printAllFields();
    }
  }

}
