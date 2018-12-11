package main.java.music;

public abstract class StringedInstrument extends Instrument {

  private int numberOfStrings;

  public StringedInstrument(String name, int numberOfStrings) {
    super(name);
    this.numberOfStrings = numberOfStrings;
  }

  public abstract String sound();


  @Override
  public void play() {
    System.out.println(getName() + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
  }

}
