package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import pages.AdminUserSet;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUserTest extends Base{
	HomePage homepage;
	AdminUserSet adminuser;


	@Test
	public void verifyNewAdminButton() throws IOException {
		LoginPage login = new LoginPage(driver);
		String username1=ExcelUtility.getStringData(1, 0, "LoginPage");
		 String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		 
		 login.enterUsername(username1).enterPassword(password);
		 homepage=login.pressLogin();
		 adminuser=homepage.clickAdminIcon();
		 adminuser.clickNewUserButton().userCreationByUsingExcel();
boolean isUserSaved = adminuser.checkUserSaved();
		Assert.assertTrue(isUserSaved, "User is not saved");
	}
}