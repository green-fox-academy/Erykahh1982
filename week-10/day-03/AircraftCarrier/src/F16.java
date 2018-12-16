public class F16 extends Aircraft {

  public static final String type = "F16";
  public static final int maxAmmo = 8;
  public static final int baseDamage = 30;
  public static final boolean priority = false;

  public F16() {
    super(type, maxAmmo, baseDamage, priority);
  }

}
