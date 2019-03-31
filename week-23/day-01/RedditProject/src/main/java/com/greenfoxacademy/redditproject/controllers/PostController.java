package com.greenfoxacademy.redditproject.controllers;

import com.greenfoxacademy.redditproject.models.Post;
import com.greenfoxacademy.redditproject.models.User;
import com.greenfoxacademy.redditproject.services.PostService;
import com.greenfoxacademy.redditproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class PostController {

  private PostService postService;
  private UserService userService;
  private ArrayList possiblePageNumber;

  @Autowired
  public PostController(PostService postService, UserService userService) {
    this.postService = postService;
    this.userService = userService;
  }

  @GetMapping("/")
  public String renderMainPage(Model model,
                               @RequestParam(required = false) Integer pagenumber) {

    if (pagenumber == null) {
      pagenumber = 1;
    }
    model.addAttribute("possiblepagenumber", postService.createArrayListForPossiblePageNumbers());
    model.addAttribute("posts", postService.listPostsForPagination(pagenumber));
    return "mainpage";
  }

  @GetMapping("/nouser")
  public String renderMainPageError(Model model,
                                    @RequestParam(required = false) Integer pagenumber) {

    if(pagenumber == null){
      pagenumber = 1;
    }
    model.addAttribute("possiblepagenumber", postService.createArrayListForPossiblePageNumbers());
    model.addAttribute("posts", postService.listPostsForPagination(pagenumber));
    return "mainpageerror";
  }

  @GetMapping("/{userid}")
  public String renderMainPageLoggedIn(Model model,
                                       @PathVariable long userid,
                                       @RequestParam(required = false) Integer pagenumber) {

    if (pagenumber == null) {
      pagenumber = 1;
    }
    model.addAttribute("user", userService.findUserById(userid));
    model.addAttribute("posts", postService.listPostsForPagination(pagenumber));
    model.addAttribute("possiblepagenumber", postService.createArrayListForPossiblePageNumbers());
    return "mainpagelogin";
  }

  @GetMapping("/{userid}/upvote/{id}")
  public String upvotePost(@PathVariable long id,
                           @PathVariable long userid) {

    postService.upvotePost(id);
    return "redirect:/" + userid;
  }

  @GetMapping("/{userid}/downvote/{id}")
  public String downvotePost(@PathVariable long id,
                             @PathVariable long userid) {

    postService.downvotePost(id);
    return "redirect:/" + userid;
  }


  @GetMapping("/{userid}/add")
  public String renderAddNewPostPage(@PathVariable long userid,
                                     Model model) {

    User user = userService.findUserById(userid);
    model.addAttribute("user", user);
    return "addnewpost";
  }

  @PostMapping("/{userid}/add")
  public String submitANewPost(@ModelAttribute Post post,
                               @PathVariable long userid) {
    postService.savePost(post);
    return "redirect:/{userid}";
  }

  @PostMapping("/{userid}/delete/{id}")
  public String deletePostCreatedByUser(Model model,
                                        @PathVariable long userid,
                                        @PathVariable long id) {

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
  public String editPostCreatedByUser(@PathVariable long userid,
                                      @PathVariable long id,
                                      @ModelAttribute Post post) {

    postService.editPost(post, id);
    return "redirect:/{userid}/myposts";
  }

  @GetMapping("/{userid}/myposts")
  public String renderMyPostsPage(@PathVariable long userid,
                                  Model model) {

    User userDetail = userService.findUserById(userid);
    model.addAttribute("user", userDetail);
    ArrayList<Post> filteredPosts = postService.listPostsByUser(userDetail);
    model.addAttribute("filteredposts", filteredPosts);
    return "myposts";
  }
}
