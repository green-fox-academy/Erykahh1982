package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowBankAccountController {

  @RequestMapping(value = "/show")
  public BankAccount show(){
    BankAccount bankAccount = new BankAccount("Simba", 2000,"lion");
    return bankAccount;
  }
}
