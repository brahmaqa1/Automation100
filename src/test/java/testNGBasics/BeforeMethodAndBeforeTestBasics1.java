package testNGBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeMethodAndBeforeTestBasics1 {
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
	
	@BeforeMethod
	public void BeforeMethod1()
	{
		System.out.println("@BeforeMethod gets executed only once before executing test method ");
	}
	
	@AfterMethod
	public void AfterMethod1()
	{
		System.out.println("@AfterMethod gets executed only once after executing test method ");
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
		
		@BeforeMethod gets executed only once before executing test method 
		in Test-1 
		@AfterMethod gets executed only once after executing test method 
		
		@BeforeMethod gets executed only once before executing test method 
		in Test-2 
		@AfterMethod gets executed only once after executing test method 
		
		After Test gets executed only once after executing test method 
	*/
	
}
