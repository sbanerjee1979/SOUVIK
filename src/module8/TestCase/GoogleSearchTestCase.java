package module8.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module8.Page.GoogleHomePageObjects;
import module8.Page.SeleniumHomePageObjects;

public class GoogleSearchTestCase {

	public static WebDriver driver;

	public static void main(String[] args) {

		// Open Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		GoogleHomePageObjects page1 = new GoogleHomePageObjects(driver);
		
		page1.GoogleSearch("SeleniumHQ");
		page1.GoogleSearch("Abhresh Sugandhi");
		page1.GoogleSearch("Edureka");
		page1.GoogleSearch("EdurekaBlog");
		page1.GoogleSearch("SeleniumHQ");
		
		page1.ClickSelLink();
		
		SeleniumHomePageObjects page2 = new SeleniumHomePageObjects(driver);
		
		page2.GotoProjects();
		page2.GotoDownload();
		page2.GotoHome();
		
	}

}
