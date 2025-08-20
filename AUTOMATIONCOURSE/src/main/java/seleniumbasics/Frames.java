package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Frames {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		//driver.switchTo().frame("frame1");//switch to frame from main page using id
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(iframe);//switching using webelement
		
		WebElement frame=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(frame.getText());
	
		driver.switchTo().parentFrame();//switch back to parent frame
		//driver.switchTo().defaultContent();

	}

}
