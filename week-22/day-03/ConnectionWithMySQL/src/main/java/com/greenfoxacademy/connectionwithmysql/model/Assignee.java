package com.greenfoxacademy.connectionwithmysql.model;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.List;

@Entity
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String email;
  private String creationDate;

//  @OneToMany(cascade = CascadeType.PERSIST)
//  @JoinColumn(name = "assigneeId")
//  private List<Todo>todos;

  public Assignee() {
    this.creationDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
  }

  public Assignee(String name, String email) {
    this.creationDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

//  public List<Todo> getTodos() {
//    return todos;
//  }
//
//  public void setTodos(List<Todo> todos) {
//    this.todos = todos;
//  }
}
