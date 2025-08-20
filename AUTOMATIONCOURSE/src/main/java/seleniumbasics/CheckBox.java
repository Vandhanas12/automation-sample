package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		if(!checkbox.isSelected())
		{
			checkbox.click();
		}
		else
		{
			checkbox.click();
		}
		//multi checkboxes
		List<WebElement>checkboxes=driver.findElements(By.xpath("//input@[class='check-box-list']"));
		for(WebElement i:checkboxes)
		{
			if(!i.isSelected())
			{
				i.click();
			}
			//findElement - to declare 1 WebElement
			//findElements - to declare more than 1 WebElement in a list/returns a list of multiple matching web elements
		}
	}

}
