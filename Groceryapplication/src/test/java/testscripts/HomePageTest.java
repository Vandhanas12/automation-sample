package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomePageTest extends Base
{
	HomePage homepage;
  @Test
  public void verifyLogoutPage() throws IOException {
	  LoginPage login=new LoginPage(driver);
	  String username1=ExcelUtility.getStringData(1, 0, "LoginPage");
		 String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	 login.enterUsername(username1).enterPassword(password);
	 homepage=login.pressLogin();
	 
	  
	  
	   boolean isLoginDisplay=homepage.loginpageDisplayed();
	  Assert.assertTrue(isLoginDisplay,"Not Logout from Page");
  }
}
