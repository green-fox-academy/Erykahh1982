package com.greenfoxacademy.redditproject.controllers;

import com.greenfoxacademy.redditproject.models.Post;
import com.greenfoxacademy.redditproject.services.PostService;
import com.greenfoxacademy.redditproject.services.UserService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class PostController {

  private PostService postService;
  private UserService userService;

  @Autowired
  public PostController(PostService postService, UserService userService) {
    this.postService = postService;
    this.userService = userService;
  }

  @GetMapping("/")
  public String renderMainPage(Model model) {
    model.addAttribute("posts", postService.listAllPosts());
    return "mainpage";
  }

  @GetMapping("/upvote/{id}")
  public String upvotePost(@PathVariable long id) {
    postService.upvotePost(id);
    return "redirect:/";
  }

  @GetMapping("/downvote/{id}")
  public String downvotePost(@PathVariable long id) {
    postService.downvotePost(id);
    return "redirect:/";
  }


  @GetMapping("/add")
  public String renderAddNewPostPage() {
    return "addnewpost";
  }

  @PostMapping("/add")
  public String submitANewPost(@ModelAttribute Post post) {
    postService.savePost(post);
    return "redirect:/";
  }
}
