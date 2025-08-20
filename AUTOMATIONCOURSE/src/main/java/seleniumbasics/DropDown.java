package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

		//single dropdown
public class DropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input-demo.php");
		WebElement singledropdown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(singledropdown);
		select.selectByIndex(2);
		WebElement element=select.getFirstSelectedOption();
		System.out.println(element.getText());;

		select.selectByValue("Red");
		WebElement element1=select.getFirstSelectedOption();
		System.out.println(element1.getText());
		
		select.selectByVisibleText("Green");
		WebElement element2=select.getFirstSelectedOption();
		System.out.println(element2.getText());
		
		//multi dropdown
		
		WebElement mulidropdown=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select multiselect=new Select(mulidropdown);
		/*for(int i=0;i<3;i++)
		 {
		 multiselect.selectByIndex(i);
		 }*/
		multiselect.selectByIndex(0);
		multiselect.selectByIndex(2);
		List<WebElement>multilist=multiselect.getAllSelectedOptions();
		for(int i=0;i<multilist.size();i++)
		{
			System.out.println(multilist.get(i).getText());
		}
		
		
	}

}
