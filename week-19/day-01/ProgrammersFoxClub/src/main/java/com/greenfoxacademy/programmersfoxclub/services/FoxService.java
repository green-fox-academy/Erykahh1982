package com.greenfoxacademy.programmersfoxclub.services;

import com.greenfoxacademy.programmersfoxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FoxService {

  private HashMap<String, Fox> foxes;

  public FoxService() {
    this.foxes = new HashMap<>();
  }

  public void addNewFox(Fox fox) {
    foxes.put(fox.getName(),fox);
  }

  public Fox findFoxByName(String name) {
    Fox selectedFox = null;

    if (foxes.containsKey(name)) {
      selectedFox = foxes.get(name);
    }
    return selectedFox;
  }

  public Fox loginAFox (String name){
    Fox fox = findFoxByName(name);

    if(fox==null) {
      fox = new Fox(name);
      addNewFox(fox);
    }
    return fox;
  }
}
