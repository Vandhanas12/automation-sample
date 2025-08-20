package seleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTagHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");//original/parent
		String parentwindow=driver.getWindowHandle();//to get current tabs using unique identifier
		System.out.println(parentwindow);
		WebElement newtab=driver.findElement(By.xpath("//button[@title='New Tab']"));
		newtab.click();
		Set<String>allwindows=driver.getWindowHandles();
		for(String v:allwindows)
		{
			if(!parentwindow.equals(v));
			{
				driver.switchTo().window(v);
		WebElement newtabwindow=driver.findElement(By.xpath("//h1[@class='mb-3 fw-normal border-bottom text-left pb-2 mb-4']"));
		System.out.println(newtabwindow.getText());
		String childwindow=driver.getWindowHandle();
		System.out.println(childwindow);
			}
		}
		driver.switchTo().window(parentwindow);
		
		
		}
		
		
		
		

	}


