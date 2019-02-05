package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloToAllTheWorldController {

  public String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  public String concatHellos(String[] strarray) {     //with this method I display the String[] elements as a concatenated stand alone String aka newString
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < strarray.length; i++) {
      stringBuilder.append(strarray[i] + "  ");
    }
    String newString = stringBuilder.toString();
    return newString;
  }

  @RequestMapping("/web/greetings")  // http://localhost:8080/web/greetings will print String[]hellos on the page
  public String greeting(Model model) {
    model.addAttribute("concat", concatHellos(hellos));
    return "severalGreetings";
  }

}