package com.sanjay.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClientApplication.class, args);
	}

	
	@RequestMapping(value = "/eureka")
	public String home() {
	return "Eureka Client application";
	}
}
