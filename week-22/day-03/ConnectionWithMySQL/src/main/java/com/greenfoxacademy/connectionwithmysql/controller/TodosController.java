package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.model.Assignee;
import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.service.AssigneeService;
import com.greenfoxacademy.connectionwithmysql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/todo")
public class TodosController {

  private TodoService todoService;
  private AssigneeService assigneeService;

  @Autowired
  public TodosController(TodoService todoService, AssigneeService assigneeService) {
    this.todoService = todoService;
    this.assigneeService = assigneeService;
  }

  @GetMapping("/list")
  public String list(Model model, @RequestParam(required = false) String wordpart) {

    ArrayList<Todo> filteredTodos = new ArrayList<>();

    if (wordpart == null) {
      filteredTodos = todoService.listAllItems();
    } else {
      filteredTodos = todoService.searchForTodo(wordpart);
    }
    model.addAttribute("models", filteredTodos);
    model.addAttribute("assignees", assigneeService.listAllAssignees());
    model.addAttribute("duedates", todoService.listAllDueDates());

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
  public String renderAddNewPage() {
    return "addnew";
  }

  @PostMapping("/add")
  public String addNewTodo(@ModelAttribute Todo todo) {

    todoService.saveNewTodo(todo);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable long id) {

    todoService.deleteTodo(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String edit(@PathVariable long id, @ModelAttribute Todo todo, Model model) {

    Todo editableTodo = todoService.findTodoById(id);
    model.addAttribute("todo", editableTodo);
    model.addAttribute("assignees", assigneeService.listAllAssignees());
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String postEdit(@PathVariable long id, @ModelAttribute Todo todo) {

    todoService.editTodo(todo, id);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/details")
  public String showDetails(@PathVariable long id, Model model, @ModelAttribute Todo todo) {

    Todo todoDetail = todoService.findTodoById(id);
    model.addAttribute("todo", todoDetail);
    return "details";
  }

  @GetMapping("/{id}/assigneedetails")
  public String renderAssigneeDetailsPage(@PathVariable long id, Model model, @ModelAttribute Assignee assignee) {

    Assignee assigneeDetail = assigneeService.findAssigneeById(id);
    ArrayList<Todo> filteredTodosByAssignee = todoService.findTodosByAssignee(assignee);
    model.addAttribute("assignee", assigneeDetail);
    model.addAttribute("todos", filteredTodosByAssignee);

    return "assigneedetails";
  }

}
