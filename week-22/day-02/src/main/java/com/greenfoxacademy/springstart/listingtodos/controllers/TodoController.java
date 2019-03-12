package com.greenfoxacademy.springstart.listingtodos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @GetMapping("/list")
  @ResponseBody
  public String list(){
    return "This is my first Todo";
  }
}
