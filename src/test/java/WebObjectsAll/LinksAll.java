package WebObjectsAll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.baseTest;

public class LinksAll extends baseTest
{

	public static void main(String[] args) {
		WebDriver d= openBrowser("Chrome");
		d.get("file:///D:/qtp%20practise/web%20apps/ALL%20Web%20objects.html");


		/*		  WebElement lnk=d.findElement(By.linkText("ToolTip Link"));
				  lnk.click();// working
				  Thread.sleep(2000);
				  d.navigate().back();

				  //id ---with out by.linktext
				  d.findElement(By.id("webtblid")).click(); //this also working
				  Thread.sleep(2000);
				  d.navigate().back();
		 */

		List <WebElement> links= driver.findElements(By.tagName("a"));
		//import java.util.List;
		/*		int lnkcnt=links.size();//8
				System.out.println("lnk cnt="+lnkcnt);	//

				//get link name
				String lnkname1=links.get(0).getText();
				System.out.println("lnkname1="+lnkname1);//lnkname1=ToolTip Link

				String lnkname2=links.get(1).getText();//lnkname2=WebTableAll Link
				System.out.println("lnkname2="+lnkname2);
		 */

		//get url of 1st link
		/*String href1=links.get(0).getAttribute("href");
				System.out.println("href="+href1);//href=d:\qtp%20practise\web%20apps\tooltip.html

		 */	

		//get all link names		
		for(int i=0;i<=links.size()-1;i=i+1 )
		{
			String lnkname=links.get(i).getText();// 		

			String href2=links.get(i).getAttribute("href");
			System.out.println("Linkname="+i+"."+lnkname+"\t"+",href="+href2);
			//System.out.println("Linkname="+i+"."+links.get(i).getText()); //ok
		}
		/*  Linkname=0.ToolTip Link	,href=file:///D:/qtp%20practise/web%20apps/tooltip.html
			Linkname=1.WebTableAll Link	,href=file:///D:/qtp%20practise/web%20apps/WebTableAll.html
			Linkname=2.Login Form Link	,href=file:///D:/qtp%20practise/web%20apps/Login%20Form.html
			Linkname=3.	,href=file:///D:/qtp%20practise/web%20apps/default.asp
			Linkname=4.	,href=file:///D:/qtp%20practise/web%20apps/default.asp
			Linkname=5.Click here!	,href=http://www.w3schools.com/

		 *****************/
		print("****************");
		// or
		for(WebElement eachLinkEle :links)
		{
			print("eachLinkEle text ="+eachLinkEle.getText());
		}

		/*eachLinkEle text =ToolTip Link
				eachLinkEle text =WebTableAll Link
				eachLinkEle text =Login Form Link
				eachLinkEle text =
				eachLinkEle text =
				eachLinkEle text =Click here!
		 */
	}

}
