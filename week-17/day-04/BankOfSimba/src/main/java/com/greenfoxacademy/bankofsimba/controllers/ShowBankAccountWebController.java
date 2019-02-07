package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShowBankAccountWebController {

  BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");

  @RequestMapping(value = "/web/show", method = RequestMethod.GET)
  public String show(Model model){

    model.addAttribute("name",bankAccount.getName());
    model.addAttribute("animalType",bankAccount.getAnimalType());
    model.addAttribute("balance", bankAccount.getBalance());

    return "show";
  }

}