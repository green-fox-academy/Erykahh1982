public class Lollipop extends Sweet {

  public static final String type = "LOLLIPOP";
  public static final int sugarAmount = 5;

  public Lollipop() {
    super(type, sugarAmount);
  }

  @Override
  public int calculateSellingPrice() {
    return this.getSugarAmount() * this.getUnitPriceSugar();
  }


}
