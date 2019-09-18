package module11;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module10.base.BaseClass;

public class AutoIT extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {

		// Open browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		driver.findElement(By.name("photo")).click();

		Thread.sleep(15000);
		
		Runtime.getRuntime().exec("C:\\Users\\Nikasio\\git\\Edureka_26thAugustBatch\\AutoIT_Sikuli\\AutoITSample.exe");
				
		driver.findElement(By.partialLinkText("Test")).click();
		
		driver.quit();
		
		
	}

}
