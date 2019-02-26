package com.greenfoxacademy.foxclubapp.models;

import java.util.ArrayList;

public class Fox {

  private String name;
  private String imageurl;
  private String food;
  private String drink;
  private ArrayList<Trick> knownTricks;
  private ArrayList<String> actionHistory;

  public Fox() {
    this.food = "steak";
    this.drink = "water";
    this.knownTricks = new ArrayList<>();
    this.actionHistory = new ArrayList<>();
  }

  public Fox(String name) {
    this.name = name;
    this.food = "steak";
    this.drink = "water";
    this.knownTricks = new ArrayList<>();
    this.actionHistory = new ArrayList<>();
  }

  public Fox(String name, String imageurl) {
    this.name = name;
    this.imageurl = imageurl;
    this.food = "steak";
    this.drink = "water";
    this.knownTricks = new ArrayList<>();
    this.actionHistory = new ArrayList<>();
  }

  public int trickCount() {
    return knownTricks.size();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImageurl() {
    return imageurl;
  }

  public void setImageurl(String imageurl) {
    this.imageurl = imageurl;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public ArrayList<Trick> getKnownTricks() {
    return knownTricks;
  }

  public void setKnownTricks(ArrayList<Trick> knownTricks) {
    this.knownTricks = knownTricks;
  }

  public ArrayList<String> getActionHistory() {
    return actionHistory;
  }

  public void setActionHistory(ArrayList<String> actionHistory) {
    this.actionHistory = actionHistory;
  }

}
