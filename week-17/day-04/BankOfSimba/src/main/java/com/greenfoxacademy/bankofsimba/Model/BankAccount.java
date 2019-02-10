package com.greenfoxacademy.bankofsimba.Model;

public class BankAccount {

  private String name;
  private float balance;
  private String animalType;
  private boolean kingOfJungle;

  public BankAccount() {
  }

  public BankAccount(String name, float balance, String animalType, boolean kingOfJungle) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.kingOfJungle = kingOfJungle;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(float balance) {
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
}
