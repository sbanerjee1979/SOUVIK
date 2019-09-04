package module5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyboardMouseActions {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\geckodriver_0.24.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		/*Using Actions Class perform Keyboard Operations to Type into the text box
		 * and also perform right click and double click using mouse operations
		 */
			
	}

}






