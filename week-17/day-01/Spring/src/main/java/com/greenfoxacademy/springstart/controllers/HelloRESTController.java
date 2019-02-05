package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  private AtomicLong idCount = new AtomicLong(0);  //REST Greet counter app | with this I can count the the api calls

  @RequestMapping(value = "/greetingWorld")
  //Hello World REST App if we write "/greetingWorld" in the URL than it will return {id:1,content:"Hello, World}
  public Greeting greetingWorld() {
    Greeting greeting = new Greeting(idCount.incrementAndGet(), "Hello, World");
    return greeting;
  }

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam String name) {   //Hello User REST App if write http://localhost:8080/greeting?name=Erika"  in the URL than it will return {"id":1,"content":"Hello, Erika"}
    Greeting greeting = new Greeting(idCount.incrementAndGet(), "Hello, " + name);
    return greeting;
  }

}
