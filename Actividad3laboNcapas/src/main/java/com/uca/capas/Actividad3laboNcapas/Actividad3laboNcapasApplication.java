package com.uca.capas.Actividad3laboNcapas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages=("com.uca.capas.controller"))
@ComponentScan(basePackages=("com.uca.capas..domain"))
public class Actividad3laboNcapasApplication {

	public static void main(String[] args) {
		SpringApplication.run(Actividad3laboNcapasApplication.class, args);
	}

}
