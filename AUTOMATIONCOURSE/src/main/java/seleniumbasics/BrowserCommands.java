package seleniumbasics;

public class BrowserCommands extends Base {
	public void browserCommands() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		String src=driver.getPageSource();
		System.out.println(src);
	}
	public void navigationCommands() {
		driver.navigate().to("https://www.facebook.com/");	
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		}

	public static void main(String[] args) {
		BrowserCommands bc=new BrowserCommands();
		bc.initialisebrowser();
		bc.browserCommands();
		bc.navigationCommands();

	}

}
