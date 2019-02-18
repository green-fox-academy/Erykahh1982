package com.greenfoxacademy.programmersfoxclub.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TrickService {

  ArrayList<String> tricks;

  public TrickService() {
    this.tricks = new ArrayList<>();
  }
  public void addTrick(String trickName){
    tricks.add(trickName);
  }

  public ArrayList<String> listAllTricks(){
    return tricks;
  }

  public int countTricks(){
    return tricks.size();
  }

}
