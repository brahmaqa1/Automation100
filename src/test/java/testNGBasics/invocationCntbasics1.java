package testNGBasics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class invocationCntbasics1 {

	@Test(invocationCount=3)
	public void Test1()
	{
		System.out.println("in Test-1 ");
	}

	
/*
	 
*/
	
}
