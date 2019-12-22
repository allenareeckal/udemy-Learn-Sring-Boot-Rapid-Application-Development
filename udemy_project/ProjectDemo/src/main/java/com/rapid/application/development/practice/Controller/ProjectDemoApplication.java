package com.rapid.application.development.practice.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjectDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectDemoApplication.class, args);
	}

	@RequestMapping("/")
	public String health() {
		return "I am Healthy !!";
	}
	@RequestMapping("/exclude")
	public String swear() {
		return "Poda Pulle !!";
	}
}
