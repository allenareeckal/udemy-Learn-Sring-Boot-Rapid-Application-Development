package com.rapid.application.development.practice.apiImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiImpl {

	@RequestMapping("/")
	public String health() {
		return "I am Healthy !!";
	}
}
