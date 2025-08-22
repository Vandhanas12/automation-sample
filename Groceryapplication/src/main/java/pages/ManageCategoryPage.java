package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumbasics.Base;


public class ManageCategoryPage extends Base{
	public WebDriver driver;
	public void AdminUserSet(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newbutton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchbutton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']")private WebElement resetbutton;
	@FindBy(xpath ="//input[@placeholder='Category']")private WebElement enterSearchData;
	public void clickNewButton() {
		newbutton.click();
		}
		public void clickSearchButton() {
			searchbutton.click();
		}
		public void clickResetButton() {
			resetbutton.click();
			}
		public boolean showNoDataFound() {
			
			return false;
		}
		public void enterSearchData(String search) {
			{
				enterSearchData.sendKeys(search);
			}
			
		}
		
			
		}
		
			
		
			

