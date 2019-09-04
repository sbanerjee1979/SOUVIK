package module5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("https://www.myntra.com/");

		//Search Jackets
		
		
		//Click on Search Button
		
		//Using Actions Class perform Hovering on the Element
		
	}

}
