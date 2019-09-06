package module8.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module8.Page.DownloadPageObjects;
import module8.Page.SeleniumHomePageObjects;

public class TestDownloadPage {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.seleniumhq.org/");
		
		SeleniumHomePageObjects sh = new SeleniumHomePageObjects(driver);
		
		sh.GotoDownload();
		
		DownloadPageObjects sdp = new DownloadPageObjects(driver);
		
		sdp.ClickOldRelease();
		
		driver.navigate().back();
		
		sh.GotoHome();
	}

}
