package com.greenfoxacademy.resttasks.services;

import org.springframework.stereotype.Service;

@Service
public class RestService {

  public Integer doubleInput(Integer input) {
    Integer result = input * 2;
    return result;
  }

}
