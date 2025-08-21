package testscripts;

import org.testng.annotations.Test;

import automationcore.Base;

import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {
  @Test
  public void verifyLoginwithValidCredentials() throws IOException 
  {
	  LoginPage login=new LoginPage(driver);
  
  String username1=ExcelUtility.getStringData(1, 0, "LoginPage");
  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
  login.enterUsername(username1);
  login.enterPassword(password);
 login.pressLogin();
 ManageCategoryPage managecategory=new ManageCategoryPage();
 
 managecategory.clickSearchButton();
 managecategory.enterSearchData("Subscription");
 managecategory.clickSearchButton();
 boolean nodatadisplayed=managecategory.showNoDataFound();
 AssertJUnit.assertTrue(nodatadisplayed);
  }
}
  