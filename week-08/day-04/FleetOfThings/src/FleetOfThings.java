import java.util.ArrayList;

public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();

    Thing one = new Thing("Get milk");
    Thing two = new Thing("Remove the obstacles");
    Thing three = new Thing("Stand up");
    Thing four = new Thing("Eat lunch");

    three.complete();
    four.complete();

    fleet.add(one);
    fleet.add(two);
    fleet.add(three);
    fleet.add(four);

    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    System.out.println(fleet);
  }
}

