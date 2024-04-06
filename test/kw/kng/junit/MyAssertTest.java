package kw.kng.junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest 
{

	List<String> todos=Arrays.asList("AWS","Azure","DevOps");
	
	//Here we will test different methods present in assert.	
	@Test
	void testBoolean() 
	{
		boolean test= true;
		assertEquals(true, test);
		//assertTrue(test); //Only works for boolean values.
		//assertFalse(test);
		
	}
	
	@Test
	void testBoolean_ArrayList() 
	{
		boolean test= todos.contains("Azure");
		assertEquals(true, test);
	}
	
	@Test
	void testBoolean_ArrayListSize() 
	{
		assertEquals(3, todos.size());
	}
	@Test
	void testBoolean_ArrayEqaulsSize() 
	{
	assertArrayEquals(new int[] {1,2,3}, new int[] {1,2});
	}

}


/*


1. To run this file. Right click on this file ->`Run as ` -> `Junit test`

2. We use several `Test Conditions` or `Asserts`. These `Asserts` will check the behaviour of the programme. If any one of the `Asserts` fail. The `Junit` fail.


*/
