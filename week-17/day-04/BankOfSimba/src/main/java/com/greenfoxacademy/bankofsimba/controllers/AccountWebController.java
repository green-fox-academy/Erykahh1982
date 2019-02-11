package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class AccountWebController {

  private BankAccount simba = new BankAccount("Simba", 2000, "lion", true, false);
  private ArrayList<BankAccount> listOfAccountsInTheJungle = new ArrayList<>();

  AccountWebController() {
    listOfAccountsInTheJungle.add(simba);
    listOfAccountsInTheJungle.add(new BankAccount("Zordon", 1500, "lion", false, true));
    listOfAccountsInTheJungle.add(new BankAccount("Timon", 500, "meerkat", false, false));
    listOfAccountsInTheJungle.add(new BankAccount("Zazu", 750, "hornbill", false, false));
    listOfAccountsInTheJungle.add(new BankAccount("Pumba", 1800, "warthog", false, false));
    listOfAccountsInTheJungle.add(new BankAccount("Rafiki", 200, "mandrill", false, false));
    listOfAccountsInTheJungle.add(new BankAccount("Shenzi", 350, "hyena", false, true));
    listOfAccountsInTheJungle.add(new BankAccount("Ed", 450, "hyena", false, true));
  }

  @RequestMapping(value = "/web/show", method = RequestMethod.GET)
  public String show(Model model) {
    model.addAttribute("name", simba.getName());
    model.addAttribute("animalType", simba.getAnimalType());
    model.addAttribute("balance", simba.getBalance());
    model.addAttribute("isKing", simba.isKingOfJungle());
    return "show";
  }

  @GetMapping("/web/showaccounts")
  public String showaccounts(Model model) {
    model.addAttribute("allAccounts", listOfAccountsInTheJungle);
    return "showaccounts";
  }

  @GetMapping("/web/showtable")
  public String showtable(Model model) {
    model.addAttribute("allAccounts", listOfAccountsInTheJungle);
    return "accountstable";
  }

  @GetMapping("web/showtablebadguy")
  public String showtableGadguy(Model model) {
    model.addAttribute("allAccounts", listOfAccountsInTheJungle);
    return "accountstablebadguy";
  }

  @RequestMapping(value = "/web/add", method = RequestMethod.GET)
  public String renderFormPage() {
    return "addbankaccount";
  }

  @RequestMapping(value = "web/add", method = RequestMethod.POST)
  public String addBankAccount(BankAccount bankAccount) {
    listOfAccountsInTheJungle.add(bankAccount);
    return "redirect:/web/showtablebadguy";
  }

  @RequestMapping(value = "web/donateanimal", method = RequestMethod.GET)
  public String renderDonateFormPage(Model model) {
    model.addAttribute("allAccounts", listOfAccountsInTheJungle);
    return "donateanimal";
  }

  @RequestMapping(value = "web/donateanimal", method = RequestMethod.POST)
  public String donateAnimal(@ModelAttribute(value = "animalName") String name) {

    for (BankAccount account : listOfAccountsInTheJungle)
      if (account.getName().equalsIgnoreCase(name)) {
        if (account.isKingOfJungle()) {
          account.setBalance((account.getBalance() + 100));
        } else {
          account.setBalance((account.getBalance() + 10));
        }
      }
    return "redirect:/web/showtablebadguy";
  }

  @RequestMapping(value = "web/showfinal",method = RequestMethod.GET)
  public String showfinal(Model model){
    model.addAttribute("allAccount", listOfAccountsInTheJungle);
    return "showfinal";
  }

}