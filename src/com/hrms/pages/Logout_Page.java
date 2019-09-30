
package com.hrms.pages;
import org.openqa.selenium.By;
import org.testng.Reporter;
import com.hrms.utility.*;
public class Logout_Page extends Base_Class
{
	//object
	static By Link_Logout=By.linkText("Logout");
	//function
	public static void Logout()
	{
		driver.findElement(Link_Logout).click();
		Reporter.log("Logout Completed");
	}
}