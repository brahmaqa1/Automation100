package testNGBasics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvideBasics1 {


	// define getData()
	@DataProvider
	public Object [][] getData()
	{
		Object [][] data=  new Object [3] [2];

		data[0] [0] ="Bram 1";
		data[0] [1] ="mercury1";

		data[1] [0] ="Bram 2";
		data[1] [1] ="mercury2";


		data[2] [0] ="Bram -3";
		data[2] [1] ="mercury-3";
		
		return data;
	}

	@Test(dataProvider="getData")
	public void login(String user,String pwd)
//	public void login(String user)
	//The data provider is trying to pass 2 parameters but the method testNGBasics.dataProvideBasics1#login takes 1
//	public void login(String user,String pwd,String url)  // Must pass2 args only
	//FAILED: login 	org.testng.TestNGException: 
//		The data provider is trying to pass 2 parameters but the method testNGBasics.dataProvideBasics1#login takes 3 and TestNG is unable in inject a suitable object
			
	{
		System.out.println("user="+user + ",pwd="+pwd);
//		System.out.println("user="+user);
//		..pwd..
		
		
	}
			/*user=Bram 1,pwd=mercury1
			user=Bram 2,pwd=mercury2
			user=Bram -3,pwd=mercury-3
			PASSED: login("Bram 1", "mercury1")
			PASSED: login("Bram 2", "mercury2")
			PASSED: login("Bram -3", "mercury-3")*/
			
	
	


}
