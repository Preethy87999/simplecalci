package com.simplilearn.session2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LifeCycleTest {
	
	
       
	@Test
	 void testAdd() {
		System.out.println("Test Add Executed...");
		Calculator cal = new Calculator();
		int actResult = cal.add(10,-5);
		int expResult = 5;
		Assertions.assertEquals(expResult, actResult);
	}
	
	@Test
	 void testModulo() {
		System.out.println("Test Modulo Executed...");
		Calculator cal = new Calculator();
		int actResult = cal.modulo(10,3);
		int expResult = 1;
		Assertions.assertEquals(expResult, actResult);
	}
}
