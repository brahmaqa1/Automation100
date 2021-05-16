package WebObjectsAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.baseTest;

public class CheckboxAll extends baseTest
{

	public static void main(String[] args) {
		WebDriver driver= openBrowser("Chrome");
		driver.get("file:///D:/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

		// checkbox selected or not
		Boolean isSelected= driver.findElement(By.xpath("//*[@value='Bike']")).isSelected();
		print("isSelected="+isSelected);//isSelected=false

		//click checkbox
		driver.findElement(By.xpath("//*[@value='Bike']")).click();
		isSelected= driver.findElement(By.xpath("//*[@value='Bike']")).isSelected();
		print("isSelected="+isSelected);//isSelected=true

		//unselect checkbox
		driver.findElement(By.xpath("//*[@value='Bike']")).click();
		isSelected= driver.findElement(By.xpath("//*[@value='Bike']")).isSelected();
		print("isSelected="+isSelected);//isSelected=false

		driver.findElement(By.xpath("//*[@value='Bike']")).click();
		// attribute
		String getAttribute= driver.findElement(By.xpath("//*[@value='Bike']")).getAttribute("selected");
		print("getAttribute="+getAttribute);// true 

		getAttribute= driver.findElement(By.xpath("//*[@value='Bike']")).getAttribute("checked");
		print("getAttribute="+getAttribute);// true		

		getAttribute= driver.findElement(By.xpath("//*[@value='Car']")).getAttribute("selected");
		print("getAttribute="+getAttribute);// null 

		getAttribute= driver.findElement(By.xpath("//*[@value='Car']")).getAttribute("checked");
		print("getAttribute="+getAttribute);// null	

	}

}
