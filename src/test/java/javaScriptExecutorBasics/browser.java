package javaScriptExecutorBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.baseTest;

public class browser extends baseTest
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= openBrowser("Chrome");
		driver.get("file:///D:/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		String readyStatus = js.executeScript("return document.readystate").toString();//Dpnt use readystate
//		/ use Caps
		
	/*	One of five values:
			uninitialized - Has not started loading yet
			loading - Is loading
			loaded - Has been loaded
			interactive - Has loaded enough and the user can interact with it
			complete - Fully loaded*/
		
//		String readyStatus = js.executeScript("return document.readyState").toString();//ok
		String readyStatus = js.executeScript("return document.readyState;").toString();// ok if adding ;
		System.out.println("readyStatus=" + readyStatus);//readyStatus=complete
		
//		String title= js.executeScript("return document.title").toString();
		
		String title= js.executeScript("return document.title;").toString();//  Added ; also ok
		System.out.println("title=" + title);//title=All webobjects MyTitle4
				

	}
}
