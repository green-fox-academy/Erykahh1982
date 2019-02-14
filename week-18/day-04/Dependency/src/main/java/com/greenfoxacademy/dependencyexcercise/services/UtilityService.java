package com.greenfoxacademy.dependencyexcercise.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {

  private ArrayList<String> colors;
  private Random random;
  private String email;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public boolean validateEmail(String email) {
    if (email.contains("@") && email.contains(".")) {
      return true;
    }
    return false;
  }

  public ArrayList<String> getColors() {
    return colors;
  }

  public void setColors(ArrayList<String> colors) {
    this.colors = colors;
  }

  public Random getRandom() {
    return random;
  }

  public void setRandom(Random random) {
    this.random = random;
  }
}