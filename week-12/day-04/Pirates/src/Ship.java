import java.util.ArrayList;

public class Ship {

  private String shipName;
  private ArrayList<Pirate> crew;
  private int crewSize;
  private int nrOfAwakes;
  private int nrOfAlives;

  public Ship() {
    this.crew = new ArrayList<>();
  }

  public void fillShip() {
    crewSize = (int) (Math.random() * 20);
    for (int i = 0; i < crewSize; i++) {
      crew.add(new Pirate());
    }
    this.crew.add(new Captain());
    this.nrOfAlives = crew.size();
    this.nrOfAwakes = crew.size();
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

  public void setShipName(String shipName) {
    this.shipName = shipName;
  }

  public int getNrOfAwakes() {
    return nrOfAwakes;
  }

  public int getNrOfAlives() {
    return nrOfAlives;
  }
}