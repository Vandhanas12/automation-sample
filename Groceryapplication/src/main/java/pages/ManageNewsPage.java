package pages;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class ManageNewsPage {
	public WebDriver driver;
	public void AdminUserSet(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassociates.com/admin/list-news' and @class='small")private WebElement newsbutton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newbutton;
	@FindBy(xpath="//textarea[@placeholder='Enter the news']")private WebElement enternews;
	@FindBy(xpath="//button[@class='btn btn-danger']")private WebElement updatebutton;
	public void clickNewsButton() {
		newsbutton.click();
		}
		public void clickNewButton() {
			newbutton.click();
		}
		public void enterNews(String news)
		{
			enternews.sendKeys(news);
		}
		public void clickUpdateButton() {
			updatebutton.click();
		}
	}



