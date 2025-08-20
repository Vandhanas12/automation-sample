package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {
  @Test
  public void scriptSample() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://selenium.qabible.in/simple-form-demo.php");
	  WebElement singleinputfield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		
		singleinputfield.sendKeys("Hello");
		WebElement showmessagebutton=driver.findElement(By.xpath("//button[text()='Show Message']"));
				
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", showmessagebutton);
		js.executeScript("window.scrollBy(0,350)","");// 0 means x axis and 350 means y axis
		js.executeScript("window.scrollBy(0,-350)",""); //- value returns opposite direction
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)" );//scrollheight to adjust its height
		WebElement GetTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		js.executeScript("arguments[0].scrollIntoView()",GetTotalButton );
		driver.navigate().to("https://www.tpointtech.com/");
		js.executeScript("window.scrollBy(350,0)", "");
		//js.executeScript("window.scrollBy(-350,0)", "");
  }
}
