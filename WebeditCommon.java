package CommonWebBasedReUsableFunctions;

import org.apache.regexp.recompile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebeditCommon 
{	
	public static void main(String[] args)
	
	{		
		FirefoxDriver driver=new FirefoxDriver();
		String url="file:///D:/qtp%20practise/web%20apps/ALL%20Web%20objects.html";	
		driver.get(url);
		
		//entr
		enter_Val_in_Txtbox(driver,"//input[@id='idfirst']","Brahma");
		
		//get val
		String Get_val_from_txtbox=Get_val_from_txtbox(driver, "//input[@id='idfirst']");
		System.out.println("Get_val_from_txtbox="+Get_val_from_txtbox);
		
		//Clear_val_from_txtbox
		Clear_val_from_txtbox(driver, "//input[@id='idfirst']");

	}//main
	
	//************************************************************************
	
	
	//************************************************************************
	//Function : enter_Val_in_Txtbox()	
	// Fun call: enter_Val_in_Txtbox(driver,"//input[@id='idfirst']","Brahma");
			public static void enter_Val_in_Txtbox(WebDriver driver,String xpath,String val)					
			{				
				try
				{
					String ev="<NA>";
					//enter text in editbox		  xpath= //tagname [@attribute='val']
					if(val.equalsIgnoreCase(ev))
					{
							
					}
					else
					{
						driver.findElement(By.xpath(xpath)).sendKeys(val);	
					}
							
				}
				catch(Exception e)
				{
					//e.printStackTrace();
				 System.out.println("My Exception:"+xpath+"not found.value is  not entered in txtbox");
				}
				
			}	
	
	
	//()//****************************************
			//Function : Get_val_from_txtbox()	
			//Ex: String Get_val_from_txtbox=Get_val_from_txtbox(driver, "//input[@id='idfirst']");
			//System.out.println("Get_val_from_txtbox="+Get_val_from_txtbox);
			public static String Get_val_from_txtbox(WebDriver driver,String xpath)
					
			{
				//get value from text box		
				//getAttribute return type String****************
				String val=driver.findElement(By.xpath(xpath)).getAttribute("value");//QTP also same = getroproperty("value")
				System.out.println("val="+val);//val=kancham
				return val;					
			}	
	//****************************************
			//Function : Clear_val_from_txtbox()
			// Clear_val_from_txtbox(driver, "//input[@id='idfirst']");
			public static void Clear_val_from_txtbox(WebDriver driver,String xpath)					
			{
				//clear text from edit box  xpath= //tagname [@attribute='val']
				driver.findElement(By.xpath(xpath)).clear();								
			}	
				
	
	

} //class
