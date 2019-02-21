package com.greenfoxacademy.programmersfoxclub.services;

import com.greenfoxacademy.programmersfoxclub.model.Fox;
import com.greenfoxacademy.programmersfoxclub.model.Trick;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class FoxService {

  private HashMap<String, Fox> foxes;

  public FoxService() {
    this.foxes = new HashMap<>();
  }

  public void addNewFox(Fox fox) {
    foxes.put(fox.getName(), fox);
  }

  public Fox findFoxByName(String name) {
    Fox selectedFox = null;

    if (foxes.containsKey(name)) {
      selectedFox = foxes.get(name);
    }
    return selectedFox;
  }

  public Fox loginAFox(String name) {
    Fox fox = findFoxByName(name);

    if (fox == null) {
      fox = new Fox(name);
      addNewFox(fox);
    }
    return fox;
  }

  public void feedTheFox(String name, String food, String drink) {
    Fox fox = findFoxByName(name);
    fox.setFood(food);
    fox.setDrink(drink);
  }

  public void educateTheFox(String name, String trick) {
    Fox fox = findFoxByName(name);

    ArrayList<String> tricksAlreadyKnown = fox.getCompletedTricks();
    if (!tricksAlreadyKnown.contains(trick)) {
      fox.addTrick(trick);
    }
  }

  public void teachTheFox(String name, Trick trick) {
    Fox fox = findFoxByName(name);

    ArrayList<Trick> tricksAlreadyCompleted = fox.getListOfCompletedTricks();
    if (!tricksAlreadyCompleted.contains(trick)) {
      fox.addNewTrickObject(trick);
    }
  }

  public void teachOptional (String name, String trickName){
    Fox fox = findFoxByName(name);

    if(!fox.getListOfCompletedTricks().contains(new Trick(trickName))){
      fox.addNewTrickObject(new Trick(trickName));
    }

  }

}