
package com.hrms.pages;
import org.openqa.selenium.By;
import com.hrms.utility.*;
import org.testng.Reporter;
public class Login_Page extends Base_Class
{
	//objects
	static By txt_LoginName=By.name("txtUserName");
	static By txt_Password=By.xpath( " //input[@name='txtPassword']");
	static By Button_Login=By.name("Submit");
	//functions
	public static void login(String username,String password)throws Exception
	{
		driver.findElement(txt_LoginName).sendKeys(username);
		driver.findElement(txt_Password).sendKeys(password);
		driver.findElement(Button_Login).click();
		Thread.sleep(3000);
		Reporter.log("Login Completed");
	}
	
}
