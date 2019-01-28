import java.util.ArrayList;

public class CandyShop {

  private int sugarInventory;
  private int moneyIncome;
  private int sugarIncomePrice;
  private ArrayList<Sweet> candyShop;

  public static final String CANDY = "CANDY";
  public static final String LOLLIPOP = "LOLLIPOP";

  public CandyShop(int sugarInventory) {
    this.moneyIncome = moneyIncome;
    this.candyShop = new ArrayList<>();
    this.sugarInventory = sugarInventory;
    this.sugarIncomePrice = 1000 / 100;
  }

  public void sell(String type, int amount) {
    int counter = 0;
    Sweet sweet = candyShop.get(0);

    do {
      if (sweet.getType().equals(type)) {
        removeFromStorage(sweet);
        this.moneyIncome += amount * sweet.getUnitSellingPriceSweet();
      }
      counter++;
      sweet = candyShop.get(counter);
    } while (counter < amount);

//    for (Sweet sweet : candyShop) {
//      if (sweet.getType().equals(type)) {
//        counter++;
//        this.moneyIncome += amount * sweet.getUnitSellingPriceSweet();
//        removeFromStorage(sweet);
//        if (counter == amount) {
//          return;
//        }
//      }
//    }
  }

  public void removeFromStorage(Sweet sweet) {
    candyShop.remove(sweet);
  }

  public void raise(int percentageToRaise) {
    for (Sweet sweet : candyShop) {
      sweet.setUnitSellingPriceSweet(sweet.getUnitSellingPriceSweet() * (1 + percentageToRaise / 100));
    }
  }

  public void createSweets(String type) {
    if (type.equals("CANDY")) {
      Candy candy = new Candy();
      candyShop.add(candy);
      this.sugarInventory -= candy.getSugarAmount();
    } else {
      Lollipop lollipop = new Lollipop();
      candyShop.add(lollipop);
      this.sugarInventory -= lollipop.getSugarAmount();
    }
  }

  public void buySugar(int amount) {
    this.moneyIncome -= amount * this.sugarIncomePrice;
    this.sugarInventory += amount;
  }

  @Override
  public String toString() {
    int nrOfCandies = findNumberOfCandies();
    return "Inventory: "
        + candyShop.size()
        + " sweets,"
        + nrOfCandies
        + " candies, "
        + (candyShop.size() - nrOfCandies) + " lollipops, Income: "
        + moneyIncome
        + "$ Sugar: "
        + sugarInventory
        + " gr.";
  }

  public int findNumberOfCandies() {
    int counterCandy = 0;
    for (Sweet sweet : candyShop) {
      if (sweet.getType().equals(CANDY)) {
        counterCandy++;
      }
    }
    return counterCandy;
  }
}