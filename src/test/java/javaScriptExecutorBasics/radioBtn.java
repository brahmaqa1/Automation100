package javaScriptExecutorBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.baseTest;

public class radioBtn extends baseTest
{

	public static void main(String[] args) {
		
		WebDriver driver= openBrowser("Chrome");
		driver.get("file:///D:/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
				
		//select  radio button
		// get seleectd status of radio button
		JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement radiobutton= driver.findElement(By.id("femaleid"));
		js.executeScript("arguments[0].click();", radiobutton);
		
		String ValFromRadiobtn = js.executeScript("return arguments[0].value;",radiobutton).toString();//ok
		System.out.println("ValFromRadiobtn using args="+ValFromRadiobtn);//ok female
		
		// docu	
		radiobutton= driver.findElement(By.id("maleid"));
		js.executeScript("document.getElementById('maleid').click();");//ok
		ValFromRadiobtn = js.executeScript("return arguments[0].value;",radiobutton).toString();//ok
		System.out.println("ValFromRadiobtn using args="+ValFromRadiobtn);//ok 		
		
	// or
	
		ValFromRadiobtn = js.executeScript("return document.getElementById('maleid').value").toString();//ok
		System.out.println("ValFromRadiobtn using args="+ValFromRadiobtn);//ok 		
		
		// get prop val
		String idProp = js.executeScript("return document.getElementById('maleid').id").toString();//ok
		System.out.println("idProp="+idProp);//ok maleid
		
		
				
	}

}
