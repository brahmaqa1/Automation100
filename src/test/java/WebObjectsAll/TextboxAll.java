package WebObjectsAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.baseTest;

public class TextboxAll extends baseTest
{

	public static void main(String[] args) {
		WebDriver driver= openBrowser("Chrome");
		driver.get("file:///D:/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		//updated line1
		//updated line -2
		// send text to textbox
		driver.findElement(By.name("firstname")).sendKeys("Ramu");
		
		// get value from textbox
		String valFromTextbox =driver.findElement(By.name("firstname")).getAttribute("value");
		print("valFromTextbox="+valFromTextbox);
		
		// clear val
		driver.findElement(By.name("firstname")).clear();
		
		driver.findElement(By.name("firstname")).sendKeys("Raju");
		// get value from textbox
		valFromTextbox=	driver.findElement(By.name("firstname")).getAttribute("value");
		print("valFromTextbox="+valFromTextbox);
		
		/*valFromTextbox=default value Ram Ramu
				valFromTextbox=Raju*/		
		
	}

}
