package pages;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LogoutPage {
	public WebDriver driver;
	public void Logout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@data-toggle='dropdown']")private WebElement logoutadminicon;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassociates.com/admin/logout' and @class='dropdown-item']")private WebElement logout;
	@FindBy(xpath="//button[@type='submit']")private WebElement displaylogin;
	public void clickonAdminIcon()
	{
		
		logoutadminicon.click();
	}
	public void clickonLogoutBtn() {
		logout.click();}
	public boolean loginpageDisplayed()
	{return displaylogin.isDisplayed();
	}

	}


