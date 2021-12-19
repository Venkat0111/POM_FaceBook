package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Log;

public class SampleReport {
	
	@Test
	public void generateReport() {
		
		//Start Report
		ExtentReports report = new ExtentReports("./reports/Result.html",false);
		
		
		//Start Test
		ExtentTest test = report.startTest("TC001", "To Verify IRCTC Registration");
		
		test.assignAuthor("Venkatesh");
		test.assignCategory("functional");
		
		//log Steps
		test.log(LogStatus.PASS, "The browser is launched with given url");
		test.log(LogStatus.PASS, "The browser is launched with given url");
		test.log(LogStatus.PASS, "The browser is launched with given url");
		test.log(LogStatus.PASS, "The browser is launched with given url");
		test.log(LogStatus.PASS, "The browser is launched with given url");
		test.log(LogStatus.PASS, "The browser is launched with given url");
		test.log(LogStatus.PASS, "The browser is launched with given url");
		test.log(LogStatus.PASS, "The browser is launched with given url");
		
		//End Test
		report.endTest(test);
		
		//End Report
		report.flush();
		
	}

}
