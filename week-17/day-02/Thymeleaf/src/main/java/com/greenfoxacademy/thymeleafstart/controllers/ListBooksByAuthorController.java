package com.greenfoxacademy.thymeleafstart.controllers;

import com.greenfoxacademy.thymeleafstart.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ListBooksByAuthorController {

  private List<Book> books = new ArrayList<>();

  @RequestMapping(path = "/books2", method = RequestMethod.GET)
  public String queryBooks(Model model, @RequestParam(name = "author", required = false) String author) {

    List<Book> queriedBooks;

    if (author != null) {
      queriedBooks = filterBooksByAuthor(author);
    } else {
      queriedBooks = books;
    }

    model.addAttribute("books", queriedBooks);
    return "index";
  }

  private List<Book> filterBooksByAuthor(String author) {
    return books.stream()
        .filter(book -> book.getAuthor().equals(author))
        .collect(Collectors.toList());
  }

}