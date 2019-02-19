package com.greenfoxacademy.programmersfoxclub.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NutritionService{

  private ArrayList<String> foods;
  private ArrayList<String> drinks;

  public NutritionService(){
    this.drinks = new ArrayList<>();
    this.foods = new ArrayList<>();
    foods.add("pizza");
    foods.add("spagetti");
    foods.add("bone");
    drinks.add("water");
    drinks.add("lemonade");
    drinks.add("energydrink");
  }

  public void addFood(String foodName){
    foods.add(foodName);
  }
  public void addDrink(String drinkName){
    foods.add(drinkName);
  }

  public ArrayList<String> listAllFoods(){
    return foods;
  }

  public ArrayList<String> listAllDrinks(){
    return drinks;
  }
}
