package com.greenfoxacademy.programmersfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FoxClubController {

  @GetMapping("/main")
  public String renderMainPage(@RequestParam(required=false) String name, Model model) {
    model.addAttribute("name", name);
    return "index";
  }

  @GetMapping("/information")
  public String renderInformationPage(@RequestParam(name = "name") String name, Model model){
    model.addAttribute("name", name);
    return "information";
  }

  @GetMapping("/login")
  public String renderLoginPage() {
    return "login";
  }

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public String postLoginForm(@RequestParam(name = "name") String name, Model model) {
    model.addAttribute("name", name);

    return "redirect:/main/?name="+ name;
  }
}
