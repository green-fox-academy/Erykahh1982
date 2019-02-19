package com.greenfoxacademy.programmersfoxclub.controllers;

import com.greenfoxacademy.programmersfoxclub.model.Fox;
import com.greenfoxacademy.programmersfoxclub.services.FoxService;
import com.greenfoxacademy.programmersfoxclub.services.NutritionService;
import com.greenfoxacademy.programmersfoxclub.services.TrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FoxClubController {

  private NutritionService nutritionService;
  private TrickService trickService;
  private FoxService foxService;

  @Autowired
  public FoxClubController(NutritionService nutritionService, TrickService trickService, FoxService foxService){
    this.foxService = foxService;
    this.trickService = trickService;
    this.nutritionService = nutritionService;
  }

  @GetMapping("/main")
  public String renderMainPage(@RequestParam(required=false) String name, Model model) {
    model.addAttribute("name", name);
    return "index";
  }

  @GetMapping("/information")
  public String renderInformationPage(@RequestParam(name = "name") String name, Model model){

    Fox fox = foxService.loginAFox(name);
    model.addAttribute("character", fox);

    if(trickService.showAlreadyCompletedList().isEmpty()){
      model.addAttribute("error", "No tricks to show yet, go and learn some");
    }else {
      model.addAttribute("trickcount", trickService.countTricks());
      model.addAttribute("list", trickService.listAllTricks());
    }
    return "information";
  }

  @GetMapping("/login")
  public String renderLoginPage() {
    return "login";
  }

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public String postLoginForm(@RequestParam(name = "name") String name) {

    return "redirect:/information/?name="+ name;
  }

  @GetMapping("/nutrition")
  public String renderNutriotionPage(){
    return "nutrition";
  }

  @GetMapping("/trickstore")
  public String renderTrickStorePage(){
    return "tricks";
  }
}
