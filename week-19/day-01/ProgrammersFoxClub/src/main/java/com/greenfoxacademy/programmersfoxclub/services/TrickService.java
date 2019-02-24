package com.greenfoxacademy.programmersfoxclub.services;

import com.greenfoxacademy.programmersfoxclub.model.Trick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class TrickService {

  private FoxService foxService;
  private ArrayList<Trick> listOfTricks;

  @Autowired
  public TrickService(FoxService foxService) {
    this.foxService = foxService;
    this.listOfTricks = new ArrayList<>();
    listOfTricks.add(new Trick("Java", "/java.jpg"));
    listOfTricks.add(new Trick("HTML & CSS", "/html&css.jpg"));
    listOfTricks.add(new Trick("SQL", "/sql.png"));
    listOfTricks.add(new Trick("Javascript", "/javascript.png"));
    listOfTricks.add(new Trick("Angular", "/angular.png"));
  }

  public boolean checkTrickName(String name) {

    for (Trick trick : listOfTricks) {
      if (trick.getName().equalsIgnoreCase(name)) {
        return true;
      }
    }
    return false;
  }

  public void addNewTrick(Trick trick) {
    listOfTricks.add(trick);
  }

  public int trickCount() {
    return listOfTricks.size();
  }

  public ArrayList<Trick> showRemainingList(String name) {

    ArrayList<Trick> alreadyCompletedTricks = foxService.findFoxByName(name).getListOfCompletedTricks();
    ArrayList<Trick> remainingTricks = new ArrayList<>();
    for (Trick trick : listOfTricks) {
      if (!alreadyCompletedTricks.contains(trick)) {
        remainingTricks.add(trick);
      }
    }
    return remainingTricks;
  }

  public boolean allCompleted(String name) {
    if (showRemainingList(name).isEmpty()) {
      return true;
    } else {
      return false;
    }
  }

  public String showErrorMessage(String name) {
    if (allCompleted(name) == true) {
    }
    return "Congratulations! You have completed all the mandatory tricks! Go and add a NEW trick, it is up to you what!";
  }

  public Trick findTrickByName(String name) {
    Trick selectedTrick = null;

    for (Trick trick : listOfTricks) {
      if (trick.getName().equalsIgnoreCase(name)) {
        selectedTrick = trick;
      }
    }
    return selectedTrick;
  }

  public ArrayList<Trick> getListOfTricks() {
    return listOfTricks;
  }

  public void setListOfTricks(ArrayList<Trick> listOfTricks) {
    this.listOfTricks = listOfTricks;
  }
}
