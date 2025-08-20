package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		WebDriver driver=new  ChromeDriver();
		driver.get("https://selenium.qabible.in/drag-drop.php");
		WebElement sourceelement=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement targetelement=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions action=new Actions(driver);//it is used for keyboard and mouse actions like drag and drop
		action.dragAndDrop(sourceelement, targetelement).perform();
		WebElement sourceelement1=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		WebElement targetelement1=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions action1=new Actions(driver);
		action.dragAndDrop(sourceelement1, targetelement1).perform();
		WebElement sourceelement2=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		WebElement targetelement2=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions action2=new Actions(driver);
		action.dragAndDrop(sourceelement2, targetelement2).perform();
		WebElement sourceelement3=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		WebElement targetelement3=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions action3=new Actions(driver);
		action.dragAndDrop(sourceelement3, targetelement3).perform();
		
		
	}

}
