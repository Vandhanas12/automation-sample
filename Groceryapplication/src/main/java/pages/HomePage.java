package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
		public WebDriver driver;
		public HomePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		@FindBy(xpath="//span[text()='7rmart supermarket']")private WebElement homepagemsg;
		@FindBy(xpath="//button[@type='submit']")private WebElement displaylogin;
		@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and text()='More info ']")
		private WebElement adminicon;
		public boolean isTitleDisplayed()
		{
			
			return homepagemsg.isDisplayed();
		}
		public boolean loginpageDisplayed()
		{return displaylogin.isDisplayed(); }
		public AdminUserSet clickAdminIcon() {
			adminicon.click();
			return new AdminUserSet(driver);
		}

	}


