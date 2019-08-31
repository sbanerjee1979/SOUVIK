package module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		WebDriver driver = new ChromeDriver();
		
		// Open AUT
		driver.get("https://www.facebook.com");
		
		// Locators
			/* // ID
			driver.findElement(By.id("u_0_l")).sendKeys("Abhresh");
		
			// Name
			driver.findElement(By.name("lastname")).sendKeys("Sugandhi");
			
			Thread.sleep(3000);
			
			// ClassName
			driver.findElement(By.className("_8esa")).click();
		
			// LinkText
			driver.findElement(By.linkText("Forgotten account?")).click();
			
			//go to previous page
			driver.navigate().back();
						
			// Partial Linktext
			driver.findElement(By.partialLinkText("en ac")).click();
			
			// TagName
			List<WebElement> list = driver.findElements(By.tagName("a"));
			System.out.println(list.size());
			*/
		
			// CSS
			//driver.findElement(By.cssSelector("#u_0_6")).click();
			
			//driver.findElement(By.cssSelector("#content > div > div > div > div > div._5iyz.rfloat._ohf > div > div.pvl._52lp._59d- > div.mbs._52lq.fsl.fwb.fcb > span")).click();
		
			//Xpath
			driver.findElement(By.xpath("//*[@id=\"u_0_6\" or @id=\"u_0_9\"]")).click();
	
	}

}
