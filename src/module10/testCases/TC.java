package module10.testCases;

import module10.actions.ActionKeywords;
import module10.utility.ExcelUtility;

public class TC {

	public static void main(String[] args) throws Exception {

		String path = "C:\\Users\\Nikasio\\git\\Edureka_26thAugustBatch\\src\\module10\\testData\\MyDataEngine.xlsx";
		
		ExcelUtility.excelSetup(path, "Sheet1");
		for(int i=0; i<4; i++) 
		{
			String kw = ExcelUtility.getData(i, 1);
			if(kw.equals("OpenBrowser"))
			{
				ActionKeywords.OpenBrowser();
			}
			else if (kw.equals("Navigate"))
			{
				ActionKeywords.Navigate();
			}
			else if(kw.equals("ClickGmail"))
			{
				ActionKeywords.ClickGmail();
			}
		}
	}

}
