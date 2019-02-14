package com.greenfoxacademy.dependencyexcercise.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UtilityController {

  @Autowired
  public UtilityController() {
  }

  @RequestMapping(value = "/useful", method = RequestMethod.GET)
  public String renderUsefulPage(){
    return "utilities";
  }
}
