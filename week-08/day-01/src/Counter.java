public class Counter<number> {
  private int counter;
  private int originalCounter;

  public Counter() {
    this.counter = 0;
    originalCounter = 0;
  }

  public Counter(int counter) {
    this.counter = counter;
    originalCounter = counter;
  }

  public void add() {
    counter++;
  }

  public void add(int numberToAdd){
    this.counter += numberToAdd;
  }

  public int get() {
    return counter;
  }

  public void reset() {
    this.counter = originalCounter;
  }

  public void setCounter(int counter) {
    this.counter = counter;
  }

  @Override
  public String toString() {
    return "Counter{" +
        "counter=" + counter +
        ", originalCounter=" + originalCounter +
        '}';
  }
}
