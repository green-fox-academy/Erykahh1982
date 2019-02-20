package com.greenfoxacademy.programmersfoxclub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class TrickService {

  private ArrayList<String> tricks;
  private ArrayList<String> tricksToLearn;
  private FoxService foxService;

  @Autowired
  public TrickService(FoxService foxService) {
    this.tricks = new ArrayList<>();
    this.tricksToLearn = new ArrayList<>(Arrays.asList("Java", "HTML & CSS", "SQL"));
    this.foxService = foxService;
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

  public ArrayList<String> createRemainigList(String name) {

    ArrayList<String> alredyKnownTricksByFox = foxService.findFoxByName(name).getCompletedTricks();
    ArrayList<String> remainingTricksToLearn = new ArrayList<>();
    for (String element : tricksToLearn) {
      if (!alredyKnownTricksByFox.contains(element)) {
        remainingTricksToLearn.add(element);
      }
    }
    return remainingTricksToLearn;
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
