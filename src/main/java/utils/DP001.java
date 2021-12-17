package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DP001 {

	  @DataProvider(name = "fetchdata")
	public static String[][] getData(){
		
		   String[][] testData = null;
		
	/*	testData[0][0] = "venkatesh";
		testData[0][1] = "vadduri";
		testData[0][2] = "venkateshvadduri@gmail.com";
		testData[0][3] = "venkateshvadduri@gmail.com";
		
		testData[1][0] = "mahesh";
		testData[1][1] = "vadduri";
		testData[1][2] = "maheshvadduri@gmail.com";
		testData[1][3] = "maheshvadduri@gmail.com"; */
		
		    try {
			
			FileInputStream fis = new  FileInputStream("./testData/TC001.xlsx");
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = wb.getSheetAt(0);
			
			int rowcount = sheet.getLastRowNum();  
			
			int columncount = sheet.getRow(0).getLastCellNum();
			
			System.out.println("rowcount"+ rowcount);
			
			System.out.println("columncount"+ columncount);
			
			testData = new String[rowcount][columncount];
			
			for(int i=1;i<=rowcount;i++) {
				
			XSSFRow row = sheet.getRow(i);
				
		    for(int j=0;j<columncount;j++) {
		    	
		    String celldata = row.getCell(j).getStringCellValue();
		    	
		    System.out.println("The value of row "+(i-1)+" and the column "+(j)+" is : "+celldata);
		    	
		    testData[i-1][j] = celldata;
		    
     }
		    
}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return testData;
		
	}
}
