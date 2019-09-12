package module9.TestCase;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import module9.Pages.HomePageObjects;

public class DDT {

	WebDriver driver;
	Workbook wb;
	Sheet sh;
	int numrows;
	int numcols;
	
	
	@BeforeSuite
	public void Setup() {		
		// Open Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
	}
	
	@AfterSuite
	public void QuitProcess() {
		
		driver.quit();
	}
	
	@Test(dataProvider = "testDataFeed")
	public void FormFill(String fName, String lName, String Add) throws Exception{
		
		HomePageObjects fp = new HomePageObjects(driver);
		
		fp.FormFill(fName, lName, Add);
	}
	
	@DataProvider
	public Object[][] testDataFeed() throws Exception{
		
		//To define the path of the file
		FileInputStream fis = new FileInputStream("C:\\Users\\Nikasio\\git\\Edureka_26thAugustBatch\\src\\module9\\TestData\\TestData.xlsx");
		
		//To open the file
		wb = WorkbookFactory.create(fis);
		
		//To define which sheet you want to read
		sh = wb.getSheet("Sheet1");
		
		//what is the max count of rows & columns
		numrows = sh.getLastRowNum()+1;//9+1=10
		
		numcols = sh.getRow(0).getLastCellNum();//3
		
		Object[][] formData = new Object[numrows][numcols];
		
		//run a for loop to read the data and pass it to the @dataprovider annotation container
		
		for(int row=0; row<numrows; row++) 
		{
			for(int col=0; col<numcols; col++) 
			{
				//fetch the data from each cell and place them into the container of my @dataprovider annotation
				
				formData[row][col]=sh.getRow(row).getCell(col).toString();
			}
		}
		return formData;
		
	}	
}







