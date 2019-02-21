package com.greenfoxacademy.programmersfoxclub.model;

public class Trick {

  private String name;
  private String imageurl;

  public Trick(String name, String imageurl) {
    this.name = name;
    this.imageurl = imageurl;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImageurl() {
    return imageurl;
  }

  public void setImageurl(String imageurl) {
    this.imageurl = imageurl;
  }
}
