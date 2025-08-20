package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
  @Test
  public void verifyHardAssert() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://selenium.qabible.in/simple-form-demo.php");
	  WebElement singleinputfield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	  String input="hai";
		singleinputfield.sendKeys(input);
		singleinputfield.clear();
		singleinputfield.sendKeys("Hello");
		WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='buton-one']"));
		showmessagebutton.click();
		WebElement message=driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualresult=message.getText();
		String expectedresult="Your Message : "+input;
				Assert.assertEquals(expectedresult, actualresult,"Both are unequal");
				
				boolean isshowmessagebuttonisdisplayed=showmessagebutton.isDisplayed();
				Assert.assertTrue(isshowmessagebuttonisdisplayed,"Show message button is not avaiable");
				driver.navigate().to("https://selenium.qabible.in/radio-buttons-demo.php");
				WebElement radiobutton=driver.findElement(By.xpath("//input[@class='form-check-input']"));
				boolean isradiobuttonselected= radiobutton.isSelected();
				Assert.assertFalse(isradiobuttonselected,"Radio button is selected");
				
				String s=null;
				Assert.assertNull(s,"String is not null");
				String p="Amma";
				Assert.assertNotNull(p,"String is null");
				int x=10,y=20;
				Assert.assertNotEquals(x,y,"Equal");
				
  }
@Test

public void verifySoftAssert() {
	 WebDriver driver=new ChromeDriver();
	  driver.get("https://selenium.qabible.in/simple-form-demo.php");
	  WebElement singleinputfield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	  String input="hai";
		singleinputfield.sendKeys(input);
		WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='buton-one']"));
		showmessagebutton.click();
		WebElement message=driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualresult=message.getText();
		String expectedresult="Your Message : "+input;
		SoftAssert soft=new SoftAssert();
				soft.assertEquals(expectedresult, actualresult,"Messages are not equal");
				driver.navigate().to("https://selenium.qabible.in/radio-buttons-demo.php");
				WebElement radiobutton=driver.findElement(By.xpath("//input[@class='form-check-input']"));
				boolean isradiobuttonselected= radiobutton.isSelected();
				Assert.assertFalse(isradiobuttonselected,"Radio button is selected");
				soft.assertAll();
}
}


