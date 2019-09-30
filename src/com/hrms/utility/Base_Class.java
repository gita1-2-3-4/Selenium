
package com.hrms.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
public class Base_Class
{
	 public static WebDriver driver;
 public static  void  open_application()throws Exception
 {
	 System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	 Reporter.log("Application is Opened");
	 Thread.sleep(3000);
 }
 public static  void close_application()
 {
	 driver.close();
	 Reporter.log("Application is Closed");
 }
}