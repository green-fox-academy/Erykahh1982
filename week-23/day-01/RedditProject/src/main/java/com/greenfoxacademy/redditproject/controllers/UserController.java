package com.greenfoxacademy.redditproject.controllers;

import com.greenfoxacademy.redditproject.models.User;
import com.greenfoxacademy.redditproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

  private UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/register")
  public String renderRegisterPage() {
    return "register";
  }

  @GetMapping("/login")
  public String renderLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String loginAUser(@RequestParam String name) {
    if (!userService.checkIfUserIsAlreadyRegistered(name)) {
      return "register";
    } else {
      User user = userService.findUserByName(name);
      return "redirect:/" + user.getId();
    }
  }

  @PostMapping("/register")
  public String saveRegistration(@ModelAttribute User user,
                                 @RequestParam String name) {

    if (userService.checkIfUserIsAlreadyRegistered(name)) {
      return "login";
    } else {
      userService.saveUser(user);
      return "redirect:/" + user.getId();
    }
  }
}
