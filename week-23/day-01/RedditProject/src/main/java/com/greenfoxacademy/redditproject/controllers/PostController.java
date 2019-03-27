package com.greenfoxacademy.redditproject.controllers;

import com.greenfoxacademy.redditproject.models.Post;
import com.greenfoxacademy.redditproject.models.User;
import com.greenfoxacademy.redditproject.services.PostService;
import com.greenfoxacademy.redditproject.services.UserService;
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

  @GetMapping("/nouser")
  public String renderMainPageError(Model model) {
    model.addAttribute("posts", postService.listAllPosts());
    return "mainpageerror";
  }

  @GetMapping("/{userid}")
  public String renderMainPageLoggedIn(Model model, @PathVariable long userid) {
    model.addAttribute("user", userService.findUserById(userid));
    model.addAttribute("posts", postService.listAllPosts());
    return "mainpagelogin";
  }

  @GetMapping("/{userid}/upvote/{id}")
  public String upvotePost(@PathVariable long id, @PathVariable long userid) {
    postService.upvotePost(id);
    return "redirect:/" + userid;
  }

  @GetMapping("/{userid}/downvote/{id}")
  public String downvotePost(@PathVariable long id, @PathVariable long userid) {
    postService.downvotePost(id);
    return "redirect:/" + userid;
  }


  @GetMapping("/{userid}/add")
  public String renderAddNewPostPage(@PathVariable long userid, Model model) {
    User user = userService.findUserById(userid);
    model.addAttribute("user", user);
    return "addnewpost";
  }

  @PostMapping("/{userid}/add")
  public String submitANewPost(@ModelAttribute Post post, @PathVariable long userid, Model model) {
    User user = userService.findUserById(userid);
    model.addAttribute("user", user);
    postService.savePost(post);
    return "redirect:/{userid}";
  }

  @PostMapping("/{userid}/delete/{id}")
  public String deletePostCreatedByUser(Model model, @PathVariable long userid, @PathVariable long id) {
    User user = userService.findUserById(userid);
    Post post = postService.findPostById(id);
    postService.deletePost(post);
    model.addAttribute("user", user);
    return "redirect:/{userid}/myposts";
  }

  @GetMapping("/{userid}/edit/{id}")
  public String renderEditPostPage(@PathVariable long userid,
                                   @PathVariable long id,
                                   Model model) {
    User user = userService.findUserById(userid);
    model.addAttribute("user", user);
    Post editablePost = postService.findPostById(id);
    model.addAttribute("editablepost", editablePost);
    return "editpost";
  }

  @PostMapping("/{userid}/edit/{id}")
  public String editPostCreatedByUser(@PathVariable long userid, @PathVariable long id, @ModelAttribute Post post) {
    postService.editPost(post, id);
    return "redirect:/{userid}/myposts";
  }

  @GetMapping("/{userid}/myposts")
  public String renderMyPostsPage(@PathVariable long userid, Model model) {
    User userDetail = userService.findUserById(userid);
    model.addAttribute("user", userDetail);
    ArrayList<Post> filteredPosts = postService.listPostsByUser(userDetail);
    model.addAttribute("filteredposts", filteredPosts);
    return "myposts";
  }
}
