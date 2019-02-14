package com.greenfoxacademy.dependencyexcercise.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {

  private MyColor myColor;

  public Printer(MyColor myColor) {
    this.myColor = myColor;
  }

  @Autowired
  public void displayColor(){
    myColor.printColor();
  }

  public void log(String message) {
    System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
  }

}
