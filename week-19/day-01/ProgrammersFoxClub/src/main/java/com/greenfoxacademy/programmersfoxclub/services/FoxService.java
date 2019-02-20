package com.greenfoxacademy.programmersfoxclub.services;

import com.greenfoxacademy.programmersfoxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FoxService {

  private HashMap<String, Fox> foxes;
  private TrickService trickService;

  public FoxService() {
    this.foxes = new HashMap<>();
    this.trickService = trickService;
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

    trickService.setTrickCompleted(true);
    trickService.addTrickToCompletedTricksList(trick);
    fox.setTricks(trickService.getCompletedTricks());
  }
}
