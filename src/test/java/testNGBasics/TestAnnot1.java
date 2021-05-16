package testNGBasics;

import org.testng.annotations.Test;

public class TestAnnot1 {
/*
	@Test
	public void Test1()
	{
		System.out.println("in Test-1 ");
	}

	@Test
	public void Test2()
	{
		System.out.println("in Test-2 ");
	}*/
	
	/*in Test-1 
	in Test-2 */
	//************************************

	@Test
	public void OpenBrowser()
	{
		System.out.println("in Test-1 ");
	}

	@Test
	public void Flightbooking()
	{
		System.out.println("in Test-2 ");
	}
	/* Runs in alphabetical order
	in Test-2 
	in Test-1 
	PASSED: Flightbooking
	PASSED: OpenBrowse*/
	
	//************************************
	
}
