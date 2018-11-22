public class Car {
  private String carRegistrationNumber;
  private int gasAmount;
  private int capacity;

  public Car(String carRegisterNumber, int gasAmount) {
    this.carRegistrationNumber = carRegisterNumber;
    this.gasAmount = gasAmount;
    this.capacity = 100;
  }

  public String getCarRegisterNumber() {
    return carRegistrationNumber;
  }

  public void setCarRegisterNumber(String carRegisterNumber) {
    this.carRegistrationNumber = carRegisterNumber;
  }

  public int getGasAmount() {
    return gasAmount;
  }

  public void setGasAmount(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  @Override
  public String toString() {
    return "Car{" +
        "carRegisterNumber='" + carRegistrationNumber + '\'' +
        ", gasAmount=" + gasAmount +
        ", capacity=" + capacity +
        '}';
  }
}
