package WebObjectsAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.baseTest;

public class RadioBtnAll extends baseTest
{

	public static void main(String[] args) {
		WebDriver driver= openBrowser("Chrome");
		driver.get("file:///D:/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

		// Radiobtn selected or not
		Boolean isSelected= driver.findElement(By.xpath("//*[@value='male']")).isSelected();
		print("isSelected="+isSelected);//isSelected=false

		//click Radiobtn
		driver.findElement(By.xpath("//*[@value='male']")).click();
		isSelected= driver.findElement(By.xpath("//*[@value='male']")).isSelected();
		print("isSelected="+isSelected);//isSelected=true

		//unselect Radiobtn
		driver.findElement(By.xpath("//*[@value='female']")).click();
		isSelected= driver.findElement(By.xpath("//*[@value='female']")).isSelected();
		print("isSelected="+isSelected);//isSelected=true

		// attribute
		String getAttribute= driver.findElement(By.xpath("//*[@value='female']")).getAttribute("selected");
		print("getAttribute="+getAttribute);// true 
		
		getAttribute= driver.findElement(By.xpath("//*[@value='female']")).getAttribute("checked");
		print("getAttribute="+getAttribute);// true		

		getAttribute= driver.findElement(By.xpath("//*[@value='male']")).getAttribute("selected");
		print("getAttribute="+getAttribute);// null 
		
		getAttribute= driver.findElement(By.xpath("//*[@value='male']")).getAttribute("checked");
		print("getAttribute="+getAttribute);// null		

	}

}
