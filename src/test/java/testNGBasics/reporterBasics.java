package testNGBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class reporterBasics 
{

	@Test
	public void Test1()
	{
		System.out.println("in Test-1 ");
		Reporter.log("enter user name ");
		Reporter.log("enter pwd ");
		Reporter.log("click login");
		
	}

	
	
}
