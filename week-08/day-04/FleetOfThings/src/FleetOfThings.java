import java.util.ArrayList;
import java.util.List;

public class FleetOfThings {
  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    List<Thing> things = new ArrayList<>();
    //creating the ArrayList of "things"

    things.add(new Thing("Get milk"));
    things.add(new Thing("Remove obstacles"));
    things.add(new Thing("Stand up"));
    things.add(new Thing("Eat lunch"));
    //adding each element to the "things" ArrayList

    things.get(2).complete();
    things.get(3).complete();
    //call the 3rd and 4th thing to be completed

    for (int i = 0; i < things.size(); i++) {
      fleet.add(things.get(i));
      //iterating through the ArrayList of "things" and add all the lines to fleet, which is an object created by Fleet class
    }
    System.out.println(fleet);
    //printing out the result of our fleet
  }
}

