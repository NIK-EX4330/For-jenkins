package com.main.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.main.app.controller", "com.main.app.service"}) // required for junit testing
public class App 
{
    public static void main( String[] args ){
    	
    	/**
    	 * This is actually a maven project manually converted into a spring-boot project
    	 * manually created resources folder in src/main to configure application
    	 * Specially Look dependency management in pom.
    	 * I have attached actuator to monitor additional things.
    	 * This is a simple application which can be used to calculate factorial of a number.
    	 *  
    	 *  This have 5 junit test case written in junit-5 with code coverage of 97.7%
    	 *  Through this app I wanted to create a jenkins pipeline which do below things :-
    	 *  1. compile application
    	 *  2. execute all test cases
    	 *  3. if all test case passes then find the code coverage of application
    	 *  4. if code coverage is 95% or above then build the application.
    	 */
    	
    	SpringApplication.run(App.class, args);
    }
}
