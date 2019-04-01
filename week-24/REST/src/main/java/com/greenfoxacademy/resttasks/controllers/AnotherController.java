package com.greenfoxacademy.resttasks.controllers;


import com.greenfoxacademy.resttasks.models.AppendA;
import com.greenfoxacademy.resttasks.models.Doubling;
import com.greenfoxacademy.resttasks.models.Error;
import com.greenfoxacademy.resttasks.models.Greeter;
import com.greenfoxacademy.resttasks.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AnotherController {

  private RestService restService;

  @Autowired
  public AnotherController(RestService restService) {
    this.restService = restService;
  }

  @RequestMapping("/doubling")
  public Object renderDoubling(@RequestParam(required = false) Integer input) {

    if (input == null) {
      return new Error("Please provide an input!");
    } else {
      return new Doubling(input);
    }
  }

  @GetMapping("/greeter")
  public Object renderGreeter(@RequestParam(required = false, value = "name") String name,
                              @RequestParam(required = false, value = "title") String title) {

    if ((name == null) && (title == null)) {
      return new Error("Please provide a name and a title!");
    } else if (name == null) {
      return new Error("Please provide a name!");
    } else if (title == null) {
      return new Error("Please provide a title!");
    } else {
      return new Greeter(name, title);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object renderAppenda(@PathVariable String appendable) {

    if (appendable == null) {
      return "redirect:/error";
    } else {
      return new AppendA(appendable);
    }
  }

  @GetMapping("/error")
  public String renderError() {
    return "404";
  }
}
