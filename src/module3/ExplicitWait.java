package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		// Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		WebDriver driver = new ChromeDriver();
		
		// Open AUT
		driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/waitcommands.html");

		//driver.findElement(By.linkText("LinkText-5")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		  
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-5"))).click();
		
		
		driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/waitcommands.html");

		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		
		wait1.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-6"))).click();
				
	}
}
