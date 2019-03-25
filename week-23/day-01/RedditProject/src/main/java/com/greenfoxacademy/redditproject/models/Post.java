package com.greenfoxacademy.redditproject.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private String url;
  private long nrOfVotes;
  @Temporal(value = TemporalType.DATE)
  private Date creationDate;

  @ManyToOne
  @JoinColumn(name = "userId")
  private User user;

}
