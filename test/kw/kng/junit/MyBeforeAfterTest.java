package kw.kng.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {

	@BeforeAll //BeforeAll  and afterAll methods are class-level method so making it static is important.
	static void beforeAll()
	{
		System.out.println("Before All() method");
	}
	
	
	@BeforeEach
	void beforeEach()
	{
		System.out.println("Before Each() method");
	}
	
	@Test
	void test1() 
	{
		System.out.println("Test 1");
	}
	
	@Test
	void test2() 
	{
		System.out.println("Test 2");
	}
	
	@Test
	void test3() 
	{
		System.out.println("Test 3");
	}
	
	@AfterEach
	void afterEach()
	{
		System.out.println("After Each() method");
	}
	
	@AfterAll
	static  void afterAll()
	{
		System.out.println("After All() method");
	}

}


/*
 1. JUnit does not guarentee the order in which the methods are getting executed.
 */