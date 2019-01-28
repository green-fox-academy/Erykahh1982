public class Candy extends Sweet {

  public static final String type = "CANDY";
  public static final int sugarAmount = 10;

  public Candy() {
    super(type, sugarAmount);
  }

  @Override
  public int calculateSellingPrice() {
    return this.getSugarAmount() * getUnitPriceSugar();
  }


}
