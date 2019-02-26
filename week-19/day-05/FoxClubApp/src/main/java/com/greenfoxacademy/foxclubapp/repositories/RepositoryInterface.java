package com.greenfoxacademy.foxclubapp.repositories;

import com.greenfoxacademy.foxclubapp.models.Fox;

import java.util.HashMap;

public interface RepositoryInterface {

  HashMap<String, Fox> displayAll();

  void save(Fox fox);

  Fox findFoxByName(String name);

}
