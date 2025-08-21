package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationcore.Base;
import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{
	HomePage homepage;
	@Test
	public void verifyLoginwithValidCredentials() throws IOException 
	  {LoginPage login=new LoginPage(driver);
	  String username1=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  login.enterUsername(username1);
	  login.enterPassword(password);
	  homepage=login.pressLogin();
	  
	  login.loginByUsingExcel();
	  HomePage home=new HomePage(driver);
	  boolean isHomePageloaded=home.isTitleDisplayed();
	  Assert.assertTrue(isHomePageloaded,"Home Page is not loaded");
	  }
	 @Test
	 public void verifyLoginWithInvalidUnameAndValidPassword()
	 {
		 LoginPage login=new LoginPage(driver);
		  login.enterUsername("admin110");
		  login.enterPassword("admin");
		  login.pressLogin();
		  
		 boolean isHomePageloaded=login.errorMessage();
		  Assert.assertTrue(isHomePageloaded,"Home loaded");
	 }
@Test
	 public void verifyLoginWithValidUnameAndInvalidPassword()
	 {
		 LoginPage login=new LoginPage(driver);
		  login.enterUsername("admin");
		  login.enterPassword("admin110");
		  login.pressLogin();
		  boolean isHomePageloaded=login.errorMessage();
		  Assert.assertTrue(isHomePageloaded,Constant.ERRORMSGLOGIN);
	 }

@Test(dataProvider="invalid")
	 public void verifyLoginWithInvalidCredentials(String uname,String pwd)
	 {
		 LoginPage login=new LoginPage(driver);
		  login.enterUsername(uname);
		  login.enterPassword(pwd);
		  login.pressLogin();
		  boolean isHomePageloaded=login.errorMessage();
		  Assert.assertTrue(isHomePageloaded,"Home loaded");
	 }
	 @DataProvider (name="invalid")
	 public Object[][] dp(){
		 return new Object[][] {{"admin12","adminll"},{"adminlk","dabn"},{"1545","654"}};
		 }

  
  
}
