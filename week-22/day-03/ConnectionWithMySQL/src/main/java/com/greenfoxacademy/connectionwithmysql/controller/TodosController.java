package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import com.greenfoxacademy.connectionwithmysql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/todo")
public class TodosController {

  private TodoRepository todoRepository;
  private TodoService todoService;

  @Autowired
  public TodosController(TodoRepository todoRepository, TodoService todoService) {
    this.todoRepository = todoRepository;
    this.todoService = todoService;
  }

  @GetMapping("/list")
  public String list(Model model) {

    model.addAttribute("models", todoService.listAllItems());
    return "todolist";
  }

  @GetMapping("/ver1/")
  public String list2(Model model, @RequestParam(required = false) boolean isActive) {
    ArrayList<Todo> todos;
    if (isActive) {
      todos = todoService.listDoneItems();
    } else {
      todos = todoService.listAllItems();
    }
    model.addAttribute("models", todos);
    return "todolist";
  }

  @GetMapping("/ver2/")
  public String list3(Model model, @RequestParam(required = false) boolean isActive) {
    if (isActive) {
      model.addAttribute("models", todoService.listDoneItems());
    } else {
      model.addAttribute("models", todoService.listAllItems());
    }
    return "todolist";
  }

  @GetMapping("/add")
  public String addNewTodo(){
    return "addnew";
  }
}
