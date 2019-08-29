package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumCommands {

	public static void main(String[] args) {
	
		/*
		  Multi Line Comment
		  This class is going to describe some of the most common
		  and basic commands used in selenium during 
		  your testing process
		 */

		//Single Line Comment
		
		//Instantiate a Browser or Open Browser
		//Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		WebDriver driver = new ChromeDriver();
		
		//Close and Quit
		driver.close();// this will close the current active window during this instance
		driver.quit();// this will close the chromedriver.exe and all the windows during this instance
		
		//Get Commands
		driver.get("URL");// this is used to open the URL of the AUT
		driver.getCurrentUrl();// this will get the current URL of the current Page
		driver.getTitle();// to get the title of the current page
		
		//Navigation Commands
		driver.navigate().back();// to go the previous page of the history
		driver.navigate().forward();// to go the next page of the history
		driver.navigate().refresh();// to refresh the page
		
		//Element Handling
		driver.findElement(By.id("")).click();// to click 
		driver.findElement(By.id("")).sendKeys("Abhresh");// to type the text
		driver.findElement(By.id("")).getText();// to get the text from the page
		driver.findElement(By.id("")).clear();// to erase the data from the text box

	}
}