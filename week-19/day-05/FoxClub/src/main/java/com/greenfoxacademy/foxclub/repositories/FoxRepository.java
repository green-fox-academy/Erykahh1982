package com.greenfoxacademy.foxclub.repositories;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.models.Trick;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class FoxRepository implements RepositoryInterface {

  private HashMap<String, Fox> foxes;

  public FoxRepository() {
    this.foxes = new HashMap<>();
  }

  @Override
  public HashMap<String, Fox> showAll() {
    return foxes;
  }

  @Override
  public void save(Fox fox) {
    foxes.put(fox.getName(), fox);
  }

  @Override
  public Fox findFoxByName(String name) {
    if (foxes.containsKey(name)) {
      return foxes.get(name);
    }
    return null;
  }

  @Override
  public void addNewAction(String name, String action) {
    foxes.get(name).getActions().add(action);
  }

  @Override
  public void addNewTrick(String name, Trick trick) {
    foxes.get(name).getTricks().add(trick);
  }

  public void setFoxes(HashMap<String, Fox> foxes) {
    this.foxes = foxes;
  }


}
