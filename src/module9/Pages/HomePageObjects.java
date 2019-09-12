package module9.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {

	
	@FindBy(name = "ts_first_name")
	@CacheLookup
	WebElement FName;
	
	@FindBy(name = "ts_last_name")
	@CacheLookup
	WebElement LName;
	
	@FindBy(name = "ts_address")
	@CacheLookup
	WebElement Address;
	
	public HomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void FormFill(String fName, String lName, String Add) throws Exception {
		
		FName.clear();
		FName.sendKeys(fName);
		
		LName.clear();
		LName.sendKeys(lName);
		
		Address.clear();
		Address.sendKeys(Add);
		
		Thread.sleep(5000);
	}	
}
