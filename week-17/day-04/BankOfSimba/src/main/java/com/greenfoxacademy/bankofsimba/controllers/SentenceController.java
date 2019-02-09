package com.greenfoxacademy.bankofsimba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SentenceController {

  @RequestMapping(value = "/web/displaysentence", method = RequestMethod.GET)
  public String displaysentence() {
    return "displaysentence";
  }

  @RequestMapping(value = "/web/display", method = RequestMethod.GET)
  public String display(Model model) {
    String sentenceToDisplay = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("sentence", sentenceToDisplay);
    return "display";
  }

}
