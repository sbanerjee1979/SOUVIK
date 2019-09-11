package module12;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class Screenshot1 {

    public static void main(String[] args) throws Exception {

    	System.setProperty("phantomjs.binary.path", "C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();

        try{
            driver.get("http://google.co.in");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
            driver.findElement(By.xpath("//*[@name='qaaa']")).sendKeys("test");
            System.out.println("Entered data in textfield");    

        }   
        catch (Exception e)
        {   	
      	
        /*	File SS = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        	FileUtils.copyFile(SS, new File("C:\\Users\\Nikasio\\git\\Edureka_5thAug\\Screenshot\\Screen"+System.currentTimeMillis()+".jpg"));
        	*/
        	
        	File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        	FileUtils.copyFile(ss, new File("C:\\Users\\Nikasio\\git\\Edureka_26thAugust\\Screenshot\\FailedTC"+System.currentTimeMillis()+".jpg"));
        	
        }  
    }  
}