package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.Base_Class;


public class Del_Emp_Page extends Base_Class {
	//objects
	static By SubMenu_EMPLOYEELIST=By.linkText("Employee List");
	static By txt_SearchFor=By.name("loc_name");
	
	//functions
	public static void sub_menu1() throws Exception
	{
		driver.findElement(By.linkText("Employee List")).click();
	    System.out.println("click on Submenu");
	    Thread.sleep(3000);
	}
	public static void entry_frame1()
	{
		driver.switchTo().frame("rightMenu");
	}
	public static void drop_down() throws Exception
	{
		Select st = new Select(driver.findElement(By.xpath("//select[@id='loc_code']")));
		st.selectByIndex(1);
		System.out.println("Emp.ID");
		Thread.sleep(3000);
		
	}
	public static  void search()
	{
		driver.findElement(By.name("loc_name")).sendKeys("0030");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
	}
	public static void delete_emp()
	{
		driver.findElement(By.xpath("//input[@value='0030']")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		System.out.println("Delete  Employee");
	}

}
