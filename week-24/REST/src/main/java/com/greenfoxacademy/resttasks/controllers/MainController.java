package com.greenfoxacademy.resttasks.controllers;

import com.greenfoxacademy.resttasks.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private RestService restService;

  @Autowired
  public MainController(RestService restService) {
    this.restService = restService;
  }

  @GetMapping("/")
  public String renderIndex() {
    return "index";
  }



}
