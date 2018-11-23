public class Sharpie {
  private String color;
  private float width;
  private float inkAmount;

  private Sharpie() {
  }

  public Sharpie(String color, float width, float inkAmount) {
    this.inkAmount = inkAmount;
    this.color = color;
    this.width = width;

  }

  public void use() {
    inkAmount--;
  }

  @Override
  public String toString() {
    return "Sharpie{" +
        "color='" + color + '\'' +
        ", width=" + width +
        ", inkAmount=" + inkAmount +
        '}';
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setWidth(float width) {
    this.width = width;
  }

  public void setInkAmount(float inkAmount) {
    this.inkAmount = inkAmount;
  }

  public String getColor() {
    return color;
  }

  public float getWidth() {
    return width;
  }

  public float getInkAmount() {
    return inkAmount;
  }

}
