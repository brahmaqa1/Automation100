package testNGBasics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestBasics1 {

	@BeforeTest
	public void BeforeTest1()
	{
		System.out.println("Before Test gets executed only once before executing test method ");
	}
	
	@AfterTest
	public void AfterTest1()
	{
		System.out.println("After Test gets executed only once after executing test method ");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("in Test-1 ");
	}

	@Test
	public void Test2()
	{
		System.out.println("in Test-2 ");
	}
/*
	Before Test gets executed only once before executing test method 
	in Test-1 
	in Test-2 
	After Test gets executed only once after executing test method 
*/
	
}
