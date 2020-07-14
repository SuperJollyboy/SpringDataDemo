package com.gl.springDataDemo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.gl.springDataDemo.service.Calculator;

public class TestCalculator {

	Calculator calculator; 
	
	@BeforeAll
	public static void firstme()
	{
		System.out.println("I love Ishaan");
	}
	
	@BeforeEach
	void init()
	{
		calculator = new Calculator();
		System.out.println("Initiliaze");
	}
	
	
	@Test
	@DisplayName("Testing the Addcalc method of calculator")
	public void testAddCalc() {
		assertAll(
				()-> assertEquals(0,calculator.addCalc(2, 0),"The correct answer is 0"),
				()-> assertEquals(6,calculator.addCalc(2, 3),"The correct sum is 5")
				);
	}

	@Test
	@DisplayName("Testing the Print Name method of calculator")
	//@Disabled "To be used in TDD when your code is not ready"
	public void testPrintName() {
		assertEquals("Amit", calculator.PrintName("Amit"),"The Name must be Amit");
		
	}
	
	@AfterEach
	void cleanup()
	{
		System.out.println("Cleaning up");
	}
	
	
}
