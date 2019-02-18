package com.greenfoxacademy.programmersfoxclub.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoodService{

  private ArrayList<String> foods;

  public FoodService(){
    this.foods = new ArrayList<>();
  }

  public void addFood(String foodName){
    foods.add(foodName);
  }

  public ArrayList<String> listAllFoods(){
    return foods;
  }
}
