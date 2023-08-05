package com.simplilearn.Session5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LifeCycleTest {
	static Calculator calc;

	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All Executed...");
		calc = new Calculator();
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After All Executed...");
	}
	
	@BeforeEach
	public  void beforeEach() {
		System.out.println("Before Each Executed...");
		//calc = new Calculator();
	}
	
	@AfterEach
	public  void afterEach() {
		System.out.println("After Each Executed...");
	}
	
	@Test
	void testAdd() {
		Calculator calc = new Calculator();
		int actResult = calc.add(10,-5);
		int expResult = 5;
		Assertions.assertEquals(expResult, actResult);
	}
	
	@Test
	void testModulo() {
		Calculator calc = new Calculator();
		int actResult = calc.modulo(10,3);
		int expResult = 1;
		Assertions.assertEquals(expResult, actResult);
	}
}
