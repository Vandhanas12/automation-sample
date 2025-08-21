package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
@FindBy(xpath="//p[text()='Welcome to payroll Application']")private WebElement homepagetext;
public boolean isHomePageTextDisplayed()
{
	return homepagetext.isDisplayed();
}
}
