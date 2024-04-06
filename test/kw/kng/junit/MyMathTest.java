package kw.kng.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import kw.kng.MyMath;

class MyMathTest {

	
	private MyMath math= new MyMath();
	
	
	@Test
	void calculateSum_ThreeMemberArray() 
	{
		//Absence of failure is success.
		
		//int[] numbers= {1,2,3};
		int result= math.calculateSum(new int[] {1,2,3});//The bracket code is created by Right Click ->Refactor->Inline
		System.out.println(result);
		int expectedResult=6;
		assertEquals(expectedResult, result);
		
	}

	
	@Test
	void calculateSum_ZeroMemberArray() 
	{
		//Absence of failure is success.
		int[] numbers= {};
		int result= math.calculateSum(numbers);
		System.out.println(result);
		int expectedResult=0;
		assertEquals(expectedResult, result);
		
	}
	
	
	
	
	
}

/*
 
 
 1. To run this file. Right click on this file ->`Run as ` -> `Junit test`
 
 2. We use several `Test Conditions` or `Asserts`. These `Asserts` will check the behaviour of the programme. If any one of the `Asserts` fail. The `Junit` fail.


 */
