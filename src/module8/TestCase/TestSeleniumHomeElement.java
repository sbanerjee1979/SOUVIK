package module8.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module8.Page.DownloadPageObjects;
import module8.Page.SeleniumHomePageObjects;


public class TestSeleniumHomeElement {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.seleniumhq.org/");
		
		SeleniumHomePageObjects page = new SeleniumHomePageObjects(driver);
		
		page.GotoProjects();
		
		page.GotoHome();
		
		page.GotoDownload();
		
		DownloadPageObjects page2 = new DownloadPageObjects(driver);
		
		page2.ClickOldRelease();
				
	}

}
