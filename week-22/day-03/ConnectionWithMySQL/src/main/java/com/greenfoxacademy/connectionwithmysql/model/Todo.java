package com.greenfoxacademy.connectionwithmysql.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private boolean urgent = false;
  private boolean done = false;
  private LocalDateTime creationTime;
  private LocalDateTime updateTime;
  private Long days;
  private LocalDateTime dueDate;

  @ManyToOne
  @JoinColumn(name = "assigneeId")
  private Assignee assignee;

  public Todo() {
    this.creationTime = LocalDateTime.now();
  }

  public Todo(String title) {
    this.title = title;
    this.creationTime = LocalDateTime.now();
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

  public LocalDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(LocalDateTime creationTime) {
    this.creationTime = creationTime;
  }

  public LocalDateTime getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }

  public LocalDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }

  public Long getDays() {
    return days;
  }

  public void setDays(Long days) {
    this.days = days;
  }
}
