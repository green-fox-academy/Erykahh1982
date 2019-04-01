package com.greenfoxacademy.resttasks.models;

public class Dountil {

  private int result;

  public Dountil(String action, int until) {
    if (action.equalsIgnoreCase("sum")) {
      this.result = sumAll(until);
    }
    if (action.equalsIgnoreCase("factor")) {
      this.result = multipleAll(until);
    }
  }

  public int sumAll(int number) {
    int sum = 0;

    for (int i = 0; i <= number; i++) {
      sum += i;
    }
    return sum;
  }

  public int multipleAll(int number) {
    int factor = 1;

    for (int i = 1; i <= number; i++) {
      factor = factor * i;
    }
    return factor;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

}
