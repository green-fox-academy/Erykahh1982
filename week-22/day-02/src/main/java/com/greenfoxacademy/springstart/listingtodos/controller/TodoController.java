package com.greenfoxacademy.springstart.listingtodos.controller;

import com.greenfoxacademy.springstart.listingtodos.model.Todo;
import com.greenfoxacademy.springstart.listingtodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  private TodoRepository todoRepository;

  @GetMapping("/list")
  public String list(Model model) {

    ArrayList<Todo>todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos::add);
    model.addAttribute("models", todos);

    return "todolist";
  }
}
