
package com.hrms.testscripts;
import org.testng.annotations.Test;
import com.hrms.utility.Base_Class;
import com.hrms.pages.Login_Page;
import com.hrms.pages.Logout_Page;
import com.hrms.pages.Verify_Page;
public class TC_101
{
	//Test Case Steps
	@Test
	public static void tc_101() throws Exception
	{
		Base_Class.open_application();
		Verify_Page.verify_title("OrangeHRM-New Level of HR Management");
		Login_Page.login("Admin", "admin123");
		Verify_Page.verify_title("OrangeHRM");
		Verify_Page.verify_text("Welcome Admin");
		Logout_Page.Logout();
		Base_Class.close_application();
	}
}
