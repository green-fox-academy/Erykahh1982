package com.greenfoxacademy.foxclub.repositories;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.models.Trick;

import java.util.HashMap;

public interface RepositoryInterface {

  public HashMap<String, Fox> showAll();

  public void save(Fox fox);

  public Fox findFoxByName(String name);

  public void addNewAction(String name, String action);

  public void addNewTrick(String name, Trick trick);
}
