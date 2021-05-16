package AutoITBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.baseTest;

public class uploadMultipleFiles extends baseTest
{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= openBrowser("Chrome");
		driver.get("https://www.igniteui.com/file-upload/multiple-upload");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//*[@id='igUpload1_ibb_fp']")).click();// nok
		
		WebElement uploadBtn= driver.findElement(By.xpath("//*[@id='igUpload1_ibb_fp']"));
																	
		Actions act= new Actions(driver);
		act.moveToElement(uploadBtn).click().perform();		
		
		
//		uploadFile("D:\\qtp practise\\TestData\\config.txt");	
		uploadFileWithRobot("D:\\qtp practise\\TestData\\config.txt");
		
		
		WebElement AddEle= driver.findElement(By.xpath("//*[@id='igUpload1_bb_fp']"));
		act.moveToElement(AddEle).click().perform();
		Thread.sleep(3000);
//		uploadFile("D:\\qtp practise\\TestData\\config34.txt");
		uploadFileWithRobot("D:\\qtp practise\\TestData\\config34.txt");
			
	}

	/**
     * This method will set any parameter string to the system's clipboard.
     */
	public static void setClipboardData(String string) {
		//StringSelection is a class that can be used for copy and paste operations.
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		}
	
	//File upload by Robot Class
    public static void uploadFileWithRobot (String imagePath) {
        StringSelection stringSelection = new StringSelection(imagePath);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
 
        Robot robot = null;
 
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
 
        robot.delay(250);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(150);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
	
	public static void uploadFile(String fileLocation) {
        try {
        	
        	//Setting clipboard with file location
            setClipboardData(fileLocation);
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();
            robot.delay(250);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception exp) {
        	exp.printStackTrace();
        }
	
}
}