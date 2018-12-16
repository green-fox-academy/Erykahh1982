public class F35 extends Aircraft {

  public static final String type = "F35";
  public static final int maxAmmo = 12;
  public static final int baseDamage = 50;
  public static final boolean priority = true;

  public F35() {
    super(type, maxAmmo, baseDamage, priority);
  }

}

