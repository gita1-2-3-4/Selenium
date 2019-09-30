package com.hrms.testscripts;
import org.testng.annotations.Test;
import com.hrms.utility.Base_Class;
import com.hrms.pages.Login_Page;
import com.hrms.pages.Logout_Page;
import com.hrms.pages.Verify_Page;
import com.hrms.pages.Add_Emp_Page;


public class TC_102 {

	//Test Case Steps
	@Test
	public static void tc_102() throws Exception
	{
		Base_Class.open_application();
		Verify_Page.verify_title("OrangeHRM-New Level of HR Management");
		Login_Page.login("Admin","admin123");
		Verify_Page.verify_title("OrangeHRM");
		Verify_Page.verify_text("Welcome Admin");
		Add_Emp_Page.mouse_over();
		Add_Emp_Page.sub_menu();
		Add_Emp_Page.enter_frame();
		Add_Emp_Page.exit_frame();
		Add_Emp_Page.add_emp();
		Logout_Page.Logout();
		Base_Class.close_application();
		
	}

}
