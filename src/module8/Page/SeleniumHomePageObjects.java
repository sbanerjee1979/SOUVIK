package module8.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumHomePageObjects {

	@FindBy(linkText = "Download")
	WebElement clickDownload;
	
	@FindBy(linkText = "Projects")
	WebElement clickProjects;

	@FindBy(linkText = "Browser Automation")
	WebElement clickHome;

	public SeleniumHomePageObjects(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void GotoDownload() {
		clickDownload.click();
	}
	
	public void GotoProjects() {
		clickProjects.click();
	}

	public void GotoHome() {
		clickHome.click();
	}

}
