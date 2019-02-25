package com.greenfoxacademy.foxclub.repositories;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;

@Repository
public class NutritionRepository {

  public ArrayList<String> foodsToChoose;
  public ArrayList<String> drinksToChoose;

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

}
