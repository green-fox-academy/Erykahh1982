package com.greenfoxacademy.libraryapp.controllers;

import com.greenfoxacademy.libraryapp.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BookController {

  private ArrayList<Book> listOfBooks = new ArrayList<>();

  public BookController() {
    listOfBooks.add(new Book("Michelle Obama", "Így lettem", 2018));
    listOfBooks.add(new Book("Michelle Obama", "Így lettem Második Kiadás", 2018));
    listOfBooks.add(new Book("Kepes András", "Istenek és Emberek", 2018));
    listOfBooks.add(new Book("Jane Austin", "Büszkeség és balítélet", 1813));
    listOfBooks.add(new Book("Bram Stoker", "Drakula", 1897));
    listOfBooks.add(new Book("Ernest Miller Hemingway", "Az öreg halász és a tenger", 1952));
  }

  @RequestMapping(value = "/books", method = RequestMethod.GET)
  public String listBooks(Model model, @RequestParam(name = "author", required = false) String author) {
    if (author != null) {
      // Simple foreach.

//      ArrayList<Book> filteredBooks = new ArrayList<>();
//      for (Book book : listOfBooks) {
//        if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
//          filteredBooks.add(book);
//        }
//      }
      List<Book> filteredBooks = listOfBooks.stream()
          .filter(book -> book.getAuthor().toLowerCase().contains(author.toLowerCase()))
          .collect(Collectors.toList());

      model.addAttribute("books", filteredBooks);
    } else {
      model.addAttribute("books", listOfBooks);
    }
    return "displaybooks";
  }
  ///books és /books2 ugyan azt eredményezi @RequestMapping-el és @GetMapping-el is

  @GetMapping("/books2")
  public String listBooks2(Model model) {
    model.addAttribute("books", listOfBooks);
    return "displaybooks2";
  }

  @RequestMapping(value = "/books/details", method = RequestMethod.GET)
  public String showBookByIdRequestParam(@RequestParam(name = "id") Integer id, Model model) {
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

  @RequestMapping(value = "books/{id}/details", method = RequestMethod.GET)
  public String showBookByIdPathVariable(@PathVariable(name = "id") Integer id, Model model) {
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
  public String addBook(Model model, Book book) {
    model.addAttribute("book", book);
    return "addbook";
  }

  @RequestMapping(value = "books/add", method = RequestMethod.POST)
  public String addBookToList(Model model, Book book) {
    listOfBooks.add(book);
    model.addAttribute("book", book);
    return "redirect:/books";
  }

  @RequestMapping(value = "/books/{id}/edit", method = RequestMethod.GET)
  public String editBook(@PathVariable(name = "id") Integer id, Model model) {
    Book foundBook = listOfBooks.stream().filter(book -> book.getId() == id).collect(Collectors.toList()).get(0);
    model.addAttribute("book", foundBook);
    return "addbook";
  }

  @RequestMapping(value = "/books/{id}/edit", method = RequestMethod.POST)
  public String updateBook(@ModelAttribute Book bookComingFromTheForm) {
    Book foundBookAlreadyInList = listOfBooks.stream().filter(book -> book.getId() == bookComingFromTheForm.getId())
        .collect(Collectors.toList()).get(0);
    foundBookAlreadyInList.setAuthor(bookComingFromTheForm.getAuthor());
    foundBookAlreadyInList.setTitle(bookComingFromTheForm.getTitle());
    foundBookAlreadyInList.setReleaseYear(bookComingFromTheForm.getReleaseYear());
    return "redirect:/books";
  }

}