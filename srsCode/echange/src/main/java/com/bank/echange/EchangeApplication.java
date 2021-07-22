package com.bank.echange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchangeApplication.class, args);
	}

}
