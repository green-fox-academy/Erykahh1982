package com.greenfoxacademy.gfacanteen.controllers;

import com.greenfoxacademy.gfacanteen.models.Takeout;
import com.greenfoxacademy.gfacanteen.services.TakeoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  private TakeoutService takeoutService;

  @Autowired
  public MainController(TakeoutService takeoutService) {
    this.takeoutService = takeoutService;
  }

  @GetMapping("/")
  public String renderWelcomePage(Model model) {
    model.addAttribute("toppings", takeoutService.listOfToppings());
    return "main";
  }

  @PostMapping("/order")
  public String registerAnOrder(@ModelAttribute Takeout takeout) {

    if (takeout != null) {
      takeoutService.saveAnOrder(takeout);
      return "redirect:/order/" + takeout.getId();
    } else {
      return "main";
    }
  }

  @GetMapping("/order/{id}")
  public String renderOrderConfirmationPage(@PathVariable long id,
                                            Model model) {

    if (takeoutService.isThisOrderIdExists(id)) {
      Takeout takeoutById = takeoutService.findTakeoutById(id);
      model.addAttribute("takeout", takeoutById);
      return "orderconfirmation";
    } else {
      return "myerror";
    }
  }

}