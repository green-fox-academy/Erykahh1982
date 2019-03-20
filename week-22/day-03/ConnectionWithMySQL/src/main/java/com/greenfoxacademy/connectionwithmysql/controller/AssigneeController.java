package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.model.Assignee;
import com.greenfoxacademy.connectionwithmysql.service.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

  private AssigneeService assigneeService;

  @Autowired
  public AssigneeController(AssigneeService assigneeService) {
    this.assigneeService = assigneeService;
  }

  @GetMapping("/list")
  public String renderAssigneeList(Model model) {

    model.addAttribute("assignees", assigneeService.listAllAssignees());
    return "assigneelist";
  }

  @GetMapping("/add")
  public String renderAddNewAssignee() {
    return "addnewassignee";
  }

  @PostMapping("/add")
  public String addNewAssignee(@ModelAttribute Assignee assignee) {
    assigneeService.saveNewAssignee(assignee);
    return "redirect:/assignee/list";
  }

  @GetMapping("/{id}/delete")
  public String deleteAssignee(@PathVariable long id) {

    assigneeService.deleteAssignee(id);
    return "redirect:/assignee/list";
  }

  @GetMapping("/{id}/edit")
  public String editAssignee(@PathVariable long id, @ModelAttribute Assignee assignee, Model model) {

    Assignee editableAssignee = assigneeService.findAssigneeById(id);
    model.addAttribute("assignee", editableAssignee);
    return "editassignee";
  }

  @PostMapping("/{id}/edit")
  public String postEditAssignee(@PathVariable long id, @ModelAttribute Assignee assignee) {

    Assignee editableAssigne = assigneeService.findAssigneeById(id);
    editableAssigne = assigneeService.editAssignee(assignee);
    editableAssigne.setEmail(editableAssigne.getEmail());

    return "redirect:/assignee/list";
  }
}
