
package com.hrms.pages;


import org.testng.Reporter;
import com.hrms.utility.*;
public class Verify_Page extends Base_Class
{
	public static void verify_title(String title )
	{
		if (driver.getTitle().equals(title))
		{
			Reporter.log("Title matched");
		}
		else
		{
			Reporter.log(" Title is not matched and expected title is " + driver.getTitle());
		}
	}
	public static void  verify_text(String text)
	{
		String pageSource=driver.getPageSource();
		if(pageSource.contains(text))
		{
			System.out.println("Expected text"+text+"present in the web page");
		}
		else
		{
			System.out.println("Expected text"+text+" is not present in the web page");
		}
}
}