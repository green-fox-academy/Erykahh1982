package com.greenfoxacademy.foxclub.models;

import java.util.ArrayList;

public class Fox {

  private String name;
  private String imageurl;
  private String food;
  private String drink;
  private ArrayList<Trick> tricks;
  private ArrayList<String> actions;
  private ArrayList<String> specialFood;
  private ArrayList<String> specialDrink;

  public Fox() {
    this.drink = "water";
    this.food = "bread";
    this.tricks = new ArrayList<>();
    this.actions = new ArrayList<>();
    this.specialDrink = new ArrayList<>();
    this.specialFood = new ArrayList<>();
  }

  public Fox(String name, String imageurl) {
    this.name = name;
    this.imageurl = imageurl;
    this.drink = "water";
    this.food = "bread";
    this.tricks = new ArrayList<>();
    this.actions = new ArrayList<>();
    this.specialDrink = new ArrayList<>();
    this.specialFood = new ArrayList<>();
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

  public ArrayList<Trick> getTricks() {
    return tricks;
  }

  public void setTricks(ArrayList<Trick> tricks) {
    this.tricks = tricks;
  }

  public ArrayList<String> getActions() {
    return actions;
  }

  public void setActions(ArrayList<String> actions) {
    this.actions = actions;
  }

  public ArrayList<String> getSpecialFood() {
    return specialFood;
  }

  public void setSpecialFood(ArrayList<String> specialFood) {
    this.specialFood = specialFood;
  }

  public ArrayList<String> getSpecialDrink() {
    return specialDrink;
  }

  public void setSpecialDrink(ArrayList<String> specialDrink) {
    this.specialDrink = specialDrink;
  }

}
