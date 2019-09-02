package module3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {

		// Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		WebDriver driver = new ChromeDriver();
		
		// PageLoad
		driver.manage().timeouts().pageLoadTimeout(350, TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com/");

		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// SetScript Timeout
		driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
		
		//sleep Wait command
		Thread.sleep(5000);
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");// 0-10 0
		driver.findElement(By.name("password")).sendKeys("tutorial");// 0-10 0
		driver.findElement(By.name("login")).click();// 0-10 - 5

		driver.findElement(By.linkText("PROFILE")).click();// 0-10 8

		driver.quit();

	}

}
