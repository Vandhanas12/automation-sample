package automationcore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.beust.jcommander.Parameters;

import constant.Constant;
import utilities.ScreenshotUtility;

public class Base {

	
	public WebDriver driver;
	public Properties properties;
	public FileInputStream fis;
  @BeforeMethod(alwaysRun = true)

  public void initializeBrowser(String browzer) throws Exception {
	  try {
			properties = new Properties();
			fis = new FileInputStream(Constant.CONFIGFILE);
			properties.load(fis);

		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		}
		if (browzer.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browzer.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browzer.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			throw new Exception("invalid browser");
		}
	  //driver=new ChromeDriver();
	  driver.get(properties.getProperty("URL"));
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  

  @AfterMethod
  public void driverQuit(ITestResult iTestResult) throws IOException
  {
  if(iTestResult.getStatus()==ITestResult.FAILURE)
  {
  ScreenshotUtility screenShot=new ScreenshotUtility();
  screenShot.captureFailureScreenShot(driver, iTestResult.getName());
  }
  //driver.quit();

  }

}