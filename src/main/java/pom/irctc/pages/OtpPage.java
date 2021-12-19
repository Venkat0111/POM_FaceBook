package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class OtpPage extends GenericWrappers {
	
	public OtpPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public OtpPage clickonVerifyOtp() {
		
		clickByXpath(prop.getProperty("IrctcOtpPage.VerifyOtp.Xpath"));
		
		return this;
	}
	
     public OtpPage verifyifOtprequiredMsgisDispayed(String data) {
		
		verifyTextByXpath(prop.getProperty("IrctcOtpPage.verifyifOtprequiredMsgisDispayed.Xpath"), data);
		
		return this;
	}
 
}
