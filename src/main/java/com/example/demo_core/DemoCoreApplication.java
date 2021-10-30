package com.example.demo_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCoreApplication.class, args);
	}

}