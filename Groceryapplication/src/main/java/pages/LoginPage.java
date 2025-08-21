package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelUtility;

public class LoginPage {

	
		public WebDriver driver;
		public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
		@FindBy(xpath="//input[@placeholder='Username']")private WebElement usernamefield;
		@FindBy(xpath="//input[@placeholder='Password']")private WebElement passwordfield;
		@FindBy(xpath="//button[@type='submit']")private WebElement loginbutton;
		@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement errormessage;
		public LoginPage enterUsername(String username) 
		{
			usernamefield.sendKeys(username);
			return this;
		}
		public LoginPage enterPassword(String password) 
		{
			passwordfield.sendKeys(password);
			return this;
		}
		public HomePage pressLogin()
		{
			loginbutton.click();
			return new HomePage(driver);
			}
		public boolean errorMessage()
		{
			
			return errormessage.isDisplayed();
		}
		
		public void loginByUsingExcel() throws IOException
		 {
			 String username1=ExcelUtility.getStringData(1, 0, "LoginPage");
			 String password=ExcelUtility.getStringData(1, 1, "LoginPage");
			 usernamefield.sendKeys(username1);
			 passwordfield.sendKeys(password);
			 loginbutton.click();
			}



	}


