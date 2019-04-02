package com.greenfoxacademy.resttasks.services;

import com.greenfoxacademy.resttasks.models.*;
import org.springframework.stereotype.Service;

@Service
public class RestService {

  public RestService() {
  }

  public DountilResult getResult(String action, Until until) {
    DountilResult calculatedResult = null;

    if (action.equalsIgnoreCase("sum")) {
      calculatedResult = new DountilResult(sumAll(until.getUntil()));
    } else if (action.equalsIgnoreCase("factor")) {
      calculatedResult = new DountilResult(multipleAll(until.getUntil()));
    }
    return calculatedResult;
  }

  public ArrayHandlerIntResult createResultObject(String action, int[] numbers) {
    ArrayHandlerIntResult createdObject = null;

    if (action.equalsIgnoreCase("sum")) {
      createdObject = new ArrayHandlerIntResult(sumArrayElements(numbers));
    } else if (action.equalsIgnoreCase("multiply")) {
      createdObject = new ArrayHandlerIntResult(multipleArrayElements(numbers));
    }
    return createdObject;
  }

  public ArrayHandlerArrayResult createResultObject2(String action, int[] numbers) {
    ArrayHandlerArrayResult createdObject = null;

    if (action.equalsIgnoreCase("double")) {
      createdObject = new ArrayHandlerArrayResult(doubling(numbers));
    }
    return createdObject;
  }


  public int sumAll(int number) {
    int sum = 0;

    for (int i = 0; i <= number; i++) {
      sum += i;
    }
    return sum;
  }

  public int sumArrayElements(int[] numbers) {
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      sum = sum + numbers[i];
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

  public int multipleArrayElements(int[] numbers) {
    int factor = 1;

    for (int i = 0; i < numbers.length; i++) {
      factor = factor * numbers[i];
    }
    return factor;
  }

  public int[] doubling(int[] numbers) {
    int[] doubleArray = new int[numbers.length];

    for (int i = 0; i < numbers.length; i++) {
      doubleArray[i] = numbers[i] * 2;
    }
    return doubleArray;
  }

}
