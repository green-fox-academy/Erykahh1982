package com.greenfoxacademy.libraryapp.controllers;

import com.greenfoxacademy.libraryapp.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class BookController {

  private ArrayList<Book> listOfBooks = new ArrayList<>();

  public BookController() {
    listOfBooks.add(new Book("Michelle Obama", "Így lettem", 2018));
    listOfBooks.add(new Book("Kepes András", "Istenek és Emberek", 2018));
    listOfBooks.add(new Book("Jane Austin", "Büszkeség és balítélet", 1813));
    listOfBooks.add(new Book("Bram Stoker", "Drakula", 1897));
    listOfBooks.add(new Book("Ernest Miller Hemingway", "Az öreg halász és a tenger", 1952));
  }

  @RequestMapping(value = "/books", method = RequestMethod.GET)
  public String listBooks(Model model) {
    model.addAttribute("books", listOfBooks);
    return "displaybooks";
  }
  ///books és /books2 ugyan azt eredményezi @RequestMapping-el és @GetMapping-el is

  @GetMapping("/books2")
  public String listBooks2(Model model) {
    model.addAttribute("books", listOfBooks);
    return "displaybooks2";
  }

  @RequestMapping(value = "/books/{id}/details", method = RequestMethod.GET)
  public String showBookById(@RequestParam(name = "id") Integer id, Model model) {
    Book bookById = null;

    for (Book book : listOfBooks) {
      if (book.getId() == id) {
        bookById = book;
      }
    }

    if (bookById != null) {
      model.addAttribute("book", bookById);
    } else {
      model.addAttribute("error", "No book found with such ID");
    }
    return "showdetails";
  }

  @RequestMapping(value = "books/add", method = RequestMethod.GET)
  public String addBook(@ModelAttribute(name = "book") Book book, Model model) {
    model.addAttribute("book", book);
    return "addbook";
  }

  @RequestMapping(value = "books/add", method = RequestMethod.POST)
  public String addBookToList(Model model, Book book){
    listOfBooks.add(book);
    model.addAttribute("book", book);
    return "redirect:/books";
  }
}
