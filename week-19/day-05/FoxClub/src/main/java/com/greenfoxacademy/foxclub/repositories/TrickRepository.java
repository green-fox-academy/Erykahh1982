package com.greenfoxacademy.foxclub.repositories;

import com.greenfoxacademy.foxclub.models.Trick;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class TrickRepository {

  public ArrayList<Trick> tricks;

  public TrickRepository() {
    this.tricks = new ArrayList<>();
    tricks.add(new Trick("Java", "/images/java.png"));
    tricks.add(new Trick("HTML & CSS", "/images/html&css.jpg"));
    tricks.add(new Trick("SQL", "/images/sql.png"));
    tricks.add(new Trick("Javascript", "/images/javascript.png"));
    tricks.add(new Trick("Angular", "/images/angular.png"));
  }

  public ArrayList<Trick> showAllTricks() {
    return tricks;
  }

  public void setTricks(ArrayList<Trick> tricks) {
    this.tricks = tricks;
  }

}
