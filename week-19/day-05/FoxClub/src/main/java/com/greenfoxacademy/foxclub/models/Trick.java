package com.greenfoxacademy.foxclub.models;

public class Trick {

  private String name;
  private String imageurl;

  public Trick(String name, String imageurl) {
    this.name = name;
    this.imageurl = imageurl;
  }

  public Trick(String name) {
    this.name = name;
    this.imageurl = "/certificate.png";
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
