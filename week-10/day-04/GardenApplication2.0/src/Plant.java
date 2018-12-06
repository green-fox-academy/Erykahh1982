public class Plant {
  private String color;
  private float currentWaterAmount;
  private int waterNeed;
  private float waterAbsorbRatio;

  public Plant(String color, int waterNeed, float waterAbsorbRatio) {
    this.color = color;
    this.waterNeed = waterNeed;
    this.waterAbsorbRatio = waterAbsorbRatio;
  }

  @Override
  public String toString() {
    return String.format("The %s %s %s water",
        this.color,
        this.getClass().getSimpleName(),
        isThirsty() ? " needs" : "doesn't need"
    );
  }

  public String getColor() {
    return color;
  }

  public boolean isThirsty() {
    return currentWaterAmount < waterNeed;
  }

  public void water(float waterAmount) {
    currentWaterAmount += waterAmount * waterAbsorbRatio;

  }

  public void setColor(String color) {
    this.color = color;
  }

  public float getCurrentWaterAmount() {
    return currentWaterAmount;
  }

  public void setCurrentWaterAmount(int currentWaterAmount) {
    this.currentWaterAmount = currentWaterAmount;
  }

  public void setWaterAbsorbRatio(float waterAbsorbRatio) {
    this.waterAbsorbRatio = waterAbsorbRatio;
  }

  public int getWaterNeed() {
    return waterNeed;
  }

  public void setWaterNeed(int waterNeed) {
    this.waterNeed = waterNeed;
  }

  public float getWaterAbsorbRatio() {
    return waterAbsorbRatio;
  }
}
