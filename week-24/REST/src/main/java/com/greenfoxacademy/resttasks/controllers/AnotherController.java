package com.greenfoxacademy.resttasks.controllers;


import com.greenfoxacademy.resttasks.models.Doubling;
import com.greenfoxacademy.resttasks.models.Error;
import com.greenfoxacademy.resttasks.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherController {

  private RestService restService;

  @Autowired
  public AnotherController(RestService restService) {
    this.restService = restService;
  }

  @RequestMapping("/doubling")
  public Object doubling(@RequestParam(required = false) Integer input) {

    if (input == null) {
      return new Error();
    } else {
      return new Doubling(input);
    }
  }
}
