package com.greenfoxacademy.foxclubapp.repositories;

import com.greenfoxacademy.foxclubapp.models.Fox;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class FoxRepository implements RepositoryInterface {

  private HashMap<String, Fox> foxes;

  public FoxRepository() {
    this.foxes = new HashMap<>();
  }

  @Override
  public HashMap<String, Fox> displayAll() {
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
}
