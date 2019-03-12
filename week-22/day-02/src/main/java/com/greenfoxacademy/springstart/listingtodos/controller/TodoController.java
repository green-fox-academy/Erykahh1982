package com.greenfoxacademy.springstart.listingtodos.controller;

import com.greenfoxacademy.springstart.listingtodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  private TodoRepository todoRepository;

  @GetMapping("/list")
  @ResponseBody
  public String list(){
    return "This is my first Todo";
  }
}
