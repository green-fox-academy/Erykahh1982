package com.greenfoxacademy.springstart;

import org.springframework.web.bind.annotation.RequestMapping;

public class Greeting {

  public long id;
  public String content;

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
