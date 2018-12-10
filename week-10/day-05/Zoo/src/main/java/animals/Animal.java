package main.java.animals;

public abstract class Animal {
  private String name;
  private int age;
  private String gender;
  private String habitat;
  private int numberOfLegs;
  private int litersOfWater;
  private int foodLevel;


  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public abstract String breed();

  public abstract String eat();

  public void drinkWater() {
    System.out.println("The " + getName() + "s" + " drink " + litersOfWater + " of water a day");
  }

  public int getNumberOfLegs() {
    return this.numberOfLegs;
  }

}
