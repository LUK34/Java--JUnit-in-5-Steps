package kw.kng;

public class MyMath 
{
	public int calculateSum(int[] numbers)
	{
		int sum=0;
		for(int n: numbers)
		{
			sum+=n;
		}
		return sum;
	}

}

/*
 
 1. All the source code will be 'src' folder and all the test code will be in 'test' folder. junit and src code has tobe placed in 2 seperate folder.
 
 2. To creat `test` folder. Right click on the project and select 'New' ->'Source folder'
 
 
 3. after doing step 2. Right click on `test` folder -> `New`->JUnit test case -> select the check box as ` New JUnit Jupiter test` _>Follow the similar convention to create 
 code files in src folder. 
 
 Package name: kw.kng.junit
 File name: MyMathTest
 
 After that click on save. A pop message will come saying `Add junit library to the build path`. Click on `Ok`.
 
 
 
 
 */
