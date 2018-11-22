public class Station {
  private String name;
  private int gasAmount;

  public Station(String name, int gasAmount) {
    this.name = name;
    this.gasAmount = gasAmount;
  }

  public void refill(Car name) {
    this.gasAmount -= (name.getCapacity() - name.getGasAmount());
    name.setGasAmount(100);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGasAmount() {
    return gasAmount;
  }

  public void setGasAmount(int gasAmount) {
    this.gasAmount = gasAmount;
  }


  @Override
  public String toString() {
    return "Station{" +
        "name='" + name + '\'' +
        ", gasAmount=" + gasAmount +
        '}';
  }
}
