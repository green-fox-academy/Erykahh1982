package com.greenfoxacademy.foxclubapp.repositories;

import com.greenfoxacademy.foxclubapp.models.Trick;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class TrickRepository {

  private ArrayList<Trick> tricks;

  public TrickRepository() {
    this.tricks = new ArrayList<>();
    tricks.add(new Trick("Java", "images/java.jpg"));
    tricks.add(new Trick("HTML & CSS", "images/html&css.jpg"));
    tricks.add(new Trick("SQL", "images/sql.png"));
    tricks.add(new Trick("Javascript", "images/javascript.png"));
    tricks.add(new Trick("Angular", "images/angular.png"));
  }

  public void addTrick(Trick trick) {
    tricks.add(trick);
  }

  public ArrayList<Trick> getTricks() {
    return tricks;
  }

  public void setTricks(ArrayList<Trick> tricks) {
    this.tricks = tricks;
  }
}
