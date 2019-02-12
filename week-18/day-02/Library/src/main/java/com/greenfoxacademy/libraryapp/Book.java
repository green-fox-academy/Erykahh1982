package com.greenfoxacademy.libraryapp;

import java.util.concurrent.atomic.AtomicInteger;

public class Book {

  private static final AtomicInteger count = new AtomicInteger(0);
  private int id;
  private String title;
  private String author;
  private int releaseYear;

  public Book() {
    this.id = count.incrementAndGet();
  }

  public Book(String author, String title, int releaseYear) {
    this.id = count.incrementAndGet();
    this.title = title;
    this.author = author;
    this.releaseYear = releaseYear;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }
}
