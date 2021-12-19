package pom.formc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	public HomePage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	
	public RegistrationPage clickonSignup() {
		
		clickByXpath(prop.getProperty("FormCHomePage.Signup.XPath"));
		
		return new RegistrationPage(driver,test);
	}

}
