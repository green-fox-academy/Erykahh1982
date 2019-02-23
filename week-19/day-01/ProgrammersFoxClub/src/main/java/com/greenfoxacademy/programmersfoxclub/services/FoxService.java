package com.greenfoxacademy.programmersfoxclub.services;

import com.greenfoxacademy.programmersfoxclub.model.Fox;
import com.greenfoxacademy.programmersfoxclub.model.Trick;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
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

  public boolean checkIfFoxExists(String name) {
    Fox fox;
    if (listExistingFoxes().containsKey(name)) {
      return true;
    } else {
      return false;
    }
  }

  public HashMap<String, Fox> listExistingFoxes() {
    return foxes;
  }

  public void saveAFox(Fox foxToSave) {
    foxes.put(foxToSave.getName(), foxToSave);
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
    String currentFood = fox.getFood();
    String currentDrink = fox.getDrink();
    fox.setFood(food);
    fox.setDrink(drink);
    String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());

    String actionDrink = timestamp + " | Drink has been changed from: " + currentDrink + " to " + drink + ".";
    String actionFood = timestamp + " | Food has been changed from: " + currentFood + " to " + food + ".";
    fox.addAction(actionDrink);
    fox.addAction((actionFood));
  }

  public void educateTheFox(String name, String trick) {
    Fox fox = findFoxByName(name);

    ArrayList<String> tricksAlreadyKnown = fox.getCompletedTricks();
    if (!tricksAlreadyKnown.contains(trick)) {
      fox.addTrick(trick);
    }
    String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
    String actionTrick = timestamp + " | Trick: " + trick + " has been picked up.";
    fox.addAction(actionTrick);
  }

  public void teachTheFox(String name, Trick trick) {
    Fox fox = findFoxByName(name);

    ArrayList<Trick> tricksAlreadyCompleted = fox.getListOfCompletedTricks();
    if (!tricksAlreadyCompleted.contains(trick)) {
      fox.addNewTrickObject(trick);
    }
    String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
    String actionTrick = timestamp + " | Trick: " + trick.getName() + " has been picked up.";
    fox.addAction(actionTrick);
  }

  public void teachOptional(String name, String trickName) {
    Fox fox = findFoxByName(name);

    if (!fox.getListOfCompletedTricks().contains(new Trick(trickName))) {
      fox.addNewTrickObject(new Trick(trickName));
    }
    String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
    String actionTrick = timestamp + " | Trick: " + trickName + " has been picked up.";
    fox.addAction(actionTrick);
  }

  public ArrayList<String> list5LatestAction(String name) {
    Fox fox = findFoxByName(name);

    ArrayList<String> allActions = fox.getActionList();
    ArrayList<String> fiveLastAction = new ArrayList<>();
    int fullListSize = allActions.size();

    if (fullListSize >= 5) {
      for (int i = 5; i > 0; i--) {
        fiveLastAction.add(allActions.get(fullListSize - i));
      }
    } else {
      fiveLastAction = allActions;
    }
    return fiveLastAction;
  }

}