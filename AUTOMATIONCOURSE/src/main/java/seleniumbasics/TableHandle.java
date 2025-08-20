package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandle extends Base{

	public void tablereaddata() {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tabledata=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		
	}
	public void particularRow() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//to locate the webelement of particular row we use /tbody/tr(table row)after the xpath of table
		WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));
		System.out.println(row.getText());
		
		
	}
	
	public void particularData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement data=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[2]"));
		System.out.println(data.getText());
	}
	public void columnData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> column=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement element:column)
		{
			System.out.println(element.getText());	
		}
	}
	public void searchData() {//search the data present in the table or not
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input=	"Accountant1";
		List<WebElement> searchdata =driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		int flag = 0;
		for(WebElement search:searchdata)
		{
			if(search.getText().equals(input))
			{
				System.out.println(search.getText());
				flag=1;
				break;
			}
			
		}
		if(flag==1)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Not found");
			
			
		}
	}
	public void headings() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement head=driver.findElement(By.xpath("\"//table[@id='dtBasicExample']//thead"));
		System.out.println(head.getText());
	}
	
	
	public static void main(String[] args) {
		TableHandle table =new TableHandle();
		table.initialisebrowser();
		table.tablereaddata();
		System.out.println("**********");
		table.particularRow();
		System.out.println("**************");
		table.particularData();
		System.out.println("***************");
		table.columnData();
		System.out.println("*****************");
		table.searchData();
		System.out.println("**********************");
		table.headings();
	}

}
