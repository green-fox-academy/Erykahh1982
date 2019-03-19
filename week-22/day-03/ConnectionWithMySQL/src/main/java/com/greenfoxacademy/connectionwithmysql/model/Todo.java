package com.greenfoxacademy.connectionwithmysql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private boolean urgent = false;
  private boolean done = false;
  private String creationDate;

  public Todo(){
    this.creationDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
  }

  public Todo(String title){
    this.title= title;
    this.creationDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }
}
