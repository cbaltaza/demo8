package com.example.demoj8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Demoj8Application {

	public static void main(String[] args) {
		SpringApplication.run(Demoj8Application.class, args);
	}
    @Bean
    public RestTemplate restTemplate() {

        return new RestTemplate();
    }
}
