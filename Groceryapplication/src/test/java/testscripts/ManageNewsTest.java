package testscripts;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import automationcore.Base;
import pages.LoginPage;
import pages.ManageCategoryPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
  @Test
  public void verifyLoginwithValidCredentials() throws IOException  {
	  LoginPage login=new LoginPage(driver);
	  
	  String username1=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  login.enterUsername(username1);
	  login.enterPassword(password);
	 login.pressLogin();
	 ManageNewsPage managenews=new ManageNewsPage();
	 managenews.clickNewsButton();
	 managenews.clickNewButton();
	 managenews.enterNews("hai");
	 managenews.clickUpdateButton();
	 
	  }
	
  }

