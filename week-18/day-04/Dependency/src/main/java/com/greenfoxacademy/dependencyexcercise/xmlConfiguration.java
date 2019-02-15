package com.greenfoxacademy.dependencyexcercise;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath*:applicationContext.xml"})
public class xmlConfiguration {
}
