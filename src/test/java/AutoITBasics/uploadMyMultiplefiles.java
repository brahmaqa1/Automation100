package AutoITBasics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.baseTest;

public class uploadMyMultiplefiles extends baseTest
{

	public static void main(String[] args) throws IOException {
		WebDriver driver= openBrowser("Chrome");
		driver.get("https://www.igniteui.com/file-upload/multiple-upload");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//*[@id='igUpload1_ibb_fp']")).click();// nok
		
		WebElement uploadBtn= driver.findElement(By.xpath("//*[@id='igUpload1_ibb_fp']"));
		Actions act= new Actions(driver);
		act.moveToElement(uploadBtn).click().perform();		
		
		Runtime.getRuntime().exec("D:\\SeleniumSoftwares\\AutoIT\\UploadFile.exe");
		

	}

}
