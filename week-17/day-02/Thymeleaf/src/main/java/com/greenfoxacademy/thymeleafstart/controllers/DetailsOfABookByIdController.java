package com.greenfoxacademy.thymeleafstart.controllers;

import com.greenfoxacademy.thymeleafstart.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DetailsOfABookByIdController {

  private List<Book> books = new ArrayList<>();

  @RequestMapping(path = "/books/{id}/details", method = RequestMethod.GET)
  public String getBookById(Model model, @PathVariable(name = "id") Integer id) {
    Book bookById = null;
    for (Book book : books) {
      if (book.getId() == id) {
        bookById = book;
      }
    }

    if (bookById != null) {
      model.addAttribute("book", bookById);
    } else {
      model.addAttribute("error", "No book found");
    }
    return "details";
  }

}