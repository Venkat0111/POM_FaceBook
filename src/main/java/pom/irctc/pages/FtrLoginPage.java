package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrLoginPage extends GenericWrappers {
	
	public FtrLoginPage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver=driver;
	    this.test=test;	
	}
	
	public FtrLoginPage switchtoNextwindow() {
		
		switchToLastWindow();
		
		return this;
	}
	
	public FtrRegistrationpage clickonFtrSignup() {
		
		clickByXpath(prop.getProperty("IrctcFtrLoginPage.FtrSignup.Xpath"));
		
		return new FtrRegistrationpage(driver,test);
	}

}
