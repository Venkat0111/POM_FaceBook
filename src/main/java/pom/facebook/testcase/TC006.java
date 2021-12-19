package pom.facebook.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC006";
		testCaseDescription="To Verify facebook Signup for New User";
		author="Venkatesh";
		category="smoke";
		browser="chrome";
		appName="Facebook";
		
	}
	
	@Test
	public void facebookSignup() {
		
	new LoginPage(driver,test)
	
	.clickonCreateNewAccount()
	
	.enterFirstName("Venkatesh")
	
	.enterSurName("Vadduri")
	
	.enterEmail("venkateshvadduri99@gmail.com")
	
	.enterConfirmEmaill("venkateshvadduri99@gmail.com")
	
	.enterPassword("Test@123")
	
	.selectBirthDate("14")
	
	.selectBirthMonth("Dec")
	
	.selectBirthYear("1996")
	
	.clickonGender("radio")
	
	.clickonSubmit();
	
	}

}
