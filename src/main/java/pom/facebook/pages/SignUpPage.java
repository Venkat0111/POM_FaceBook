package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SignUpPage extends GenericWrappers {
	
	public SignUpPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		
		this.test=test;
	}
	
	public SignUpPage enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("FacebookSignUpPage.FirstName.XPath"), data);
		
		return this;
		
	}
	
   
	public SignUpPage enterSurName(String data) {
		
		enterByXpath(prop.getProperty("FacebookSignUpPage.SurName.XPath"), data);
		
		return this;
	}
	
	
	
	public SignUpPage enterEmail(String data) {
		
		enterByXpath(prop.getProperty("FacebookSignUpPage.Email.XPath"), data);
		
		return this;
		
	}
	
	public SignUpPage enterConfirmEmaill(String data) {
		
		enterByXpath(prop.getProperty("FacebookSignUpPage.ConfirmEmail.XPath"), data);
		
		return this;
		
	}
	
	public SignUpPage enterPassword(String data) {
		
		enterByXpath(prop.getProperty("FacebookSignUpPage.Password.XPath"), data);
		
		return this;
	}
	
	public SignUpPage selectBirthDate(String String) {
		
		selectvisibletextbyxpath(prop.getProperty("FacebookSignUpPage.BirthDate.XPath"), String);
		
		return this;
		
		
	}
	
	public SignUpPage selectBirthMonth(String String ) {
		
		selectvisibletextbyxpath(prop.getProperty("FacebookSignUpPage.BirthMonth.XPath"), String);
		
		return this;
	}
	
	public SignUpPage selectBirthYear(String String) {
		
		selectvisibletextbyxpath(prop.getProperty("FacebookSignUpPage.BirthYear.XPath"), String);
		
		return this;
	}
	
	public SignUpPage clickonGender(String gender) {
		
		clickByXpath(prop.getProperty("FacebookSignUpPage.Gender.XPath"),gender);
		
		//clickByXpath(prop.getProperty("//label[text()='$gender$']"));
		
		return this;
	}
	
	public SignUpPage clickonSubmit() {
		
		clickByXpath(prop.getProperty("FacebookSignUpPage.Submit.XPath"));
		
		return this;
		
	}
	
}
