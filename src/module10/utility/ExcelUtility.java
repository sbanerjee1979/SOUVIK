package module10.utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	static Workbook wb;
	static Sheet sh;
	
	public static void excelSetup(String path, String sheetName) throws Exception {
		
		FileInputStream fis = new FileInputStream(path);
		
		wb =  WorkbookFactory.create(fis);
		
		sh = wb.getSheet(sheetName);
		
	}
	
	public static String getData(int numrow, int numcol) {
		
		String data = sh.getRow(numrow).getCell(numcol).toString();
		
		return data;
	}
}
