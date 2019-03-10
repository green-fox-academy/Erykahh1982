package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloToAllTheWorldController {

  public AtomicLong websiteLoadCount = new AtomicLong(1);

  public String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  public String[] colors = {"darkstategrey", "lightcoral", "cornflowerblue", "aquamarine", "coral", "darkcyan", "darkgoldenrod", "darkorange", "darkseagreen", "gold", "khaki", "lavender", "peru"};


  public String concatHellos(String[] strarray) {     //with this method I display the String[] elements as a concatenated stand alone String aka newString
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < strarray.length; i++) {
      stringBuilder.append(strarray[i] + "  ");
    }
    String newString = stringBuilder.toString();
    return newString;
  }

  public int generateRandomIndexHello() {
    int randomIndex = (int) (Math.random() * hellos.length);
    return randomIndex;
  }

  public int generateRandomIndexColor() {
    int radomIndex = (int) (Math.random() * colors.length);
    return radomIndex;
  }

  public int generateRandomSize() {
    int randomFontSize = (int) (Math.random() * 50 + 12);
    return randomFontSize;
  }

  public String findRandomColor() {
    int size = colors.length;
    int randomIndex = (int) (Math.random() * size);
    return colors[randomIndex];
  }

  public String generateRandomStyle() {
    return "color:" + findRandomColor() + ";font-size: " + generateRandomSize() + "px";
  }

  public String generateHellosConcatenated(String[] hellos) {
    ArrayList<String> greetings = new ArrayList<>();
    String displayOnScreen = "";

    for (String hello : hellos) {
      greetings.add(hello);
      displayOnScreen = displayOnScreen + "<span style='" + generateRandomStyle() + "'>" + hello + " , </span>";
    }
    return displayOnScreen;
  }

  @RequestMapping("/web/severalGreetings")
  public String severalGreeting(Model model) {
    model.addAttribute("hellos", hellos[generateRandomIndexHello()]);
    model.addAttribute("color", colors[generateRandomIndexColor()]);
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

  @GetMapping("/web/newGreetings")
  public String greetTheWorld(Model model, @RequestParam String name) {

    model.addAttribute("counter", websiteLoadCount.incrementAndGet());
    model.addAttribute("hello", generateHellosConcatenated(hellos));
    model.addAttribute("name", name);

    return "multigreeting";
  }
}