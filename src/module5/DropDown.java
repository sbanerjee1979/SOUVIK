package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {

		// Open Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		//Define the element
		WebElement DD = driver.findElement(By.name("continents"));
		
		//Call the select class and define the element on which we want to work for selecting options
		Select oSelect = new Select(DD);
		
		Thread.sleep(5000);
		
		//Using Visible Text - Africa
		oSelect.selectByVisibleText("Africa");
		
		Thread.sleep(5000);
		
		//Using Value - South America
		oSelect.selectByValue("e");

		Thread.sleep(5000);
		
		//Using Index - Antartica
		oSelect.selectByIndex(6);
		
		Thread.sleep(5000);
	}

}
