package com.greenfoxacademy.foxclubapp.controllers;

import com.greenfoxacademy.foxclubapp.models.Fox;
import com.greenfoxacademy.foxclubapp.repositories.ImageRepository;
import com.greenfoxacademy.foxclubapp.services.FoxService;
import com.greenfoxacademy.foxclubapp.services.NutritionService;
import com.greenfoxacademy.foxclubapp.services.TrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class MainController {

  private FoxService foxService;
  private NutritionService nutritionService;
  private TrickService trickService;
  @Autowired
  private ImageRepository imageRepository;

  @Autowired
  public MainController(FoxService foxService, NutritionService nutritionService, TrickService trickService) {
    this.foxService = foxService;
    this.nutritionService = nutritionService;
    this.trickService = trickService;
  }

  @GetMapping("/main")
  public String renderWelcomePage() {
    return "index";
  }

  @GetMapping("/register")
  public String renderRegisterPage(Model model) {

    model.addAttribute("imagelist", imageRepository.getImages());
    return "register";
  }

  @PostMapping("/register")
  public String registerTheFox(@ModelAttribute(value = "name") String name, @ModelAttribute(value = "imageurl") String imageurl, Model model) {
    if (foxService.checkIfFoxIsRegistered(name)) {
      model.addAttribute("error", "Someone has already registered with this name, please select another one");
      model.addAttribute("imagelist", imageRepository.getImages());
      return "register";
    } else {
      foxService.registerANewFox(name, imageurl);
      return "redirect:/information?name=" + name;
    }
  }

  @GetMapping("/login")
  public String renderLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String postLoginForm(@RequestParam(name = "name") String name) {
    if (foxService.checkIfFoxIsRegistered(name)) {
      return "redirect:/information?name=" + name;
    } else {
      return "redirect:/register";
    }
  }


  @GetMapping("/information")
  public String renderInformationPage(@RequestParam(value = "name") String name, Model model) {
    Fox fox = foxService.loginAFox(name);
    model.addAttribute("fox", fox);
    model.addAttribute("last5", foxService.list5LatestAction(name));
    return "information";
  }


}
