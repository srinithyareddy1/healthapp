package com.example.healthapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = "com.example.healthapp")
public class HealthappApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthappApplication.class, args);
	}

}
