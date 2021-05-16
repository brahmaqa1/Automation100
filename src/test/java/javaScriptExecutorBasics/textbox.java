package javaScriptExecutorBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.baseTest;

public class textbox extends baseTest
{

	public static void main(String[] args) {
		
		WebDriver driver= openBrowser("Chrome");
		driver.get("file:///D:/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// send val into textbox
		WebElement lastNameEle = driver.findElement(By.id("nameid"));
		js.executeScript("arguments[0].value='Ramu new 1';", lastNameEle);
//		js.executeScript("arguments[1].value='Ramu new 2';", lastNameEle);
		
		js.executeScript("document.getElementById('nameid').value='Ramu2';");
		
		// Get val from textbox
		String val = js.executeScript("return document.getElementById('nameid').value;").toString();
		System.out.println("val="+val);	//val=Ramu2
		
		//or 
		val = js.executeScript("return arguments[0].value",lastNameEle).toString();
		System.out.println("val="+val);	// val=Ramu2
				
	}

}
