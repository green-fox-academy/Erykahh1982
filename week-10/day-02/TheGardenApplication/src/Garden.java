import java.util.ArrayList;

public class Garden {
  private ArrayList<Flower> flowers;
  private ArrayList<Tree> trees;
  private int waterDemandLevel;
  private String color;


  public Garden(){
    this.flowers = new ArrayList<>();
    this.trees = new ArrayList<>();
  }

  public void water(){

  }

  public int getWaterDemandLevel() {
    return waterDemandLevel;
  }

  public void setWaterDemandLevel(int waterDemandLevel) {
    this.waterDemandLevel = waterDemandLevel;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
