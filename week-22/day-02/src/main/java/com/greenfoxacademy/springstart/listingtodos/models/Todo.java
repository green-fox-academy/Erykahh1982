package com.greenfoxacademy.springstart.listingtodos.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Todo {

  private long id;
  private String title;
  private boolean urgent = false;
  private boolean done = false;

  public Todo(){
  }
}
