package module8.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadPageObjects {

	
	@FindBy(linkText = "Previous Releases")
	WebElement clickOldVersion;
	
	public DownloadPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void ClickOldRelease() {
		
		clickOldVersion.click();
	}
	
}
