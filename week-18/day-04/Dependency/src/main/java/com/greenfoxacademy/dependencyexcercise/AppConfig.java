package com.greenfoxacademy.dependencyexcercise;

import com.greenfoxacademy.dependencyexcercise.services.GreenColor;
import com.greenfoxacademy.dependencyexcercise.services.RedColor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
  private boolean isTesting = false;

//  @Bean
//  public RedColor initColor(){
//    if(isTesting){
//      return new GreenColor();
//    }else{
//      return new RedColor();
//    }
}

