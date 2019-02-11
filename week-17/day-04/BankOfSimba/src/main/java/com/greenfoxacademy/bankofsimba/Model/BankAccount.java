package com.greenfoxacademy.bankofsimba.Model;

public class BankAccount {

  private String name;
  private int balance;
  private String animalType;
  private boolean kingOfJungle;
  private boolean badGuy;

  public static final String CURRENCY = "Zebras";

  public BankAccount() {
  }

  public BankAccount(String name, int balance, String animalType, boolean kingOfJungle, boolean badGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.kingOfJungle = kingOfJungle;
    this.badGuy = badGuy;
  }

  public float raiseBalance() {
    if (this.kingOfJungle) {
      balance += 100;
    } else {
      balance += 10;
    }
    return balance;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKingOfJungle() {
    return kingOfJungle;
  }

  public void setKingOfJungle(boolean kingOfJungle) {
    this.kingOfJungle = kingOfJungle;
  }

  public boolean isBadGuy() {
    return badGuy;
  }

  public void setBadGuy(boolean badGuy) {
    this.badGuy = badGuy;
  }
}
