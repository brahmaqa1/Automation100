package WebObjectsAll;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utilities.baseTest;

public class MultiselectAll extends baseTest
{

	public static void main(String[] args) {
		WebDriver driver= openBrowser("Chrome");
		driver.get("file:///D:/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

		//Select diff vals
		WebElement dropdownEle = driver.findElement(By.name("MultiCars"));
		Select sel=  new Select(dropdownEle);

		// is multiselect 
		boolean isMultiple= sel.isMultiple();
		print("isMultiple="+isMultiple);//isMultiple=true

		// get default selected val
		String  getFirstSelectedOption = sel.getFirstSelectedOption().getText();
		print("getFirstSelectedOption="+getFirstSelectedOption);// Benz

		// select multiple vals
		sel.selectByVisibleText("Audi");
		sel.selectByVisibleText("Maruthi");
		getFirstSelectedOption = sel.getFirstSelectedOption().getText();
		print("getFirstSelectedOption="+getFirstSelectedOption);
		//getFirstSelectedOption=Maruthi

		// get all selected options 
		List<WebElement> getAllSelectedOptions= sel.getAllSelectedOptions();
		for(WebElement ele: getAllSelectedOptions)
		{
			String getText= ele.getText();
			print("getAllSelectedOptions="+getText);
		}
	/*			getAllSelectedOptions=Maruthi
				getAllSelectedOptions=Benz
				getAllSelectedOptions=Audi
	*/
		
		// get all vals from dropdown
		List<WebElement> getOptions= sel.getOptions();
		for(WebElement ele: getOptions)
		{
			String getText= ele.getText();
			print("getOptions="+getText);
		}
		/*		getOptions=Maruthi
				getOptions=Swiftvdi
				getOptions=Benz
				getOptions=Audi
				getOptions=BMW
*/
		
		
		// deselect by visible
		sel.deselectByVisibleText("Audi");

		// deselect all
		sel.deselectAll();
		

	}


}
