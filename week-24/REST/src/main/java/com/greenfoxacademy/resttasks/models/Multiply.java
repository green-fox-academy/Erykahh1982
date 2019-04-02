package com.greenfoxacademy.resttasks.models;

public class Multiply {

  private int result;

  public Multiply(int[] numbers) {
    this.result = multiply(numbers);
  }

  public int multiply(int[] numbers) {
    int multiplyResult = 0;
    for (int i = 1; i <= numbers.length; i++) {
      multiplyResult = multiplyResult * numbers[i];
    }
    return multiplyResult;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

}
