package com.greenfoxacademy.programmersfoxclub.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class NutritionService{

  private ArrayList<String> foods;
  private ArrayList<String> drinks;

  public NutritionService(){
    this.foods = new ArrayList<>(Arrays.asList("pizza", "spagetti", "bone"));
    this.drinks = new ArrayList<>(Arrays.asList("water", "lemonade", "energydrink"));
  }

  public void addFood(String foodName){
    foods.add(foodName);
  }
  public void addDrink(String drinkName){
    foods.add(drinkName);
  }

  public ArrayList<String> getFoods() {
    return foods;
  }

  public void setFoods(ArrayList<String> foods) {
    this.foods = foods;
  }

  public ArrayList<String> getDrinks() {
    return drinks;
  }

  public void setDrinks(ArrayList<String> drinks) {
    this.drinks = drinks;
  }
}
