package com.cg.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@TestInstance(Lifecycle.PER_CLASS)
class MathOperationTest2 {
	
	// Before All
	// Before Each
	// After Each
	// After All
	
	MathOperation op;

	@BeforeAll
	public  void beforeAllTest() {
		System.out.println("Unit Testing Started");
	}
	
	@AfterAll
	public  void afterAllTest() {
		System.out.println("Unit Testing is Completed");
	}
	
	@BeforeEach
	public void initEachTest() {
		op=new MathOperation();
		System.out.println("Test Started..");
	}
	
	@AfterEach
	public void afterEachTest() {
		op=null;
		System.out.println("Test Completed..");
	}
	
	@Test
	void testAdd() {
		
		assertEquals(15, op.add(10, 5));
		
	}

	@Test

	void testSubtract() {
		assertEquals(5, op.subtract(10, 5));
	}

	@Test
	@DisabledOnOs(value = OS.WINDOWS)
	void testDivide() {
		assertEquals(2, op.divide(10, 5));
	}
	
	@Test
	@EnabledOnJre(value = JRE.JAVA_15)
	void testDivideForException() {
		assertThrows(ArithmeticException.class, ()-> op.divide(5, 0));
	}

}
