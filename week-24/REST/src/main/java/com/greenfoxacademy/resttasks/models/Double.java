package com.greenfoxacademy.resttasks.models;

public class Double {

  private int[] result;

  public Double(int[] numbers) {
    this.result = doubling(numbers);
  }

  public int[] doubling(int[] numbers) {
    int[] doubleArray = null;

    for (int i = 0; i < numbers.length; i++) {
      doubleArray[i] = doubleArray[i * 2];
    }
    return doubleArray;
  }

  public int[] getResult() {
    return result;
  }

  public void setResult(int[] result) {
    this.result = result;
  }

}
