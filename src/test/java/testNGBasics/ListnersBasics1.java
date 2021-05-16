package testNGBasics;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnersBasics1 implements ITestListener
{
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Method:"+result.getName() + "-onTestStart, Status="+result.getStatus());
		Reporter.log("Test Method:"+result.getName() + "-onTestStart, Status="+result.getStatus());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Method:"+result.getName() + "-onTestSuccess, Status="+result.getStatus());
		Reporter.log("Test Method:"+result.getName() + "-onTestSuccess, Status="+result.getStatus());
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Method:"+result.getName() + "-onTestFailure, Status="+result.getStatus());
	Reporter.log("Test Method:"+result.getName() + "-onTestFailure, Status="+result.getStatus());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context,ITestResult result ) {
		// TODO Auto-generated method stub
		System.out.println("Test Method:"+context.getName() + " onStart"+"Sttaus="+result.getStatus());
		Reporter.log("Test Method:"+context.getName() + " onStart"+"Sttaus="+result.getStatus());
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

}
