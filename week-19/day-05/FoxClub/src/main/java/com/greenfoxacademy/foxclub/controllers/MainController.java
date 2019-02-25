package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.services.FoxService;
import com.greenfoxacademy.foxclub.services.NutritionService;
import com.greenfoxacademy.foxclub.services.TrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  private FoxService foxService;
  private NutritionService nutritionService;
  private TrickService trickService;

  @Autowired
  public MainController(FoxService foxService, NutritionService nutritionService, TrickService trickService){
    this.foxService = foxService;
    this.nutritionService = nutritionService;
    this.trickService = trickService;
  }

  @GetMapping("/main")
  public String renderIndex(){
    return "index";
  }

}
