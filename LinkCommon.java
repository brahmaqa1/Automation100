package CommonWebBasedReUsableFunctions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkCommon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Starts main------");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///D:/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
			
		
	//1.Click_Link_byXpath
		/*Click_Link_byXpath(driver,"//a[@id='tooltipdid']"); //working
		Thread.sleep(4000);
		get_CurrentUrL(driver);
		driver.navigate().back();	
		*/
		/*//3
		Click_Link_by_Text(driver,"WebTableAll Link");// working
		get_CurrentUrL(driver);
		Thread.sleep(4000);
		driver.navigate().back();*/
	
		//2
	/*	Click_Link_by_PartialText(driver,"ToolTip Li"); //workin
		get_CurrentUrL(driver);
		Thread.sleep(4000);
		driver.navigate().back();
		*/

		//4
		String [] garr=get_All_Links(driver);	 //working
		//          garr  = arr...... [array of string vals]
		//garra[0]
		Display_vals_From_Array(garr);
		
		Thread.sleep(4000);
		driver.navigate().back();
		
		//5
		/*click_Any_Link(driver,"Form Link");
		get_CurrentUrL(driver);
		//Starts main------
		lnkname=Login Form Link Opened in New tab;text=Form Link
				getCurrentUrl=file:///D:/qtp%20practise/web%20apps/ALL%20Web%20objects.html //Care?????????// not coming newly opned tab link
		*/
		
		
		// ex :5.2
		//click_Any_Link(driver,"WebTable"); //working
		click_Any_Link(driver,"Link"); //??????not working fine?????????Link not found.plx chk data
		//lnkname=WebTableAll Link;text=WebTable
				
		get_CurrentUrL(driver);//getCurrentUrl=d:\qtp%20practise\web%20apps\WebTableAll.html
		
		System.out.println("ends main------");
	}//main

	
	//********************************************************************************************************************
	//Function : Click_Link_byXpath
	//ex1:   Click_Link_byXpath(driver,"//a[@id='tooltipdid'"]);
	//********************************************************************************************************************

	public static void Click_Link_byXpath(WebDriver driver,String xpath)
	{		
		try
		{

			 WebElement lnk=driver.findElement(By.xpath(xpath));
			  lnk.click();// working	
			  SynchroniseCommon.wait_for_PageLoad(driver, 8);
		}
		catch(Exception e)
		
		{
			System.out.println("My own Exception from get_PropertyOrAttribute:="+xpath+"not found or invalid prop");
		}

		
	}
	
	//********************************************************************************************************************
	//Function :Click_Link_by_PartialText
	//ex1:    Click_Link_by_PartialText(driver,"ToolTip Li");
	
	//********************************************************************************************************************

	public static void  Click_Link_by_PartialText(WebDriver driver,String text)
	{

		  
		  try
			{

				WebElement lnk=driver.findElement(By.partialLinkText(text));
				  lnk.click();// working
				  SynchroniseCommon.wait_for_PageLoad(driver, 9);
			}
			catch(Exception e)

			{
				System.out.println("My Exception: Link"+ text +"not found button.Link not clicked");
			}
		
	}
	
	
	//********************************************************************************************************************
	//Function :Click_Link_by_Text
	//ex1:   Click_Link_by_Text(driver,"WebTableAll Link");

	//********************************************************************************************************************

	public static void Click_Link_by_Text(WebDriver driver,String text)
	{
		WebElement lnk=driver.findElement(By.linkText(text));
		lnk.click();// working	
		 SynchroniseCommon.wait_for_PageLoad(driver, 8);
		
		//if text not found
		
	}
	
	
	//********************************************************************************************************************
	//Function :get_All_Links
	//ex1:   String [] garr=get_All_Links(driver)
	//   		displa
	//********************************************************************************************************************

	public static String [] get_All_Links(WebDriver driver)
	{
		
		List<WebElement> links=driver.findElements(By.tagName("a"));		
		int linkscount=links.size();
		System.out.println("total linkscount="+linkscount);// 5 or some 
		//Strore i array
		String [] arr=new String[linkscount];// 55
		System.out.println("arr[0]"+arr[0]);
		
		//get all link names		
				for(int i=0;i<=links.size()-1;i=i+1 )
				{
					String lnkname=links.get(i).getText();// 		
					System.out.println("Linkname="+i+"."+lnkname);
					arr[i]=lnkname;
				}
	   return arr;	// returns array of values	
	}
	
	
	
	//********************************************************************************************************************
	//Function :click_Any_Link(driver,"WebTableAll");
	//ex1:   click_Any_Link(driver,"WebTableAll");
	//********************************************************************************************************************

	public static void click_Any_Link(WebDriver driver,String text)
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));		
		int linkscount=links.size();
		//System.out.println("linkscount="+linkscount); //8
		//Strore i array
		String [] arr=new String[linkscount];
		//get all link names	
		int lnkfound=0;
				for(int i=0;i<=links.size()-1;i=i+1 )
				{
					String lnkname=links.get(i).getText();// 		
					//System.out.println("Linkname="+i+"."+lnkname); //ok  Care**********vimp	
					
					if(lnkname.contains(text))
					{
						System.out.println("lnkname="+lnkname+ ";text="+text);
						lnkfound=i;							
						break;
					}
					else
					{
						
						//System.out.println(lnkname+"not found");
					}					
									
				}	//for 	
				
		// id lnk not found
				
				if(lnkfound>0)  //5  0
				{
					links.get(lnkfound).click();
					 SynchroniseCommon.wait_for_PageLoad(driver, 8);
				}
				else
				{
					System.out.println("Link not found.plx chk data");
				}			
		
	}
	
	//********************************************************************************************************************
		//Function : Display_vals_From_Array()
		//ex1:   Display_vals_From_Array(arrayname)
		//   		 
		//********************************************************************************************************************
		public static void  Display_vals_From_Array(String [] Farray)
	//	public static void  Display_vals_From_Array(int[] Farray)
		{
			System.out.println("*****display arrray vals*********");
			for(int i=0;i<=Farray.length-1;i++)
			{				
				System.out.println("vals in array="+Farray[i]);
			}
		}
	
		
		//********************************************************************************************************************
			//Function : get_CurrentUrL()
			//ex1:   String currenturl=get_CurrentUrL(driver);
			//   		 System.out.println("getCurrentUrl="+currenturl);
			//********************************************************************************************************************
			public static String  get_CurrentUrL(WebDriver driver)
			{
				String getCurrentUrl= driver.getCurrentUrl();
				System.out.println("getCurrentUrl="+getCurrentUrl);
				return getCurrentUrl;
				
			}
	
	//********************************************************************************************************************
}
