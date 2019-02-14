package com.greenfoxacademy.dependencyexcercise.controllers;

import com.greenfoxacademy.dependencyexcercise.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UtilityController {

  private UtilityService utilityService;

  @Autowired
  public UtilityController() {
  }

  @RequestMapping(value = "/useful", method = RequestMethod.GET)
  public String renderUsefulPage() {
    return "utilities";
  }

  @RequestMapping(value = "/useful/colored", method = RequestMethod.GET)
  public String loadColoredWedSite(Model model, UtilityService utilityService) {

    String color = utilityService.randomColor();
    model.addAttribute("color",color);
    return "coloredwebsite";
  }
}
