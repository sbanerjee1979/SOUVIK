package module10.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public static void OpenBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikasio\\Documents\\GSync\\PCSync\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");	
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\Nikasio\\Documents\\GSync\\PCSync\\Installation_stuff\\BrowserDrivers\\geckodriver_0.24.exe");
				driver = new FirefoxDriver();
			}else if(browserName.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",
						"C:\\Users\\Nikasio\\Documents\\GSync\\PCSync\\Installation_stuff\\BrowserDrivers\\msedgedriver.exe");
				driver = new EdgeDriver();				
			}else if(browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\Nikasio\\Documents\\GSync\\PCSync\\Installation_stuff\\BrowserDrivers\\iedriverserver.exe");
				driver = new InternetExplorerDriver();
			}
		} 
		catch (WebDriverException e) {
			System.out.println(e.getMessage());
			}
		}
}