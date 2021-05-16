package FramesBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.baseTest;

public class frame1  extends baseTest
{
	
	public static int getFrameCnt()
	{
//		int getFrameCnt =driver.findElements(By.xpath("//iframe")).size();
		int getFrameCnt =driver.findElements(By.tagName("iframe")).size();
		System.out.println("getFrameCnt="+getFrameCnt);
		return getFrameCnt;
	}
	
	public static int getFrameIndexNo(String myxpath)
	{
		int indexno=-1;
		for(int i=0;i<=getFrameCnt() ; i++)
		{
			driver.switchTo().frame(i);
			int cnt= driver.findElements(By.xpath(myxpath)).size();
			if(cnt>=1)
			{
				System.out.println("getFrameIndexNo="+i);
				driver.switchTo().defaultContent();
				return i;
			}
			
		}
		System.out.println("getFrameIndexNo="+indexno);
		return indexno;
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= openBrowser("Chrome");
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		Thread.sleep(5000);
		//		driver.findElement(By.id("topic")).sendKeys("rsm");//error  in frame
		driver.switchTo().frame("frame1");
		int cnt= driver.findElements(By.xpath("//input[@type='text']")).size();
		System.out.println("cnt="+cnt);
			
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rsm");
		driver.switchTo().defaultContent();


		// inner frame 
		//		  driver.switchTo().frame("frame3");// error
		/*
		 * driver.switchTo().frame("frame1"); driver.switchTo().frame("frame3");
		 * 
		 * driver.findElement(By.id("a")).click(); driver.switchTo().defaultContent();
		 */
		
		// swicth to frame by ID
		driver.switchTo().frame("frame1");
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ram 2");
		driver.switchTo().defaultContent();
		
		/*
		 * // swicth to frame by element WebElement ele=
		 * driver.findElement(By.xpath("//iframe[@id='frame1']"));
		 * driver.switchTo().frame(ele);
		 * 
		 * driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Rmau 3");
		 * driver.switchTo().defaultContent();
		 */
		
		// swicth to frame by name
		driver.switchTo().frame("iamframe");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ram -4");
		driver.switchTo().defaultContent();
		
		///********************
		int getFrameCnt= getFrameCnt();
		System.out.println("getFrameCnt="+getFrameCnt);
		
		getFrameIndexNo("//input[@type='text']");
		getFrameIndexNo("//*[@id='a']");
		
		System.out.println("ends here");

	}

}
