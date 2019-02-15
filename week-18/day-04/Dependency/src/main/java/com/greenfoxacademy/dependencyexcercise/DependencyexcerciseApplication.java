package com.greenfoxacademy.dependencyexcercise;

import com.greenfoxacademy.dependencyexcercise.services.MyColor;
import com.greenfoxacademy.dependencyexcercise.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;

@SpringBootApplication
public class DependencyexcerciseApplication implements CommandLineRunner {

  private Printer printer;

//  @Autowired
//  @Qualifier("color")
  MyColor myColor;

  @Autowired
  DependencyexcerciseApplication(Printer printer) {
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(DependencyexcerciseApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello Erika");
    printer.displayColor();
  }


}

