package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Enabled {

	WebDriver driver;

	@Test(priority = 0)
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 1)
	public void OpenAUT() {
		driver.get("http://newtours.demoaut.com/");
	}

	@Test(priority = 4, enabled = false)
	public void Login() throws InterruptedException {

		// Enter UserID
		driver.findElement(By.name("userName")).sendKeys("tutorial");

		// Enter Password
		driver.findElement(By.name("password")).sendKeys("tutorial");

		// Click on Sign in button
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 2, dependsOnMethods = "Login", enabled = false)
	public void Logout() throws InterruptedException {
		// Click on Sign off
		driver.findElement(By.linkText("SIGN-OFF")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 6)
	public void ClickRegisterLink() {

		driver.findElement(By.linkText("REGISTER")).click();

	}

	@Test(priority = 7)
	public void ClickContactUsLink() {

		driver.findElement(By.linkText("CONTACT")).click();

	}

	@Test(priority = 8)
	public void ClickSupportLink() {

		driver.findElement(By.linkText("SUPPORT")).click();

	}

	@Test(priority = 9)
	public void ClickSignOnLink() {

		driver.findElement(By.linkText("SIGN-ON")).click();

	}

	@Test(priority = 20)
	public void CloseBrowser() {
		driver.close();
	}
}