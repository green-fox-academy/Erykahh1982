import java.util.ArrayList;

public class Ship {

  private String shipName;

  private ArrayList<Pirate> crew = new ArrayList();

  public Ship() {

  }

  public void fillShip(Pirate pirate) {
    int numberOfPirates = (int) (Math.random() * 10);
    for (int i = numberOfPirates; i < crew.size(); i++) {
      crew.add(new Pirate());
    }
    crew.add(new Captain());
  }

  public String getStatus() {
    String statusToPrint = "This ship consists of :"
        + crew.size()
        + " priates."
        + " The name of this ship is: "
        + shipName
        + " \nPirates: \n";

    for (Pirate pirate : crew) {
      statusToPrint += pirate.getStatus() + "\n";
    }
    return statusToPrint;
  }

}