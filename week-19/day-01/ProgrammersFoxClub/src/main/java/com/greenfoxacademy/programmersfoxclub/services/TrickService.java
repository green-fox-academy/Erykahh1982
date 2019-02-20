package com.greenfoxacademy.programmersfoxclub.services;

import com.greenfoxacademy.programmersfoxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class TrickService {

  private ArrayList<String> tricks;
  private ArrayList<String> tricksToLearn;

  public TrickService() {
    this.tricks = new ArrayList<>();
    this.tricksToLearn = new ArrayList<>(Arrays.asList("Java", "HTML & CSS", "SQL"));
  }

  public void addTrick(String trickName) {
    tricks.add(trickName);
  }

  public ArrayList<String> listAllTricks() {
    return tricks;
  }

  public int countTricks() {
    return tricks.size();
  }

  public ArrayList<String> getTricks() {
    return tricks;
  }

  public void setTricks(ArrayList<String> tricks) {
    this.tricks = tricks;
  }

  public ArrayList<String> getTricksToLearn() {
    return tricksToLearn;
  }

  public void setTricksToLearn(ArrayList<String> tricksToLearn) {
    this.tricksToLearn = tricksToLearn;
  }

}
