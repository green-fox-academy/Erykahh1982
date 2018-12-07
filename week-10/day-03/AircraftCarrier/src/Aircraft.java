public class Aircraft {
  private String type;
  private int maxAmmo;
  private int ammo;
  private int baseDamage;
  private int totalDamage;
  private boolean priority;

  public Aircraft(String type) {
    ammo = 0;
    this.type = type;
    totalDamage = 0;
  }

  public int fight() {
    int damageThroughFight = baseDamage * ammo;
    totalDamage = totalDamage + damageThroughFight;
    return damageThroughFight;
  }

  public int refill(int amountToRefillWith) {
    int ammoNeeded = this.maxAmmo - this.ammo;
    if (amountToRefillWith <= ammoNeeded) {
      this.ammo += amountToRefillWith;
      return 0;
    } else {
      this.ammo = this.maxAmmo;
    }
    return amountToRefillWith - ammoNeeded;
  }

  public String getType() {
    if (this instanceof F16) {
      return "F16";
    } else {
      return "F35";
    }
  }

  public String getStatus() {
    return ("Type " + getType() + " , Ammo " + this.ammo + " ,Base Damage " + this.baseDamage + " All Damage " + totalDamage);
  }

  public boolean isPriority() {
    if (this.getType().equals("F35")) {
      return true;
    } else {
      return false;
    }
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setPriority(boolean priority) {
    this.priority = priority;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public int getAmmo() {
    return ammo;
  }
}