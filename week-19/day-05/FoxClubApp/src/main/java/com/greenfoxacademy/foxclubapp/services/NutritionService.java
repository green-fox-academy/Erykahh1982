package com.greenfoxacademy.foxclubapp.services;

import com.greenfoxacademy.foxclubapp.repositories.NutritionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NutritionService {

  private NutritionRepository nutritionRepository;

  @Autowired
  public NutritionService(NutritionRepository nutritionRepository) {
    this.nutritionRepository = nutritionRepository;
  }

  public ArrayList<String> displayFoods() {
    return nutritionRepository.getFoodsToChoose();
  }

  public ArrayList<String> displayDrinks() {
    return nutritionRepository.getDrinksToChoose();
  }

}
