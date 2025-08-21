package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitutilities {
	public static int implicitwait_duration=10;
	public static int explicitwait_duration=20;
	public static int fluentwait_duration=3;
	public void fluentWaitElements(WebDriver driver, WebElement element, String attribute, String attributeValue,
			int total) {
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(total))
				.pollingEvery(Duration.ofSeconds(fluentwait_duration)).ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.attributeContains(element, attribute, attributeValue));
	}
	
		public void waitForWebElementAlert(WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitwait_duration));
			wait.until(ExpectedConditions.alertIsPresent());
		}//add another condition
		public void implicitWait(WebDriver driver)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitwait_duration));
		}
	}

