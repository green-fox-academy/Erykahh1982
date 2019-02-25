package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.repositories.NutritionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NutritionService {

  private NutritionRepository nutritionRepository;

  @Autowired
  public NutritionService(NutritionRepository nutritionRepository) {
    this.nutritionRepository = nutritionRepository;
  }

  public void addFoodToFoods(String food) {
    nutritionRepository.addFood(food);
  }

  public void addDrinkToDrinks(String drink) {
    nutritionRepository.addDrink(drink);
  }
}
