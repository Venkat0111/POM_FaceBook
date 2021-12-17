package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DP002 {
	
	@DataProvider(name = "fetchdata")
	public static String[][] getData(){
		
	String[][] testdata = null;
		
	try {
	    FileInputStream fis = new FileInputStream("./testdata/TC002.xlsx");
	    
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
	    
		XSSFSheet sheet  = wb.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum();
		
		int columncount = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Row count"+rowcount);
		
		System.out.println("column count"+columncount);
		
		 testdata = new String [rowcount][columncount];
		 
		 for(int i =1;i<=rowcount;i++) {
			 
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0;j<columncount;j++) {
				
				String celldata = row.getCell(j).getStringCellValue();
				
				System.out.println("The value of row "+(i-1)+" and column "+j+" is : "+celldata);
				
				testdata[i-1][j] = celldata;
			}
		 }
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return testdata;
		
	}

}
