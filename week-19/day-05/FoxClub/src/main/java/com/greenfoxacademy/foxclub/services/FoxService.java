package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.models.Trick;
import com.greenfoxacademy.foxclub.repositories.FoxRepository;
import com.greenfoxacademy.foxclub.repositories.TrickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

@Service
public class FoxService {

  private
  private TrickRepository trickRepository;


  @Autowired
  public FoxService(FoxRepository foxRepository, TrickRepository trickRepository) {
    this.foxRepository = foxRepository;
    this.trickRepository = trickRepository;
  }

  public boolean checkIfFoxAlreadyExists(String name) {
    if (foxRepository.showAll().containsKey(name)) {
      return true;
    } else {
      return false;
    }
  }

  public void createANewFox(String name, String imageurl) {
    if (!foxRepository.showAll().containsKey(name)) {
      Fox foxToCreate = new Fox(name, imageurl);
      foxRepository.save(foxToCreate);
    }
  }

  public Fox findAFoxByName(String name) {
    return foxRepository.findFoxByName(name);
  }

  public void feedTheFox(String name, String drink, String food) {
    Fox fox = findAFoxByName(name);
    String actualDrink = fox.getDrink();
    String actualFood = fox.getFood();
    String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());

    fox.setDrink(drink);
    fox.setFood(food);

    String actionDrink = timestamp + " | Drink has been changed from: " + actualDrink + " to " + drink + ".";
    String actionFood = timestamp + " | Food has been changed from: " + actualFood + " to " + food + ".";
    foxRepository.addNewAction(name, actionDrink);
    foxRepository.addNewAction(name, actionFood);
  }

  public void educateTheFox(String name, Trick trick) {
    Fox fox = findAFoxByName(name);

    ArrayList<Trick> tricksAlreadyCompleted = fox.getTricks();
    if (!tricksAlreadyCompleted.contains(trick)) {
      foxRepository.
    }

    String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
    String actionTrick = timestamp + " | Trick: " + trick.getName() + " has been picked up.";
    foxRepository.addNewAction(name, actionTrick);
  }

  public void educateTheFoxForOptional(String name, String trickName) {
    Fox fox = findAFoxByName(name);

    if (!fox.getTricks().contains(new Trick(trickName))) {
      foxRepository.addNewTrick(trickName);
    }

    String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
    String actionTrick = timestamp + " | Trick: " + trickName + " has been picked up.";
    foxRepository.addNewAction(name, actionTrick);
  }

}
