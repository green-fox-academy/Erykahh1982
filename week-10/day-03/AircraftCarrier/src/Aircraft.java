public class Aircraft {

  private String type;
  private int maxAmmo;
  private int ammoActual;
  private int baseDamage;
  private boolean priority;
  private int allDamage = ammoActual * baseDamage;

  public Aircraft(String type, int maxAmmo, int baseDamage, boolean priority) {
    this.type = type;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.priority = priority;
    this.ammoActual = 0;
    this.allDamage = 0;
  }

  public int fight() {
    int damageThroughFight = this.baseDamage * this.ammoActual;
    allDamage += damageThroughFight;
    ammoActual = 0;
    return damageThroughFight;
  }

  public int refill(int ammoToRefillWith) {
    int ammoNeeded = this.maxAmmo - this.ammoActual;
    if (ammoNeeded < ammoToRefillWith) {
      ammoActual = maxAmmo;
      return ammoToRefillWith - ammoNeeded;
    } else {
      ammoActual += ammoToRefillWith;
      return 0;
    }
  }

  public boolean isFull() {
    return ammoActual == maxAmmo;
  }

  public String getStatus() {
    int allDamage = this.ammoActual * this.baseDamage;
    return ("Type: " + this.type + " , Ammo: " + this.ammoActual + " ,Base Damage: " + this.baseDamage + " All Damage: " + allDamage);
  }

  public String getType() {
    return type;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public int getAmmo() {
    return ammoActual;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public void setAmmo(int ammoActual) {
    this.ammoActual = ammoActual;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public void setPriority(boolean priority) {
    this.priority = priority;
  }

  public boolean isPriority() {
    return priority;
  }

}
