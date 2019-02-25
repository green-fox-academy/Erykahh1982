package com.greenfoxacademy.foxclub.repositories;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;

@Repository
public class NutritionRepository {

  private ArrayList<String> foodsToChoose;
  private ArrayList<String> drinksToChoose;

  public NutritionRepository() {
    this.foodsToChoose = new ArrayList<>(Arrays.asList("pizza", "bone", "spagetti", "steak", "pasta"));
    this.drinksToChoose = new ArrayList<>(Arrays.asList("water", "lemonade", "soda", "cola", "vine"));
  }

  public ArrayList<String> showAllFoodsToChoose() {
    return foodsToChoose;
  }

  public void setFoodsToChoose(ArrayList<String> foodsToChoose) {
    this.foodsToChoose = foodsToChoose;
  }

  public ArrayList<String> showAllDrinksToChoose() {
    return drinksToChoose;
  }

  public void setDrinksToChoose(ArrayList<String> drinksToChoose) {
    this.drinksToChoose = drinksToChoose;
  }

  public void addFood(String food){
    foodsToChoose.add(food);
  }

  public void addDrink (String drink){
    drinksToChoose.add(drink);
  }
}
