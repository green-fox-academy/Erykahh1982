package com.greenfoxacademy.programmersfoxclub.model;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class Fox {

  @Autowired
  private String name;
  private ArrayList<String> tricks;
  private String food;
  private String drink;

  public Fox() {
    this.tricks = new ArrayList<>();
  }

  public Fox(String name) {
    this.name = name;
    this.tricks = new ArrayList<>();
  }

  public void addTrick(String trickName) {
    tricks.add(trickName);
  }

  public int countOftricks(){
    return tricks.size();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<String> getTricks() {
    return tricks;
  }

  public void setTricks(ArrayList<String> tricks) {
    this.tricks = tricks;
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
}