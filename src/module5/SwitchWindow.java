package module5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {

		// Open Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		WebDriver driver = new ChromeDriver();

		// Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2019/04/new-window.html");

		// Part 1
		// Get the main window name
		String mw = driver.getWindowHandle();
		
		System.out.println("Main window name is:- "+ mw);
		System.out.println("=============================================================");

		// Part 2
		// Click on the button to open a new window
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		
		// Get the names of all the windows opened
		Set<String> awn = driver.getWindowHandles();
		
		System.out.println("All window name :- " + awn);
		System.out.println("=============================================================");

		// Part 3
		// Get all the window names and run them in the for loop
		for(String lawn : driver.getWindowHandles()) {

			driver.switchTo().window(lawn);

			//Thread.sleep(5000);

		}
		
		driver.close();
	}
}
