package com.backend.sprng;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class SprngApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprngApplication.class, args);
	}
}
