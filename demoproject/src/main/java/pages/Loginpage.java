package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class Loginpage {
	public WebDriver driver;
	public Loginpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='loginform-username']") WebElement usernamefield;
	@FindBy(xpath="//input[@id='loginform-password']")private WebElement passwordfield;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginbutton;
	@FindBy(xpath="//p[text()='Incorrect username or password.']")private WebElement errormessage;
	public Loginpage enterUsername(String username) 
	{
		usernamefield.sendKeys(username);
		return this;
	}
	public Loginpage enterPassword(String password) 
	{
		passwordfield.sendKeys(password);
		return this;
	}
	//after click login button it directs into the homepage,so we use chaining pass driver
	public HomePage pressLogin()
	{
		loginbutton.click();
		return new HomePage(driver);
		}
	public boolean errorMessage()
	{
		
		return errormessage.isDisplayed();
	}
	
}

