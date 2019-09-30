package com.hrms.testscripts;
import org.testng.annotations.Test;
import com.hrms.utility.Base_Class;
import com.hrms.pages.Login_Page;
import com.hrms.pages.Logout_Page;
import com.hrms.pages.Verify_Page;
import com.hrms.pages.Add_Emp_Page;
import com.hrms.pages.Del_Emp_Page;


public class TC_103 extends Base_Class {
	//Test Case Steps
		@Test
		public static void tc_103() throws Exception
		{
			Base_Class.open_application();
			Verify_Page.verify_title("OrangeHRM-New Level of HR Management");
			Login_Page.login("Admin", "admin123");
			Add_Emp_Page.mouse_over();
			Del_Emp_Page.sub_menu1();
			Del_Emp_Page.entry_frame1();
			Del_Emp_Page.drop_down();
			Del_Emp_Page.search();
			Del_Emp_Page.delete_emp();
			Add_Emp_Page.exit_frame();
			Logout_Page.Logout();
			Base_Class.close_application();
			
		}

}
