package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class ShowBankAccountWebController {

  private BankAccount simba = new BankAccount("Simba", 2000, "lion");
  private ArrayList<BankAccount> listOfAccountsInTheJungle = new ArrayList<>();

  ShowBankAccountWebController() {
    listOfAccountsInTheJungle.add(new BankAccount("Zordon", 1500, "lion"));
    listOfAccountsInTheJungle.add(new BankAccount("Timon", 500, "meerkat"));
    listOfAccountsInTheJungle.add(new BankAccount("Zazu", 750, "hornbill"));
    listOfAccountsInTheJungle.add(new BankAccount("Pumba", 1800, "warthog"));
    listOfAccountsInTheJungle.add(new BankAccount("Rafiki", 200, "mandrill"));
  }

  @RequestMapping(value = "/web/show", method = RequestMethod.GET)
  public String show(Model model) {
    model.addAttribute("name", simba.getName());
    model.addAttribute("animalType", simba.getAnimalType());
    model.addAttribute("balance", simba.getBalance());
    return "show";
  }

  @GetMapping("/web/showaccounts")
  public String showaccounts(Model model) {
    model.addAttribute("allAccounts", listOfAccountsInTheJungle);
    return "showaccounts";
  }

}