package com.greenfoxacademy.foxclubapp.repositories;

import com.greenfoxacademy.foxclubapp.models.Image;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ImageRepository {

  private ArrayList<Image> images;

  public ImageRepository() {
    this.images = new ArrayList<>();
    images.add(new Image("Fox Art", "images/foxart.png"));
    images.add(new Image("B&W", "images/foxblack.png"));
    images.add(new Image("Color Fox", "images/colorfox.png"));
    images.add(new Image("Green Fox", "images/greenfox.png"));
    images.add(new Image("FireFox", "images/firefox.png"));
    images.add(new Image("White Fox", "images/foxwhite.png"));
    images.add(new Image("Black Fox", "images/blackfox.png"));
    images.add(new Image("Indian Fox", "images/foxindian.png"));
  }

  public void saveNewImage(String name, String url) {
    images.add(new Image(name, url));
  }

  public ArrayList<Image> getImages() {
    return images;
  }

  public void setImages(ArrayList<Image> images) {
    this.images = images;
  }
}
