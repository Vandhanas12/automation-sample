package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		WebDriver driver=new  ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickme=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickme.click();
		driver.switchTo().alert().accept();//accept the msg
		
		WebElement clickme2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickme2.click();
		
		String message=driver.switchTo().alert().getText();//retrieve the msg from the alert
		System.out.println(message);
		driver.switchTo().alert().dismiss();//dismiss the msg
		WebElement clickpromptbox=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickpromptbox.click();
		driver.switchTo().alert().sendKeys("input");//give input in alert
		driver.switchTo().alert().accept();
	}

}
