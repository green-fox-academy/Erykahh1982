package com.greenfoxacademy.resttasks.models;

import java.util.Arrays;

public class ArrayHandler {

  private int[] numbers;
  private String what;

  public ArrayHandler(){}

  public ArrayHandler(int[] numbers, String what) {
    this.numbers = numbers;
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  @Override
  public String toString() {
    return "ArrayHandler{" +
        "numbers=" + Arrays.toString(numbers) +
        ", what='" + what + '\'' +
        '}';
  }
}
