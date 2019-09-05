package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("https://www.myntra.com/");

		//Search Jackets
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("Jackets");
		
		//Click on Search Button
		driver.findElement(By.xpath("//*[@class='desktop-submit']")).click();
		
		//Using Actions Class perform Hovering on the Element
		
		WebElement Mh = driver.findElement(By.xpath("//img[@title=\"Roadster Men Black Solid Tailored Jacket\"]"));
		
		Actions Act = new Actions(driver);
		
		Act.moveToElement(Mh).perform();
	}

}
