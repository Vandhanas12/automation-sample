package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import pages.HomePage;
import pages.Loginpage;

public class Logintest extends Base {
  @Test(priority=1,retryAnalyzer = retry.Retry.class)
  public void verifyloginwithcredentials() {
	  Loginpage login=new Loginpage(driver);
	  login.enterUsername("carol");
	  login.enterPassword("1q2w3e4r");
	  login.pressLogin();
	  
	  HomePage home =new HomePage(driver);
	   boolean isHomePageLoaded=home.isHomePageTextDisplayed();
	  Assert.assertTrue(isHomePageLoaded,"Home page is not loaded");
		
  }
  @Test
  public void verifyloginwithincorrectpassword()
  {
	  Loginpage login=new Loginpage(driver);
	  login.enterUsername("carol");
	  login.enterPassword("1q2w7e4u");
	  login.pressLogin();
	 
	  boolean errormessagedisplayed=login.errorMessage();
	  
	  Assert.assertTrue(errormessagedisplayed,"Home page is  loaded");
		
  } 
  @Test
  
  public void verifyloginwithincorrectusername()
  {
	  Loginpage login=new Loginpage(driver);
	  login.enterUsername("caral");
	  login.enterPassword("1q2w3e4r");
	  login.pressLogin();
	 
	  boolean errormessagedisplayed=login.errorMessage();
	  
	  Assert.assertTrue(errormessagedisplayed,"Home page is  loaded");
		
  } 
  @Test
  public void verifyloginwithincorrectpasswordandusername()
  {
	  Loginpage login=new Loginpage(driver);
	  login.enterUsername("caral");
	  login.enterPassword("1q8w7e4k");
	  login.pressLogin();
	 
	  boolean errormessagedisplayed=login.errorMessage();
	  
	  Assert.assertTrue(errormessagedisplayed,"Home page is  loaded");
		
  } 
}
