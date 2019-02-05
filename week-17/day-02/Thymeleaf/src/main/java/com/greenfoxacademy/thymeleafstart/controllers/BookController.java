package com.greenfoxacademy.thymeleafstart.controllers;

import com.greenfoxacademy.thymeleafstart.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

  private List<Book> books = new ArrayList<>();

  public BookController() {
    books.add(new Book("Cat's Cradle", "Kurt Vonnegut", 1963));
    books.add(new Book("Do Androids Dream of Electric Sheep?", "Philip K. Dick", 1968));
  }

  @RequestMapping(path = "/books", method = RequestMethod.GET)    //showBooks() with RequestMapping annotation
  public String showBooks(Model model) {
    model.addAttribute("books", books);
    return "index";
  }

  @GetMapping("/books")                                           //showBooks() with GetMapping annotation
  public String showBooks2(Model model) {
    model.addAttribute("books", books);
    return "index";
  }

}
