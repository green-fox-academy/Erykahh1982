package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWebController {

  @RequestMapping("/web/greeting")    // http://localhost:8080/web/greeting will show "Hello, Erika!"
  public String greeting(Model model) {
    model.addAttribute("username", " Erika");
    return "greeting";
  }
}
