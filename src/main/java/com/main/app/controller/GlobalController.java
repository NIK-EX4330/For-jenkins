package com.main.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.main.app.service.FactorialService;

@RestController
public class GlobalController {
	
	@Autowired
	private FactorialService factorialService;
	
	@Value("${spring.application.name}")
	private String appName;

	@GetMapping("/")
	public String greet() {
		return "Welcome to :- " + appName;
	}
	
	@GetMapping("/{name}")
	public String greetWithName(@PathVariable("name") String userName) {
		return "Welcome " + userName + " " + appName;
	}
	
	@GetMapping("/fact/{number}")
	public String findFactorial(@PathVariable("number") String factNum) {
		
		String result = "";
		
		StringBuilder sb = new StringBuilder();
		
		int number = Integer.parseInt(factNum);
		if(number < 0)
			result = sb.append("Invalid Number. Only positive numbers are allowed.").toString();
		else if( 0 <= number && number < 2)
			result = sb.append(appName).append(" -- Factorial of : ").append(number).append(" is 1").toString();
		else if(number > 2)
			result = sb.append(appName).append(" -- Factorial of : ").append(number).append(" is ").append(factorialService.calculateFactorial(number)).toString();
		
		return result;
	}
}
