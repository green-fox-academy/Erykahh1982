package com.greenfoxacademy.foxclubapp.repositories;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;

@Repository
public class NutritionRepository {

  private ArrayList<String> drinksToChoose;
  private ArrayList<String> foodsToChoose;

  public NutritionRepository() {
    this.foodsToChoose = new ArrayList<>(Arrays.asList("pizza", "bone", "spagetti", "steak", "pasta"));
    this.drinksToChoose = new ArrayList<>(Arrays.asList("water", "lemonade", "soda", "cola", "vine"));
  }

  public void addFood(String food) {
    foodsToChoose.add(food);
  }

  public void addDrink(String drink) {
    drinksToChoose.add(drink);
  }

  public ArrayList<String> getDrinksToChoose() {
    return drinksToChoose;
  }

  public void setDrinksToChoose(ArrayList<String> drinksToChoose) {
    this.drinksToChoose = drinksToChoose;
  }

  public ArrayList<String> getFoodsToChoose() {
    return foodsToChoose;
  }

  public void setFoodsToChoose(ArrayList<String> foodsToChoose) {
    this.foodsToChoose = foodsToChoose;
  }
}
