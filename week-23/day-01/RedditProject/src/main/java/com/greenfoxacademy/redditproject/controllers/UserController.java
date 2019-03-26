package com.greenfoxacademy.redditproject.controllers;

import com.greenfoxacademy.redditproject.models.User;
import com.greenfoxacademy.redditproject.services.PostService;
import com.greenfoxacademy.redditproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

  private UserService userService;
  private PostService postService;

  @Autowired
  public UserController(UserService userService, PostService postService) {
    this.userService = userService;
    this.postService = postService;
  }

  @GetMapping("/register")
  public String renderRegisterPage(){
    return "register";
  }

  @GetMapping("/login")
  public String renderLoginPage(){
    return "login";
  }

  @PostMapping("/login")
  public String loginAUser(@ModelAttribute User user){

    return "redirect:/{id}";
  }

  @PostMapping("/register")
  public String saveRegistration(@ModelAttribute User user){
    userService.saveUser(user);
    return "redirect:/";
  }
}
