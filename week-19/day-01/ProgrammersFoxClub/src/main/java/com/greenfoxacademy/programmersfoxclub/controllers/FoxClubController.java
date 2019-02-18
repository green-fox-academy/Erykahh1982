package com.greenfoxacademy.programmersfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoxClubController {

  @GetMapping("/main")
  public String renderMainPage(){
    return "index";
  }
}
