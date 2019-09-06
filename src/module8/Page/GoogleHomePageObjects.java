package module8.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageObjects {

	public GoogleHomePageObjects(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="q")
	WebElement searchtxt;
	
	@FindBy(partialLinkText = "Selenium - Web Browser Autom")
	WebElement ClickSel;
		
	public void GoogleSearch(String textInput) {
		
		searchtxt.clear();
		searchtxt.sendKeys(textInput);
		searchtxt.submit();
		
	}
	
	public void ClickSelLink() {
		
		ClickSel.click();
		
	}
	
}
