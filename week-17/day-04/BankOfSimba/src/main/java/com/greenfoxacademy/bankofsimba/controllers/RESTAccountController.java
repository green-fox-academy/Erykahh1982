package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RESTAccountController {

  private ArrayList<BankAccount> listOfAccountsInTheJungle = new ArrayList<>();

  public RESTAccountController() {
    listOfAccountsInTheJungle.add(new BankAccount("Simba", 2000, "lion",true));
    listOfAccountsInTheJungle.add(new BankAccount("Zordon", 1500, "lion", false));
    listOfAccountsInTheJungle.add(new BankAccount("Timon", 500, "meerkat", false));
    listOfAccountsInTheJungle.add(new BankAccount("Zazu", 750, "hornbill",false));
    listOfAccountsInTheJungle.add(new BankAccount("Pumba", 1800, "warthog",false));
    listOfAccountsInTheJungle.add(new BankAccount("Rafiki", 200, "mandrill",false));
  }

  @RequestMapping(value = "/show")
  public BankAccount show() {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", false);
    return bankAccount;
  }

  @RequestMapping(value = "/account")
  public BankAccount showOneAccount(@RequestParam String name) {
    BankAccount selected = new BankAccount();
    for (int i = 0; i < listOfAccountsInTheJungle.size(); i++) {
      if (listOfAccountsInTheJungle.get(i).getName().equalsIgnoreCase(name)) {
        selected = listOfAccountsInTheJungle.get(i);
      }
    }
    return selected;
  }

}