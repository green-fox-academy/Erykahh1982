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

}
