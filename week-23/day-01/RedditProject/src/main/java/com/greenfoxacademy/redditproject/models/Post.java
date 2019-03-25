package com.greenfoxacademy.redditproject.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String url;
  private Long nrOfVotes;
  @Temporal(value = TemporalType.DATE)
  private Date creationDate;

  @ManyToOne
  @JoinColumn(name = "userId")
  private User user;

  public Post() {
  }

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
    this.nrOfVotes = null;
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

  public Long getNrOfVotes() {
    return nrOfVotes;
  }

  public void setNrOfVotes(Long nrOfVotes) {
    this.nrOfVotes = nrOfVotes;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
