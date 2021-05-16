package WebObjectsAll;

import java.io.File;

import org.openqa.selenium.WebDriver;

import Utilities.baseTest;

public class ImageAll extends baseTest
{

	public static void main(String[] args) {
		WebDriver driver= openBrowser("Chrome");
		driver.get("file:///D:/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		String getCurrentUrl=driver.getCurrentUrl();
		print("getCurrentUrl="+getCurrentUrl);
		
		String getTitle=driver.getTitle();
		print("getTitle="+getTitle);
		
		String getPageSource =driver.getPageSource();
		print("getPageSource="+getPageSource);
		//getCurrentUrl=file:///D:/qtp%20practise/web%20apps/ALL%20Web%20objects.html
	//	getTitle=All webobjects MyTitle
//		getPageSource=<html><head><title> All webobjects MyTitle</title>
//		</head><body><form>
		
	

	}

}
