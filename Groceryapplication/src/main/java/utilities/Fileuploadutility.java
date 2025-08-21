package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadutility {
	public  void FileUploadUsingSendkeys (WebElement element,String filepath)
	{
		
		element.sendKeys(filepath);
		}
	
			//fileupload using robotclass
		
		public void fileuploadusingRobotClass(WebElement element,String filepath) throws AWTException {
			
				
				element.click();
				StringSelection ss=new StringSelection(filepath);
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
		}