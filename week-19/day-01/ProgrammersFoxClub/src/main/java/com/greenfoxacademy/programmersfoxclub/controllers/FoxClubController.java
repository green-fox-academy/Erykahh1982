package com.greenfoxacademy.programmersfoxclub.controllers;

import com.greenfoxacademy.programmersfoxclub.model.Fox;
import com.greenfoxacademy.programmersfoxclub.model.Trick;
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
  public FoxClubController(NutritionService nutritionService, TrickService trickService, FoxService foxService) {
    this.foxService = foxService;
    this.trickService = trickService;
    this.nutritionService = nutritionService;
  }

  @GetMapping("/main")
  public String renderMainPage() {
    return "index";
  }

  @GetMapping("/information")
  public String renderInformationPage(@RequestParam(name = "name") String name, Model model) {

    Fox fox = foxService.loginAFox(name);
    model.addAttribute("character", fox);

    if (fox.getListOfCompletedTricks().isEmpty()) {
      model.addAttribute("error", "No tricks to show yet, go and learn some");
    } else {
//      model.addAttribute("trickcount", trickService.countTricks());
      model.addAttribute("trickcount", trickService.trickCount());
      model.addAttribute("list", fox.getListOfCompletedTricks());
    }
    return "information";
  }

  @GetMapping("/login")
  public String renderLoginPage() {
    return "login";
  }

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public String postLoginForm(@RequestParam(name = "name") String name) {

    return "redirect:/information/?name=" + name;
  }

  @GetMapping("/nutrition")
  public String renderNutritionPage(@RequestParam String name, Model model) {

    Fox fox = foxService.loginAFox(name);
    model.addAttribute("character", fox);
    model.addAttribute("foods", nutritionService.getFoods());
    model.addAttribute("drinks", nutritionService.getDrinks());
    return "nutrition";
  }

  @PostMapping("/nutrition")
  public String feedTheFox(@RequestParam(value = "name") String name, @ModelAttribute(value = "food") String food, @ModelAttribute(value = "drink") String drink) {
    foxService.feedTheFox(name, food, drink);
    return "redirect:/information/?name=" + name;
  }

  @GetMapping("/trickstore")
  public String renderTrickStorePage(@RequestParam String name, Model model) {
    Fox fox = foxService.loginAFox(name);

    if (trickService.allCompleted(name)) {
//      model.addAttribute("error",trickService.loadErrorMessage(name));
      model.addAttribute("error", trickService.showErrorMessage(name));
    }

    model.addAttribute("character", fox);
    model.addAttribute("tricks", trickService.showRemainingList(name));
//    model.addAttribute("tricks", trickService.createRemainigList(name));
    return "tricks";
  }

  @PostMapping("/trickstore")
  public String educateFox(@RequestParam(value = "name") String name, @ModelAttribute(value = "trick") String trickName) {
//      foxService.educateTheFox(name, trick);
    if (trickService.checkTrickName(trickName) == true) {
      foxService.teachTheFox(name, trickService.findTrickByName(trickName));
    } else {
      foxService.teachOptional(name, trickName);
    }
    return "redirect:/information/?name=" + name;
  }

  @GetMapping("/actionlog")
  public String renderActionLog(@RequestParam(value = "name") String name, Model model){
    Fox fox = foxService.loginAFox(name);
    model.addAttribute("character", fox);
    return "actionlog";
  }
}
