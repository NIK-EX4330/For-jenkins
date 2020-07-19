package com.main.app.service;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {

	public long calculateFactorial(int num) {
		
		long factorial = 1;
		
		for(int count = 1; count <=num; count++) {
			factorial = factorial*count;
		}
		
		return factorial;
	}
}
