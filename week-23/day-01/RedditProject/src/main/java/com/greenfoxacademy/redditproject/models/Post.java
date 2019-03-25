package com.greenfoxacademy.redditproject.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private String url;
  private long nrOfVotes;
  private LocalDateTime creationDate;

  @ManyToOne
  @JoinColumn(name = "userId")
  private User user;

  public Post() {
    this.creationDate = LocalDateTime.now();
  }

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
    this.nrOfVotes = 1;
    this.creationDate = LocalDateTime.now();
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

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public long getNrOfVotes() {
    return nrOfVotes;
  }

  public void setNrOfVotes(long nrOfVotes) {
    this.nrOfVotes = nrOfVotes;
  }

  public LocalDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
