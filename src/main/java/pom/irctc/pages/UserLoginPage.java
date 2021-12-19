package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class UserLoginPage extends GenericWrappers {
	
	public UserLoginPage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
		
	}
 
	
   public UserLoginPage clickonGuestUser() {
		
		clickByXpath(prop.getProperty("IrctcUserLoginPage.GuestUser.Xpath"));
		
		return this;
	}

  public UserLoginPage enterEmail(String data) {
		
		enterByXpath(prop.getProperty("IrctcUserLoginPage.Email.Xpath"), data);
		
		return this;
	}
	
   public UserLoginPage enterMobile(String data) {
		
		enterByXpath(prop.getProperty("IrctcUserLoginPage.Mobile.Xpath"), data);
		
		return this;
	}
	
   public HotelsPage clickonLogin() {
	   
	   clickByXpath(prop.getProperty("IrctcUserLoginPage.Login.Xpath"));
	   
	   return new HotelsPage(driver,test);
}

}
