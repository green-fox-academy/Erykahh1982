import java.util.ArrayList;

public class Carrier {
  private ArrayList<Aircraft> carrier = new ArrayList<>();
  private String name;
  private int ammoStore;
  private int healthPoint;
  private int totalDamage;

  public Carrier(String name, int ammoStore, int healthPoint) {
    this.name = name;
    this.ammoStore = ammoStore;
    this.healthPoint = healthPoint;
    this.carrier = new ArrayList<>();
    this.totalDamage = 0;
  }

  public void add(Aircraft aircraft) {
    carrier.add(aircraft);
  }

  public boolean isThereEnoughAmmo() {
    return ammoStore > 0;
  }

  public void healthPointToDecrease(int amount) {
    if (healthPoint > amount) {
      healthPoint -= amount;
    } else {
      healthPoint = 0;
    }
  }

  public int ammoDemand() {
    int demand = 0;
    for (Aircraft aircraft : carrier) {
      demand = aircraft.getMaxAmmo() - aircraft.getAmmo();
    }
    return demand;
  }

  public boolean isStoreageEmpty() {
    return ammoStore == 0;
  }

  public ArrayList<Aircraft> listingAircraftsToFill(boolean isPriority) {
    ArrayList<Aircraft> aircraftsToFill = new ArrayList<>();
    for (int i = 0; i < carrier.size(); i++) {
      if ((carrier.get(i).isPriority() == isPriority) && !carrier.get(i).isFull()) {
        aircraftsToFill.add(carrier.get(i));
      }
    }
    return aircraftsToFill;
  }

  public void fillTheListedAircrafts(ArrayList<Aircraft> aircraftsToFill) {
    for (int i = 0; i < aircraftsToFill.size(); i++) {
      if (isStoreageEmpty()) {
        System.out.println("The ammo storage is empty");
        break;
      } else {
        ammoStore = aircraftsToFill.get(i).refill(ammoStore);
      }
    }
  }

  public void fill() {
    if (this.healthPoint == 0) {
      System.out.println("The " + this.name + " cannot be filled, as it had been destroyed in a previous fight");
    } else {
      fillTheListedAircrafts(listingAircraftsToFill(true));
      fillTheListedAircrafts(listingAircraftsToFill(false));
    }
  }

  public void decreaseHealthPoints(int amount) {
    if (healthPoint > amount) {
      healthPoint -= amount;
    } else {
      healthPoint = 0;
    }
  }

  public void fight(Carrier enemy) {
    int allDamageAcrossFight = 0;
    if (this.healthPoint == 0) {
      System.out.println("The " + this.name + " is already dead, therefore cannot fight anymore");
    } else if (enemy.healthPoint == 0) {
      System.out.println("The " + enemy.name + " is already dead, therefore cannot fight anymore");
    } else {
      for (Aircraft aircraft : carrier) {
        allDamageAcrossFight += aircraft.fight(allDamageAcrossFight);
        aircraft.setAmmo(0);
        enemy.decreaseHealthPoints(allDamageAcrossFight);
      }
    }
  }

  public int totalDamage() {
    int totalDamage = 0;
    for (Aircraft aircraft : carrier) {
      totalDamage += aircraft.getAmmo() * aircraft.getBaseDamage();
    }
    return totalDamage;
  }

  public String getStatus() {
    if (this.healthPoint == 0) {
      return "The " + this.name + " is dead Jim :(";
    }
    String statusToPrint = "HP: " + healthPoint +
        " Aircraft count: " + carrier.size() +
        " Ammo Storage: " + ammoStore +
        " Total damage: " + totalDamage +
        " \nAircrafts: \n";

    for (Aircraft aircraft : carrier) {
      statusToPrint += aircraft.getStatus() + "\n";
    }
    return statusToPrint;
  }

}
