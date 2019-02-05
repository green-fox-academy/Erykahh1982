package com.greenfoxacademy.thymeleafstart.controllers;

import com.greenfoxacademy.thymeleafstart.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AddANewBookController {

  private List<Book> books = new ArrayList<>();

  @RequestMapping(path = "/books/add", method = RequestMethod.GET)
  public String addBookForm(Model model, @ModelAttribute(name = "book") Book book) {
    model.addAttribute("book", book);
    return "create";
  }

  @RequestMapping(path = "/books/add", method = RequestMethod.POST)
  public String addBook(@ModelAttribute(name = "book") Book book) {
    books.add(book);
    return "redirect:/books";
  }

}
