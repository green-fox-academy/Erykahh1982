package com.greenfoxacademy.programmersfoxclub.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TrickService {

  private ArrayList<String> tricks;
  private ArrayList<String> completedTricks;
  private boolean trickCompleted = false;

  public TrickService() {
    this.tricks = new ArrayList<>();
    this.completedTricks = new ArrayList<>();
    tricks.add("Java");
    tricks.add("HTML & CSS");
    tricks.add("SQL");
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
}
