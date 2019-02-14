package com.greenfoxacademy.dependencyexcercise.controllers;

import com.greenfoxacademy.dependencyexcercise.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UtilityController {

  private UtilityService utilityService;

  @Autowired
  public UtilityController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @RequestMapping(value = "/useful", method = RequestMethod.GET)
  public String renderUsefulPage() {
    return "utilities";
  }

  @RequestMapping(value = "/useful/colored", method = RequestMethod.GET)
  public String loadColoredWedSite(Model model) {

    String color = utilityService.randomColor();
    model.addAttribute("color", color);
    return "coloredwebsite";
  }

  @RequestMapping(value = "useful/email", method = RequestMethod.GET)
  public String showIfEmailIsCorrect(@RequestParam(name = "email") String email, Model model) {

    if (utilityService.validateEmail(email)) {
      model.addAttribute("emailTrue", email);
    } else {
      model.addAttribute("error", email);
    }
    return "emailvalidationform";
  }

  @RequestMapping(value = "useful/{number}/encode", method = RequestMethod.GET)
  public String encodeText(@RequestParam(name = "text") String text, @PathVariable(name = "number") Integer number, Model model) {

    model.addAttribute("textToEncode", text);
    model.addAttribute("encode", utilityService.caesar(text, number));

    return "encode";
  }

  @RequestMapping(value = "useful/{number}/decode", method = RequestMethod.GET)
  public String decodeText(@RequestParam(name = "text") String text, @PathVariable(name = "number") Integer number, Model model) {

    model.addAttribute("textToDecode", text);
    model.addAttribute("decode", utilityService.caesar(text, number));

    return "decode";
  }

}
