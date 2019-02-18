package com.greenfoxacademy.programmersfoxclub;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Fox {

  private String name;
  private ArrayList<String>tricks;
  private ArrayList<String>foods;
  private ArrayList<String>drinks;

  public Fox() {}

  public Fox(String name) {
    this.name = name;
  }

  public void addTrick(String trickName){
    tricks.add(trickName);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
