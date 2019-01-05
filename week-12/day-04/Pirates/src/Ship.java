import java.util.ArrayList;

public class Ship {

  private static final Object Captain = "Captain Hook";
  private String shipName;
  private ArrayList<Pirate> crew;
  private int crewSize;
  private int nrOfAwakes;
  private int nrOfAlives;

  public Ship() {
    this.crew = new ArrayList<>();
  }

  public void fillShip() {
    this.crew.add(new Captain());
    crewSize = (int) (Math.random() * 20);
    for (int i = 0; i < crewSize; i++) {
      crew.add(new Pirate());
    }
    this.nrOfAlives = crew.size();
    this.nrOfAwakes = crew.size();
  }

  public int calculateAwakePirates() {
    int nrOfAwakenPirates = 0;
    for (int i = 0; i < crew.size(); i++) {
      if (!crew.get(i).isPassedOut() && !crew.get(i).isDead()) {
        nrOfAwakenPirates++;
      }
    }
    return nrOfAwakenPirates;
  }

  public int calculateAlivePirtates() {
    int nrOfAlivePirates = 0;
    for (int i = 0; i < crew.size(); i++) {
      if (crew.get(i).isDead()) {
        nrOfAlivePirates++;
      }
    }
    return nrOfAlivePirates;
  }

  public int calculatedScoreOfShip(Ship ship) {
    return ship.nrOfAlives - ship.crew.get(0).getRumLevel();
  }

  public void scenarioLoosersCountWithLosses() {
    int nrOfLostPirates = (int) (Math.random() * nrOfAlives);
    for (int i = 0; i < nrOfLostPirates; i++) {
      int indexOfLostPirate = (int) (Math.random() * crew.size());
      while (!crew.get(indexOfLostPirate).isDead()) {
        indexOfLostPirate = (int) (Math.random() * crew.size());
      }
      crew.get(indexOfLostPirate).setDead(true);
    }
  }

  public void scenarioWinnerGetsAParty() {
    for (int i = 0; i < crew.size(); i++) {
      int freeRum = (int) (Math.random() * 15);
      int actualRumLevel = crew.get(i).getRumLevel();
      crew.get(i).setRumLevel(actualRumLevel + freeRum);
    }
  }

  public boolean battle(Ship enemyShip) {
    if (calculatedScoreOfShip(this) > calculatedScoreOfShip(enemyShip)) {
      this.scenarioWinnerGetsAParty();
      enemyShip.scenarioLoosersCountWithLosses();
      enemyShip.calculateAlivePirtates();
    } else {
      this.scenarioLoosersCountWithLosses();
      enemyShip.scenarioWinnerGetsAParty();
    }
    this.calculateAlivePirtates();
    this.calculateAwakePirates();
    enemyShip.calculateAwakePirates();
    enemyShip.calculateAlivePirtates();
    return calculatedScoreOfShip(this) > calculatedScoreOfShip(enemyShip);
  }

  public String getStatus() {
    String statusToPrint = "This ship consists of :"
        + crew.size()
        + " priates |"
        + " The name of this ship is: "
        + shipName
        + " | The name of the captain is: "
        + Captain
        + " \nThe rum level of the Captain is: " + crew.get(0).getRumLevel()
        + " \nIs the Captain passed out? " + crew.get(0).isPassedOut()
        + " \nIs the Captain dead? " + crew.get(0).isDead()
        + " \nThe number of alive pirates are: " + getNrOfAlives()
        + " \nThe pirates of the ship in detail: \n";

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