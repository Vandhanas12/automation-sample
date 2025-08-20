package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		WebElement framename=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		driver.switchTo().frame(framename);
		
		WebElement frame1=driver.findElement(By.xpath("//img[@fetchpriority='high']"));
		System.out.println(frame1.getText());
		driver.switchTo().parentFrame();
		
	}

}
