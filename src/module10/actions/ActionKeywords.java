package module10.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {

	public static WebDriver driver;
	
	public static void OpenBrowser() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		driver = new ChromeDriver();

		System.out.println("Browser Oppened Successfully");
	}
	
	public static void Navigate() {
		
		driver.get("https://www.google.com");
		
		System.out.println("AUT Oppened Successfully");
	}
	
	public static void ClickGmail() {
		
		driver.findElement(By.linkText("Gmail")).click();
		
		String Title = driver.getTitle();
		
		boolean result = Title.equals("Gmail - Free Storage and Email from Google");
		
		System.out.println(result);
	}
}
