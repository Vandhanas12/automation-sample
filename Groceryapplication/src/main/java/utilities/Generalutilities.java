package utilities;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Generalutilities {
	
	public String selectDropdownWithValue(WebElement element, String value) {
		Select object = new Select(element);
		object.selectByValue(value);
		WebElement selectedElement = object.getFirstSelectedOption();
		return selectedElement.getText();
	}//index,visibletext
	public void clickJavaScriptExecutor(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}//other js methods
	public int random(int limit) {
		Random random = new Random();
		// int limit = 1000;
		int randomNumber = random.nextInt(limit);
		return randomNumber;
	}
    public String generateCurrentDateAndTime() {
		Date date = new Date(0);
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyhhmmss");
		return formatter.format(date);
	}
    //dragdrop,alert
    public class DragandDrop {

    		WebDriver driver=new  ChromeDriver();
    WebElement sourceelement=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	WebElement targetelement=driver.findElement(By.xpath("//div[@id='mydropzone']"));
	Actions action=new Actions(driver);
	
}
    public class alert {
    	WebDriver driver=new  ChromeDriver();
    
    
    }
}
