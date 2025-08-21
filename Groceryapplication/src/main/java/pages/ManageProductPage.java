package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageProductPage {
	public WebDriver driver;
	public void AdminUserSet(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newbutton;
@FindBy(xpath="//input[@placeholder='Enter the Title']")private WebElement titlebutton;
@FindBy(xpath="//input[@placeholder='Enter the Tag']")private WebElement tagbutton;
@FindBy(xpath="//select[@class='form-control selectpicker']")private WebElement categorybutton;
@FindBy(xpath="//select[@name='grp_id']")private WebElement groupbutton;
}