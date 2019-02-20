package com.greenfoxacademy.programmersfoxclub.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class TrickService {

  private ArrayList<String> tricks;
  private ArrayList<String> completedTricks;
  private ArrayList<String> tricksToLearn;
  private boolean trickCompleted = false;

  public TrickService() {
    this.tricks = new ArrayList<>();
    this.tricksToLearn = new ArrayList<>(Arrays.asList("Java", "HTML & CSS", "SQL"));
    this.completedTricks = new ArrayList<>();
  }

  public void addTrick(String trickName) {
    tricks.add(trickName);
  }

  public ArrayList<String> listAllTricks() {
    return tricks;
  }

  public void addTrickToCompletedTricksList(String trickName) {
    if (trickCompleted == true) {
      completedTricks.add(trickName);
    }
  }
   public ArrayList<String> showAlreadyCompletedList(){
    return completedTricks;
   }

  public void completeATrick(String trickName) {
    setTrickCompleted(true);
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

  public ArrayList<String> getCompletedTricks() {
    return completedTricks;
  }

  public void setCompletedTricks(ArrayList<String> completedTricks) {
    this.completedTricks = completedTricks;
  }

  public boolean isTrickCompleted() {
    return trickCompleted;
  }

  public void setTrickCompleted(boolean trickCompleted) {
    this.trickCompleted = trickCompleted;
  }

  public ArrayList<String> getTricksToLearn() {
    return tricksToLearn;
  }

  public void setTricksToLearn(ArrayList<String> tricksToLearn) {
    this.tricksToLearn = tricksToLearn;
  }

}
