public abstract class Sweet {

  private String type;
  private int sugarAmount;
  private int unitSellingPriceSweet;
  private int unitPriceSugar;

  public Sweet(String type, int sugarAmount) {
    this.unitSellingPriceSweet = calculateSellingPrice();
    this.unitPriceSugar = 2;
    this.sugarAmount = sugarAmount;
    this.type = type;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public abstract int calculateSellingPrice();

  public int getUnitSellingPriceSweet() {
    return unitSellingPriceSweet;
  }

  public void setUnitSellingPriceSweet(int unitSellingPriceSweet) {
    this.unitSellingPriceSweet = unitSellingPriceSweet;
  }

  public int getSugarAmount() {
    return sugarAmount;
  }

  public void setSugarAmount(int sugarAmount) {
    this.sugarAmount = sugarAmount;
  }

  public int getUnitPriceSugar() {
    return unitPriceSugar;
  }

  public void setUnitPriceSugar(int unitPriceSugar) {
    this.unitPriceSugar = unitPriceSugar;
  }

}

