package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  private AtomicLong countWebsiteLoad = new AtomicLong(1);

  @RequestMapping("/web/greeting")  // http://localhost:8080/web/greeting will show "Hello, Erika!"
  public String greeting(Model model) {
    model.addAttribute("username", " Erika");
    model.addAttribute("counter", countWebsiteLoad.incrementAndGet());  //I again create an AtomicLong variable countWebsiteLoad which I connect with the html page via the attributeName, this is how they are linked. We have to use the method .incrementAndGet() of the AtomicLong type variable where the  attributeValue will use the countWebsiteLoad field
    return "greeting";   //I write "greeting" here, as my html template name is greeting.html , the program looks for the name of the html file
  }

//  @RequestMapping("/web/greeting")
//  // http://localhost:8080/web/greeting will show "greeting" on the screen
//  @ResponseBody             if I add annotation to this request mapping, the exact String "greeting" will appear on the website
//  public String greeting(Model model) {
//    model.addAttribute("username", " Erika");
//    return "greeting";
//  }

}
