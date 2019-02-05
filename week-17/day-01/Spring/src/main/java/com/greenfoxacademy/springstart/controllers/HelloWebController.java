package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  private AtomicLong countWebsiteLoad = new AtomicLong();

  @RequestMapping("/web/greeting")  // http://localhost:8080/web/greeting will show "Hello, Erika!"
  public String greeting(Model model) {
    model.addAttribute("username", " Erika");
    return "greeting";   //I write "greeting" here, as my html template name is greeting.html , the program looks for the nem of the html file
  }

//  @RequestMapping("/web/greeting")
//  // http://localhost:8080/web/greeting will show "greeting" on the screen
//  @ResponseBody             if I add annotation to this request mapping, the exact String "greeting" will appear on the website
//  public String greeting(Model model) {
//    model.addAttribute("username", " Erika");
//    return "greeting";
//  }

}
