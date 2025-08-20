package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	//fileupload using sendkeys

public class FileUpload {
	public WebDriver driver;
	public void fileOperations() {
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='file-upload']"));
		choosefile.sendKeys("C:\\Users\\admin\\Downloads\\RTM Report vandhana.pdf");
		WebElement upload=driver.findElement(By.xpath("//input[@id='file-submit']"));
		upload.click();
	}
	//fileupload using robotclass
	
	public void fileuploadusingRobotClass() throws AWTException {
		driver.get("https://www.ilovepdf.com/pdf_to_word%0A");
			driver.manage().window().maximize();
			WebElement submitpdf=driver.findElement(By.xpath("//a@id='pickfiles']"));
			submitpdf.click();
			StringSelection ss=new StringSelection("C:\\Users\\admin\\Downloads\\RTM Report vandhana.pdf");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); //copy process
			Robot robot=new Robot();
			robot.delay(500);
			robot.keyPress(KeyEvent.VK_CONTROL);//press  ctrl
			robot.keyPress(KeyEvent.VK_V);//press V
			robot.delay(500);
			robot.keyRelease(KeyEvent.VK_CONTROL);//release ctrl
			robot.keyRelease(KeyEvent.VK_V);//release V
			robot.delay(500);
			robot.keyPress(KeyEvent.VK_ENTER);//Enter Press
			robot.keyRelease(KeyEvent.VK_ENTER);//Release Enter
		
	}
	public static void main(String[] args) throws AWTException {
		FileUpload file=new FileUpload();
		file.fileOperations();
		file.fileuploadusingRobotClass();

	}

}
