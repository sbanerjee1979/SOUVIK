package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MDbox {

	public static void main(String[] args) throws InterruptedException {

		// Open browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		
			
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ' and @type='text']")).sendKeys("Edureka");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
