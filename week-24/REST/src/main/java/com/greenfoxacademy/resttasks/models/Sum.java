package com.greenfoxacademy.resttasks.models;

public class Sum {

  private int result;

  public Sum(int[] numbers) {
    this.result = sum(numbers);
  }

  public int sum(int[] numbers) {
    int sumResult = 0;

    for (int i = 0; i < numbers.length; i++) {
      sumResult = sumResult + numbers[i];
    }
    return sumResult;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

}
