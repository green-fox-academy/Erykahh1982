package com.greenfoxacademy.foxclubapp.services;

import com.greenfoxacademy.foxclubapp.models.Fox;
import com.greenfoxacademy.foxclubapp.models.Trick;
import com.greenfoxacademy.foxclubapp.repositories.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

@Service
public class FoxService {

  private FoxRepository foxRepository;

  @Autowired
  public FoxService(FoxRepository foxRepository) {
    this.foxRepository = foxRepository;
  }

  public Fox registerANewFox(String name, String imageurl) {
    Fox fox;
    if (foxRepository.displayAll().containsKey(name)) {
      fox = foxRepository.findFoxByName(name);
    } else {
      fox = new Fox(name, imageurl);
      foxRepository.save(fox);
    }
    return fox;
  }

  public Fox searchFoxByName(String name) {
    return foxRepository.findFoxByName(name);
  }

  public boolean checkIfFoxIsRegistered(String name) {
    return foxRepository.displayAll().containsKey(name);
  }

  public Fox loginAFox(String name) {
    Fox fox = foxRepository.findFoxByName(name);
    if (fox == null) {
      fox = new Fox(name);
      foxRepository.save(fox);
    }
    return fox;
  }

  public void feedTheFox(String name, String food, String drink) {
    Fox fox = foxRepository.findFoxByName(name);
    String currentFood = fox.getFood();
    String currentDrink = fox.getDrink();
    fox.setFood(food);
    fox.setDrink(drink);
    String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());

    String actionDrink = timestamp + " | Drink has been changed from: " + currentDrink + " to " + drink + ".";
    String actionFood = timestamp + " | Food has been changed from: " + currentFood + " to " + food + ".";
    fox.getActionHistory().add(actionDrink);
    fox.getActionHistory().add(actionFood);
  }

  public void educateFoxMandatory(String name, Trick trick) {
    Fox fox = foxRepository.findFoxByName(name);

    ArrayList<Trick> tricksAlreadyCompleted = fox.getKnownTricks();
    if (!tricksAlreadyCompleted.contains(trick)) {
      tricksAlreadyCompleted.add(trick);
    }

    String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
    String actionTrick = timestamp + " | Trick: " + trick.getName() + " has been picked up.";
    fox.getActionHistory().add(actionTrick);
  }

  public void educateFoxOptional(String name, String trickName) {
    Fox fox = foxRepository.findFoxByName(name);
    ArrayList<Trick> tricks = fox.getKnownTricks();

    if (!tricks.contains(new Trick(trickName))) {
      tricks.add(new Trick(trickName));
    }
    String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
    String actionTrick = timestamp + " | Trick: " + trickName + " has been picked up.";
    fox.getActionHistory().add(actionTrick);
  }

  public ArrayList<String> list5LatestAction(String name) {
    Fox fox = foxRepository.findFoxByName(name);

    ArrayList<String> allActions = fox.getActionHistory();
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
