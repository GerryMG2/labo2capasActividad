package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = ("com.uca.capas.controller"))
public class ActividadLabo2Application {
	
	public static void main(String[] args) {
		SpringApplication.run(ActividadLabo2Application.class, args);
	}

}
