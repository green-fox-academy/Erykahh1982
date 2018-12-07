import java.util.ArrayList;

public class Carrier {
  private ArrayList<Aircraft> aircrafts = new ArrayList<>();
  private int ammoStore;
  private int healthPoints;

  public Carrier(int ammoStore, int healthPoints) {
    this.ammoStore = ammoStore;
    this.healthPoints = healthPoints;
  }

  public void add(Aircraft aircraft) {
    aircrafts.add(aircraft);
  }

  public int ammoDemand() {
    int demand = 0;
    for(Aircraft aircraft : aircrafts){
      demand = aircraft.getMaxAmmo() - aircraft.getAmmo();
    }
    return demand;
  }

  public int totalDamage(){
    int totalDamage = 0;
    for (Aircraft aircraft : aircrafts){
      totalDamage = totalDamage + (aircraft.getBaseDamage()* aircraft.getAmmo());
    }
    return totalDamage;
  }

  public void fill() {

  }

  public void fight(Carrier carrier) {
    carrier.healthPoints -= this.totalDamage();
  }

  public String getStatus() {
    String status =

    return status;
  }

}
