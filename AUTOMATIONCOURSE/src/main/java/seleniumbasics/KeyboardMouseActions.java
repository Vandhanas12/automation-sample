package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseActions {
	

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		//to click clickme button
		WebElement clickme=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		//clickme.click();
		Actions obj=new Actions(driver);
		obj.click(clickme).perform();
		//to click rightclick button
		WebElement Rightclickme=driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
		obj.contextClick(Rightclickme).perform();
		//to click doubleclick button
		WebElement doubleclickme=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		obj.doubleClick(doubleclickme).perform();
		//mouse over to clickme
		obj.moveToElement(clickme).perform();
		//to work up and down arrow
		obj.sendKeys(Keys.ARROW_DOWN).perform();
		obj.sendKeys(Keys.ARROW_UP).perform();
		//from textbox to checkbox
		WebElement textbox=driver.findElement(By.xpath("//a[@href='text-box.php']"));
		obj.moveToElement(textbox).perform();
		obj.sendKeys(Keys.ARROW_DOWN).perform();
		
	}

}
