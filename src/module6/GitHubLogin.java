package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GitHubLogin {

	WebDriver driver;
	
	@BeforeSuite
	public void OpenBrowser() {
		// Open Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		driver = new ChromeDriver();
	}

	@BeforeTest
	public void OpenAUT() {

		driver.get("https://github.com/");
		
	}
	
	@Test
	public void Login() throws InterruptedException {

		driver.findElement(By.xpath("//*[@href='/login']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("login_field")).sendKeys("tabhresh@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("edureka123");
		
		driver.findElement(By.name("commit")).click();

	}

	@AfterTest
	public void Logout() throws InterruptedException {

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']")).click();
		
		driver.findElement(By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']//following::button[15]")).click();
				
	}

	@AfterSuite
	public void CloseTestCase() throws InterruptedException {

		Thread.sleep(3000);
		
		driver.quit();	
	}

	@BeforeClass
	public void URLValidation() {
		
		String URL = driver.getCurrentUrl();
		boolean Result = URL.equals("https://github.com/");
		System.out.println(Result);
	}	
}
