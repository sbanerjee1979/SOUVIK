package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseActions {

	public static void main(String[] args) {

		// Open Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		WebDriver driver = new ChromeDriver();

		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");

		/*
		 * Using Actions Class perform Keyboard Operations to Type into the text box and
		 * also perform right click and double click using mouse operations
		 */

		WebElement Fname = driver.findElement(By.name("ts_first_name"));
		/*
		Actions act = new Actions(driver);

		act
		.keyDown(Fname, Keys.SHIFT)
		.sendKeys(" abhresh")
		.keyUp(Fname, Keys.SHIFT)
		.build()
		.perform();

		act
		.doubleClick(Fname)
		.contextClick(Fname)
		.build()
		.perform();
		*/
		
		Actions act = new Actions(driver);
		
		Action newAct = act
				.keyDown(Fname, Keys.SHIFT)
				.sendKeys(" abhresh")
				.keyUp(Fname, Keys.SHIFT)
				.build();

		newAct.perform();
		
	}

}
