package testNGBasics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterBasics1 {

		
	@Test
//	@Parameters({"userid"})
//	@Parameters({"Userid","pwd"}) //case sensitive ..Must pass as same as in testng xml file
	@Parameters({"userid","pwd"})
	public void Test1(String user, String mypwd)
	{
		System.out.println("in Test-1 "+user + ",pwd="+mypwd);
	}


/*
	in Test-1 Brahma,pwd=mercury
	in Test-2 

*/
	
}
