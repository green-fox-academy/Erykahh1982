package com.greenfoxacademy.libraryapp.controllers;

import com.greenfoxacademy.libraryapp.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class BookController {

  private ArrayList<Book>listOfBooks = new ArrayList<>();

  public BookController(){
    listOfBooks.add(new Book("Michelle Obama", "Így lettem", 2018));
    listOfBooks.add(new Book("Kepes András", "Istenek és Emberek", 2018));
    listOfBooks.add(new Book("Jane Austin", "Büszkeség és balítélet",1813 ));
    listOfBooks.add(new Book("Bram Stoker", "Drakula",1897 ));
    listOfBooks.add(new Book("Ernest Miller Hemingway", "Az öreg halász és a tenger",1952));
  }

  @RequestMapping(value = "/books", method = RequestMethod.GET)
  public String listBooks(Model model){
    model.addAttribute("books", listOfBooks);
    return "displaybooks";
  }
  ///books és /books2 ugyan azt eredményezi @RequestMapping-el és @GetMapping-el is

  @GetMapping("/books2")
  public String listBooks2(Model model){
    model.addAttribute("books", listOfBooks);
    return "displaybooks2";
  }

  public ArrayList<Book> getListOfBooks() {
    return listOfBooks;
  }

  public void setListOfBooks(ArrayList<Book> listOfBooks) {
    this.listOfBooks = listOfBooks;
  }
}
