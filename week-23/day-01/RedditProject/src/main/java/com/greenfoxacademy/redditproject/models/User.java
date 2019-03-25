package com.greenfoxacademy.redditproject.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;

  @OneToMany
  @JoinColumn(name = "userId")
  private List<Post> posts;

  public User() {
  }

  public User(String name) {
    this.name = name;
  }
}
