package com.greenfoxacademy.foxclubapp.services;

import com.greenfoxacademy.foxclubapp.models.Fox;
import com.greenfoxacademy.foxclubapp.models.Trick;
import com.greenfoxacademy.foxclubapp.repositories.TrickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TrickService {

  private TrickRepository trickRepository;

  @Autowired
  public TrickService(TrickRepository trickRepository) {
    this.trickRepository = trickRepository;
  }

  public ArrayList<Trick> displayTricks() {
    return trickRepository.getTricks();
  }


  public ArrayList<Trick> displayRemainingTricks(Fox fox) {
    ArrayList<Trick> alreadyCompletedTricksByFox = fox.getKnownTricks();
    ArrayList<Trick> allAvailableTricks = displayTricks();
    ArrayList<Trick> remainingTricksToLearn = new ArrayList<>();

    for (Trick trick : allAvailableTricks) {
      if (!alreadyCompletedTricksByFox.contains(trick)) {
        remainingTricksToLearn.add(trick);
      }
    }
    return remainingTricksToLearn;
  }

  public boolean isAllCopleted(Fox fox) {
    if (displayRemainingTricks(fox).isEmpty()) {
      return true;
    } else {
      return false;
    }
  }

  public String showErrorMessage(Fox fox) {
    if (isAllCopleted(fox) == true) {
    }
    return "Congratulations! You have completed all the mandatory tricks! Go and add a NEW trick, it is up to you what!";
  }

  public boolean checkTrickName(String trickName) {

    for (Trick trick : trickRepository.getTricks()) {
      if (trick.getName().equalsIgnoreCase(trickName)) ;
      return true;
    }
    return false;
  }

  public Trick findTrickByName(String name) {
    Trick selectedTrick = null;

    for (Trick trick : trickRepository.getTricks()) {
      if (trick.getName().equalsIgnoreCase(name)) {
        selectedTrick = trick;
      }
    }
    return selectedTrick;
  }
}
