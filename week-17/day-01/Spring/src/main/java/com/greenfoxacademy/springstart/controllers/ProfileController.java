package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProfileController {

//  @GetMapping("/{userName}")
//  public String renderProfilePage(Model model,@PathVariable(value = "userName") String userName){
//    model.addAttribute("name", userName);
//    return "profile";
//  }
}
