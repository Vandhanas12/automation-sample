package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class WebElementsCommands extends Base{
public void locators() {
	WebElement showmessagebutton=driver.findElement(By.id("button-one"));
	WebElement classsample=driver.findElement(By.className("btn btn-primary"));
	WebElement tagsample=driver.findElement(By.tagName("button"));
	WebElement tagsample2=driver.findElement(By.tagName("input"));
	WebElement namesample=driver.findElement(By.name("viewport"));
	WebElement namesample2=driver.findElement(By.name("description"));
	WebElement linktextsample=driver.findElement(By.linkText("Simple Form Demo"));
	WebElement linktextsample2=driver.findElement(By.linkText("Ajax Form Submit"));
	WebElement partiallinktextsample=driver.findElement(By.partialLinkText("Simple Form "));
	WebElement partiallinktextsample2=driver.findElement(By.partialLinkText("Ajax Form"));
	WebElement xpathsample=driver.findElement(By.xpath("//input[@id='value-a']"));
	WebElement xpathsample2=driver.findElement(By.xpath("//a[@href='ajax-form-submit.php']"));
	WebElement xpathsample3=driver.findElement(By.xpath("//button[text()=Show Message"));
	WebElement xpathsample4=driver.findElement(By.xpath("//button[contains@id,'button one'("));
	WebElement xpathsample5=driver.findElement(By.xpath("//button[starts-with(text(),'Show'"));
	WebElement xpathsample6=driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card'"));
	WebElement xpathsample7=driver.findElement(By.className("//div[@class='card']//child::div[contains(text(),'Single Input Field')]"));
	WebElement CSSsample=driver.findElement(By.cssSelector("input#single-input-field"));
	WebElement CSSsample2=driver.findElement(By.cssSelector("input.form-control"));
	WebElement CSSsample3=driver.findElement(By.cssSelector("input[class=form-control]"));
	WebElement CSSsample4=driver.findElement(By.cssSelector("input.form-control[class=form-control]"));
	WebElement messagetotal=driver.findElement(By.xpath("//div[@id='message-two']"));
	String total=messagetotal.getText();
		System.out.println(total);
		boolean isshowmessagebuttondisplayed=showmessagebutton.isDisplayed();
		System.out.println(isshowmessagebuttondisplayed);
		boolean isshowmessagebuttonenabled=showmessagebutton.isEnabled();
		System.out.println(isshowmessagebuttonenabled);
		String backgroundcolorShowButton=showmessagebutton.getCssValue("background-color");
		System.out.println(backgroundcolorShowButton);
		int xAxis=showmessagebutton.getLocation().getX();
		System.out.println(xAxis);
		int yAxis=showmessagebutton.getLocation().getY();
		System.out.println(yAxis);
		
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		boolean ticked=checkbox.isSelected();
		System.out.println(ticked);
		checkbox.click();
		boolean ischeckboxselected=checkbox.isSelected();
		System.out.println(ischeckboxselected);
		
}
public void elementCommands() {
	WebElement singleinputfield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	singleinputfield.sendKeys("Variable");
	singleinputfield.clear();
	singleinputfield.sendKeys("Hello");
	WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='buton-one']"));
	showmessagebutton.click();
	WebElement message=driver.findElement(By.xpath("//div[@id='message-one']"));
	String yourmessage=message.getText();
	System.out.println(yourmessage);
	WebElement doubleinoutfieldA=driver.findElement(By.xpath("//input[@id='value-a']"));
	doubleinoutfieldA.sendKeys("9");
	WebElement doubleinoutfieldB=driver.findElement(By.xpath("//input[@id='value-b']"));
	doubleinoutfieldA.sendKeys("10");
	WebElement GetTotalButton=driver.findElement(By.xpath("//button[@id='button=two']"));
	GetTotalButton.click();
	WebElement messagetotal=driver.findElement(By.xpath("//div[@id='message-two']"));
	String total=messagetotal.getText();
	System.out.println(total);
	boolean isshowmessagebuttonisdisplayed=showmessagebutton.isDisplayed();
	
}
	public static void main(String[] args) {
		WebElementsCommands ec=new WebElementsCommands();
		ec.initialisebrowser();
		ec.elementCommands();
		

	}

}
