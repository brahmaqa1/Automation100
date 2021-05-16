package WebObjectsAll;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utilities.baseTest;

public class selectdropdownAll extends baseTest
{

	public static void main(String[] args) {
		WebDriver driver= openBrowser("Chrome");
		driver.get("file:///D:/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		//Select diff vals
		WebElement dropdownEle = driver.findElement(By.name("cars"));
		Select sel=  new Select(dropdownEle);
		sel.selectByVisibleText("Mercedes");
		
		// get selected val from dropdown
		String getFirstSelectedOption= sel.getFirstSelectedOption().getText();
		print("getFirstSelectedOption="+getFirstSelectedOption);// Mercedes
		
		sel.selectByVisibleText("Audi");	
		// get selected val from dropdown
		getFirstSelectedOption= sel.getFirstSelectedOption().getText();
		print("getFirstSelectedOption="+getFirstSelectedOption);// Audi
		
//		or
		String getAttribute= dropdownEle.getAttribute("value");
		print("getAttribute="+getAttribute);// getAttribute=audival  Care 
		
		// get cnt of dropdown vals
		List<WebElement> getOptions=  sel.getOptions();
		print("getOptions cnt="+getOptions.size()); // 4
		
		// get all vals from dropdown
		for(WebElement EachEle : getOptions)
		{
			print("all vals from dropdown="+EachEle.getText());
		}
		
		/*all vals from dropdown=Maruthi
				all vals from dropdown=Swiftvdi
				all vals from dropdown=Mercedes
				all vals from dropdown=Audi*/
				
			
		//****************
		
	}

}
