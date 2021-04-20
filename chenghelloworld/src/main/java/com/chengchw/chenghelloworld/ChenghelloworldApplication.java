package com.chengchw.chenghelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController

public class ChenghelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChenghelloworldApplication.class, args);
	}
	
	@RequestMapping("")
	
	public String hello() { // 3
        return "Hello Client";
	}
	
	@RequestMapping("/random")
	
	public String random() { // 3
        return "Spring Boot is hard but will be great";
	}
}
