package com.greenfoxacademy.resttasks.controllers;


import com.greenfoxacademy.resttasks.models.*;
import com.greenfoxacademy.resttasks.models.Error;
import com.greenfoxacademy.resttasks.services.LogService;
import com.greenfoxacademy.resttasks.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AnotherController {

  private RestService restService;
  private LogService logService;

  @Autowired
  public AnotherController(RestService restService, LogService logService) {
    this.restService = restService;
    this.logService = logService;
  }

  @RequestMapping("/doubling")
  public Object renderDoubling(@RequestParam(required = false) Integer input) {

    logService.saveLog(new Log("/doubling", "input=" + input));

    if (input == null) {
      return new Error("Please provide an input!");
    } else {
      return new Doubling(input);
    }
  }

  @GetMapping("/greeter")
  public Object renderGreeter(@RequestParam(required = false, value = "name") String name,
                              @RequestParam(required = false, value = "title") String title) {

    logService.saveLog(new Log("/greeter", "name=" + name + " & title=" + title));

    if ((name == null) && (title == null)) {
      return new Error("Please provide a name and a title!");
    } else if (name == null) {
      return new Error("Please provide a name!");
    } else if (title == null) {
      return new Error("Please provide a title!");
    } else {
      return new Greeter(name, title);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object renderAppenda(@PathVariable String appendable) {

    logService.saveLog(new Log("/appenda/{appendable}", "appendable=" + appendable));

    if (appendable == null) {
      return "redirect:/error";
    } else {
      return new AppendA(appendable);
    }
  }

  @GetMapping("/error")
  public String renderError() {
    return "404";
  }


  @PostMapping("/dountil/{action}")
  public ResponseEntity<Object> dountil(@PathVariable(name = "action") String action,
                                        @RequestBody(required = false) Until until) {
    if (until == null) {
      logService.saveLog(new Log("/dountil/{action}", "ERROR, no JSON has arrived"));
    } else {
      logService.saveLog(new Log("/dountil/{action}", action + " & " + until.toString()));
    }

    if (until == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error("Please provide a number!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(restService.getResult(action, until));
    }
  }

  @PostMapping("/arrays")
  public ResponseEntity<Object> arrayHandler(@RequestBody(required = false) ArrayHandler arrayHandler) {

    if (arrayHandler == null) {
      logService.saveLog(new Log("/arrays", "ERROR, no JSON object have been posted"));
    } else {
      logService.saveLog(new Log("/arrays", arrayHandler.toString()));
    }

    if ((arrayHandler != null)) {
      if (arrayHandler.getWhat() != null) {
        if (arrayHandler.getNumbers() != null) {
        }
        if (arrayHandler.getWhat().equalsIgnoreCase("sum")) {
          return ResponseEntity.status(HttpStatus.OK).body(restService.createResultObject(arrayHandler.getWhat(), arrayHandler.getNumbers()));
        }
        if (arrayHandler.getWhat().equalsIgnoreCase("multiply")) {
          return ResponseEntity.status(HttpStatus.OK).body(restService.createResultObject(arrayHandler.getWhat(), arrayHandler.getNumbers()));
        }
        if (arrayHandler.getWhat().equalsIgnoreCase("double")) {
          return ResponseEntity.status(HttpStatus.OK).body(restService.createResultObject2(arrayHandler.getWhat(), arrayHandler.getNumbers()));
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error("Please provide what to do with the numbers!"));
      }
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error("Please provide a WHAT field to do with the numbers!"));
    }
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error("Please provide NUMBERS to do something with them!"));
  }
}




