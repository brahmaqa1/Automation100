package Cookies;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftwares\\All Selenium Jar Files\\chromedriver_win32V90\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///D:/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

		
		//select check box
		JavascriptExecutor js= (JavascriptExecutor) driver;
//		WebElement checkboxEle = driver.findElement(By.name("bike"));
//		js.executeScript("arguments[0].click();", checkboxEle);//ok
//		js.executeScript("arguments[1].click();", checkboxEle);//nok
		
		List<WebElement>  allChkboxes=  driver.findElements(By.name("bike"));
		
		js.executeScript("arguments[0].click();", allChkboxes);//ok
		js.executeScript("arguments[1].click();", allChkboxes);//nok
		

	}

}
