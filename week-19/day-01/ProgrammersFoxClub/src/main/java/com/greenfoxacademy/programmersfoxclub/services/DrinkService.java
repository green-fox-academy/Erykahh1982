package com.greenfoxacademy.programmersfoxclub.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class DrinkService {

  private ArrayList<String> drinks;

  public DrinkService() {
    this.drinks = new ArrayList<>();
  }

  public void addDrink(String drinkName){
    drinks.add(drinkName);
  }

  public ArrayList<String> listAllDrinks(){
    return drinks;
  }

}
