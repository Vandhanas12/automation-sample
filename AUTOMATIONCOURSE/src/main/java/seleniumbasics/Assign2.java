package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/radio-buttons-demo.php");
		WebElement radiobutton=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		boolean isradiobuttonselected= radiobutton.isSelected();
		System.out.println(isradiobuttonselected);
		
		WebElement showselectedvaluebutton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		showselectedvaluebutton.click();
		if(!radiobutton.isSelected())
		{
			radiobutton.click();
		}
		else
		{
			radiobutton.click();
		}
		WebElement female=driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		boolean isfemaleselected= female.isSelected();
		System.out.println(isfemaleselected);
		//WebElement PateintsAgeGroup=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		
		WebElement GetResults=driver.findElement(By.xpath("//button[@id='button-two']"));
		GetResults.click();
	}

}
