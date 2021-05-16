package testNGBasics;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGBasics.ListnersBasics1.class)

public class TestListners {
	
	
	@Test
	public void Test1()
	{
		System.out.println("in Test-1 ");
		Assert.assertEquals("Ramu", "Sita");
	}

	@Test
	public void Test2()
	{
		System.out.println("in Test-2 ");
//		Assert.assertEquals("Ramu", "Sita");
	}

}
