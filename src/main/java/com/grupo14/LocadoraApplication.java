package com.grupo14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.grupo14"})
public class LocadoraApplication {
  public static void main(String[] args) {
    SpringApplication.run(LocadoraApplication.class, args);
  }
}
