package com.hrms.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import com.hrms.utility.*;


public class Add_Emp_Page extends Base_Class{
	//objects
		static By Menu_PIM=By.linkText("PIM");
		static By SubMenu_ADDEMPLOYEE=By.linkText("Add Employee");
		static By txt_FirstName=By.xpath("//input[@name='txtEmpFirstName']");
		static By  txt_LastName=By.xpath("//input[@id='txtEmpLastName']");
		static By Button_Save=By.xpath("//input[@id='btnEdit']");
		//functions
	public static void mouse_over() throws Exception
	{
		WebElement pimmenu=driver.findElement(By.linkText("PIM"));
		Actions obj= new Actions(driver);
		obj.moveToElement(pimmenu).perform();
		Thread.sleep(3000);

	}
	public static  void sub_menu()throws Exception
	{
	driver.findElement(By.linkText("Add Employee")).click();
    System.out.println("clicked on submenu");
    Thread.sleep(3000);
	
}
	public  static void  enter_frame()throws Exception
	{
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@id='txtEmpLastName']")).sendKeys("suresh");
		driver.findElement(By.xpath("//input[@id='btnEdit']")).click();
		Thread.sleep(3000);
	}
	public static  void exit_frame()
	{
		driver.switchTo().defaultContent();
	}
	public static  void add_emp() throws Exception
	{
		System.out.println("Adding new Employee");
	    Thread.sleep(3000);
	}
	
	}

	


