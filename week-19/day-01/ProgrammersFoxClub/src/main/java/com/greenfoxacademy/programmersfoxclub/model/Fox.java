package com.greenfoxacademy.programmersfoxclub.model;

import java.util.ArrayList;

public class Fox {

  private String name;
  private ArrayList<String> completedTricks;
  private String food;
  private String drink;
  private ArrayList<Trick> listOfCompletedTricks;


  public Fox() {
    this.completedTricks = new ArrayList<>();
    this.food = "steak";
    this.drink = "water";
    this.listOfCompletedTricks = new ArrayList<>();
  }

  public Fox(String name) {
    this.name = name;
    this.completedTricks = new ArrayList<>();
    this.food = "steak";
    this.drink = "water";
    this.listOfCompletedTricks = new ArrayList<>();
  }

  public void addTrick(String trickName) {
    completedTricks.add(trickName);
  }

  public void addNewTrickObject (Trick trick){
    listOfCompletedTricks.add(trick);
  }

  public int countOftricks() {
    return listOfCompletedTricks.size();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<String> getCompletedTricks() {
    return completedTricks;
  }

  public void setCompletedTricks(ArrayList<String> completedTricks) {
    this.completedTricks = completedTricks;
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

  public ArrayList<Trick> getListOfCompletedTricks() {
    return listOfCompletedTricks;
  }

  public void setListOfCompletedTricks(ArrayList<Trick> listOfCompletedTricks) {
    this.listOfCompletedTricks = listOfCompletedTricks;
  }
}