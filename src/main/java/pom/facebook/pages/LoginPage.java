package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers {
	
	public LoginPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	

	public SignUpPage clickonCreateNewAccount() {
		
		clickByXpath(prop.getProperty("FacebookLoginPage.CreateNewAccount.XPath"));
		
		return new SignUpPage(driver,test);
	}
	
}
