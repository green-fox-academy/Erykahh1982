public class Sweet {

  private String type;
  private int sugarAmount;
  private int unitSellingPriceSweet;
  private int unitPriceSugar;

  public Sweet(String type, int sugarAmount) {
    this.unitPriceSugar = 2;
    this.sugarAmount = sugarAmount;
    this.type = type;
    this.unitSellingPriceSweet = calculateUnitPrice();
  }

  public int calculateUnitPrice() {
    return this.sugarAmount * unitPriceSugar;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

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

