package seleniumbasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait globally affect
		WebElement username=driver.findElement(By.xpath("//input[@id='loginform-username']"));
		username.sendKeys("caral");
		WebElement password=driver.findElement(By.xpath("//input[@id='loginform-password']"));
		password.sendKeys("1q2w3e4r");
		
		WebElement check=driver.findElement(By.xpath("//input[@id='loginform-rememberme']"));
		boolean ticked=check.isDisplayed();
		System.out.println(ticked);
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		WebElement alert=driver.findElement(By.xpath("////p[text()='Incorrect username or password.']"));
		System.out.println(alert.getText());
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.visibilityOf(alert));
		
		wait.until(ExpectedConditions.elementToBeClickable(login));
		
		FluentWait<WebDriver>fwait =new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		fwait.until(ExpectedConditions.elementToBeClickable(login));
				
		driver.switchTo().alert().accept();
		
		
	}

}
		