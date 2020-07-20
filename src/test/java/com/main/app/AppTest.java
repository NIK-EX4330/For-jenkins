package com.main.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.main.app.controller.GlobalController;

/**
 * Unit test for simple App.
 */

@ExtendWith(SpringExtension.class) // required for juint-5
@WebMvcTest(GlobalController.class)
public class AppTest { 

//	@Mock
//	private GlobalController globalcontroller;
	
	// Welcome to Jenkins-Sample-Project-1
	// Welcome abc Jenkins-Sample-Project-1
	// Jenkins-Sample-Project-1 -- Factorial of : 5 is 120
	
	@Autowired
	private MockMvc mvc;
	
	@Test // #1
	public void Test_greet_method() throws Exception {
	
		String url = "/";
		String expected = "Welcome to :- Jenkins-Sample-Project-1";
		RequestBuilder request = MockMvcRequestBuilders.get(url);
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals(expected, result.getResponse().getContentAsString());
	}
	
	@Test // #2
	public void Test_greetWithName_method() throws Exception {
	
		String url = "/abc";
		String expected = "Welcome abc Jenkins-Sample-Project-1";
		RequestBuilder request = MockMvcRequestBuilders.get(url);
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals(expected, result.getResponse().getContentAsString());
	}
	
	@Test // #3
	public void Test_findFactorial_method_by_passing_5() throws Exception {
	
		String url = "/fact/5";
		String expected = "Jenkins-Sample-Project-1 -- Factorial of : 5 is 120";
		RequestBuilder request = MockMvcRequestBuilders.get(url);
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals(expected, result.getResponse().getContentAsString());
	}
	
	@Test // #4
	public void Test_findFactorial_method_by_passing_0() throws Exception {
	
		String url = "/fact/0";
		String expected = "Jenkins-Sample-Project-1 -- Factorial of : 0 is 1";
		RequestBuilder request = MockMvcRequestBuilders.get(url);
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals(expected, result.getResponse().getContentAsString());
	}
	
	@Test // #5
	public void Test_findFactorial_method_by_passing_negative_number() throws Exception {
	
		String url = "/fact/-5";
		String expected = "Invalid Number. Only positive numbers are allowed.";
		RequestBuilder request = MockMvcRequestBuilders.get(url);
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals(expected, result.getResponse().getContentAsString());
	}
}
