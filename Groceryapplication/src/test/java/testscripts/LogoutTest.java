package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base {
  @Test
  public void verifyLoginwithValidCredentials() throws IOException {
	  LoginPage login=new LoginPage(driver);
	  
	  String username1=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  login.enterUsername(username1);
	  login.enterPassword(password);
	 login.pressLogin();
  }
}
