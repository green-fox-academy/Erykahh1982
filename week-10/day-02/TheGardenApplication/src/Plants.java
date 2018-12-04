import java.lang.reflect.Type;

public class Plants {
  private Type type;
  private String color;
  private int currentWater = 0;
  private boolean needsWater = true;
  private int absorbPercentage;
  private int thirstThreshold;

  public enum Type {tree, flower}

  public Plants(String color, Type type, int absorbPercentage, int thirstThreshold) {
    this.color = color;
    this.type = type;
    this.absorbPercentage = absorbPercentage;
    this.thirstThreshold = thirstThreshold;
  }

  public void checkWaterDemand() {
    needsWater = currentWater < thirstThreshold;
  }

  public boolean doesItNeedWater() {
    return needsWater;
  }

  public void waterPlants(int liters){
    currentWater += liters * absorbPercentage / 100;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getCurrentWater() {
    return currentWater;
  }

  public void setCurrentWater(int currentWater) {
    this.currentWater = currentWater;
  }

  public void setNeedsWater(boolean needsWater) {
    this.needsWater = needsWater;
  }

  @Override
  public String toString() {
    checkWaterDemand();
    if (needsWater) {
      return "The " + getColor() + " " + getType() + " needs water.";
    } else {
      return "The " + getColor() + " " + getType() + " doesn't need any water.";
    }
  }
}
