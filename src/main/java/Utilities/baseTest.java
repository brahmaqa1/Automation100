package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseTest 
{
	public static WebDriver driver;
	
	public static WebDriver openBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftwares\\All Selenium Jar Files\\chromedriver_win32V90\\chromedriver.exe");
//			WebDriver driver = new ChromeDriver();	// dont use as local var, next null ptr exception
			 driver = new ChromeDriver();	
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// null ptr exc 
				
		return driver;
	}

	public static void print(String msg)
	{
		System.out.println(msg);
	}
	
}
