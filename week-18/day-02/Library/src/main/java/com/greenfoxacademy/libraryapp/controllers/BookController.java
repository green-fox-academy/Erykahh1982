package com.greenfoxacademy.libraryapp.controllers;

import com.greenfoxacademy.libraryapp.Book;
import org.springframework.stereotype.Controller;

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

}
