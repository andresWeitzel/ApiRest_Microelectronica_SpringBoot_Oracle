package com.api.rest.microelectronica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class ApiRestMicroelectronicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestMicroelectronicaApplication.class, args);
	}

}
