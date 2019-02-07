package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloToAllTheWorldController {

  public AtomicLong websiteLoadCount = new AtomicLong(1);

  public String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  public String[] colors = {"red", "green", "blue", "yellow", "grey", "orange", "violet", "green", "black", "magenta", "purple", "brown"};


  public String concatHellos(String[] strarray) {     //with this method I display the String[] elements as a concatenated stand alone String aka newString
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < strarray.length; i++) {
      stringBuilder.append(strarray[i] + "  ");
    }
    String newString = stringBuilder.toString();
    return newString;
  }

  public int generateRandomIndex() {
    int randomIndex = (int) (Math.random() * hellos.length);
    return randomIndex;
  }

  public Color generateRandomRgb() {
    Random random = new Random();
    float r = random.nextFloat();
    float g = random.nextFloat();
    float b = random.nextFloat();
    Color randomColor = new Color(random.nextFloat(), random.nextFloat(), random.nextFloat());
    return randomColor;
  }

  public int generateRandomSize() {
    int randomFontSize = (int) (Math.random() * 10 + 35);
    return randomFontSize;
  }

  public int generateRandomColor() {
    int randomColor = (int)((Math.random() * colors.length));
    return randomColor;
  }


  @RequestMapping("/web/severalGreetings")
  public String severalGreeting(Model model) {
    model.addAttribute("hellos", hellos[generateRandomIndex()]);
    model.addAttribute("color", colors[generateRandomColor()]);
    model.addAttribute("fontSize", generateRandomSize());
    model.addAttribute("name", "Erika");
    model.addAttribute("counter", websiteLoadCount.incrementAndGet());
    return "severalGreetings";
  }


  @RequestMapping("/web/greetings")  // http://localhost:8080/web/greetings will print String[]hellos on the page
  public String greeting(Model model) {
    model.addAttribute("concat", concatHellos(hellos));
    return "severalGreetings";
  }

  @RequestMapping("/web/greetingsMultilanguage")
  public String greetMultilanguage(Model model) {
    model.addAttribute("username", "Erika");
    model.addAttribute("counter", websiteLoadCount.incrementAndGet());
    return "severalGreetings";
  }
}