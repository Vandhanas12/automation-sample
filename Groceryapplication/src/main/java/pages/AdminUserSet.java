package pages;


	import java.io.IOException;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

import utilities.ExcelUtility;
import utilities.FakerUtility;
import utilities.Generalutilities;

	public class AdminUserSet {
		public WebDriver driver;
		Generalutilities general = new Generalutilities();
		FakerUtility faker = new FakerUtility();

		public AdminUserSet(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//a[@onclick='click_button(1)']")
		private WebElement newbutton;
		@FindBy(xpath = "//input[@id='username']")
		private WebElement unamefield;
		@FindBy(xpath = "//input[@id='password']")
		private WebElement pwdfield;
		@FindBy(xpath = "//select[@id='user_type']")
		private WebElement usertypefield;
		@FindBy(xpath = "//button[@name='Create' and @type='submit']")
		private WebElement savebutton;
		@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
		private WebElement savealert;

		public AdminUserSet clickNewUserButton() {
			newbutton.click();
			return this;
		}

		public AdminUserSet enterUnameField(String newUname) {
			unamefield.sendKeys(newUname);
			return this;
	}
		public AdminUserSet enterPwdField(String newPasswrd) {
			pwdfield.sendKeys(newPasswrd);
			return this;
		}

		public AdminUserSet selectUsertype(String value) {
			general.selectDropdownWithValue(usertypefield, value);
			return this;
		}
	public AdminUserSet clickSaveButton() {
			savebutton.click();
			return this;
		}

		public boolean checkUserSaved() {
			return savealert.isDisplayed();

		}
	public AdminUserSet userCreationByUsingExcel() throws IOException {
			// String username1=ExcelUtility.getStringData(1, 0, "AdminUser");
			String password = ExcelUtility.getStringData(1, 1, "AdminUser");
			String usertype = ExcelUtility.getStringData(1, 2, "AdminUser");
			String username = faker.generateFirstName();
			unamefield.sendKeys(username);
			pwdfield.sendKeys(password);
			usertypefield.sendKeys(usertype);
			savebutton.click();
			return this;

		}
	
	}
