package module11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;

public class Sikuli {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		
		// Open browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com");
		
		Screen s = new Screen();

		Pattern elm1 = new Pattern("C:\\Users\\Nikasio\\git\\Edureka_26thAugustBatch\\AutoIT_Sikuli\\file1.JPG");
		
		s.getScreen().click(elm1);
		
		Thread.sleep(5000);
		
		s.getScreen().type("C:\\Users\\Nikasio\\git\\Edureka_26thAugustBatch\\AutoIT_Sikuli\\file2.JPG", "Edureka");
		
	}

}
