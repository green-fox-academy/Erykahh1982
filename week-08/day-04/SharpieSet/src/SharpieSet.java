import java.util.ArrayList;

public class SharpieSet {
  private ArrayList<Sharpie> sharpieList;

  public SharpieSet() {
    this.sharpieList = new ArrayList<>();
  }

  public void add(Sharpie sharpie) {
    this.sharpieList.add(sharpie);
  }

  public int countUsable() {
    int countSharpie = 0;
    for (int i = 0; i < sharpieList.size(); i++) {
      if (sharpieList.get(i).getInkAmount() != 0) {
        countSharpie++;
      }
    }
    return countSharpie;
  }

  public void removeTrash() {
    for (int i = 0; i < sharpieList.size(); i++) {
      if (sharpieList.get(i).getInkAmount() == 0) {
        sharpieList.remove(i);
        i--;
      }
    }
  }

  public ArrayList<Sharpie> getSharpieList() {
    return sharpieList;
  }

  public void setSharpieList(ArrayList<Sharpie> sharpieList) {
    this.sharpieList = sharpieList;
  }

  public void display() {
    for (int i = 0; i < sharpieList.size(); i++) {
      System.out.println(sharpieList.get(i).toString());
    }
  }

  @Override
  public String toString() {
    return "SharpieSet{" +
        "sharpieList=" + sharpieList +
        '}';
  }
}
