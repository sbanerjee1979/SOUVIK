package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) {

		// Open browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2019/07/example-of-html-iframe-alternative.html");
		
		driver.switchTo().frame("ID_Frame1");
		
		driver.findElement(By.name("ts_first_name")).sendKeys("Abhresh");
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(2);
		
		driver.findElement(By.name("firstname")).sendKeys("Abhresh");
		
	}

}
