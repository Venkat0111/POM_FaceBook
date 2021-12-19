package pom.phptravels.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.PhpRegistration;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC007";
		testCaseDescription="Php Registration for New User";
		author="Venkatesh";
		category="smoke";
		browser="chrome";
		appName="PhpTravels";
		
	}
	@Test
	public void phpRegistration() {
		
	new PhpRegistration(driver,test)
	
	.enterFirstName("Venkatesh")
	
	.enterLastName("Vadduri")
	
	.enterEmail("Venkateshvadduri99@gmail.com")
	
	.clickonDailCode()
	
	.clickonCountryCode("+91")
	
	.enterPhoneNumber("8008195106")
	
	.enterCompanyName("HCL Technologies")
	
	.enterStreet1("4-110")
	
	.enterStreet2("Immadisetty vari Palem")
	
	.enterCity("Bapatla")
	
	.enterState("Andhra Pradesh")
	
	.enterPostCode("522101")
	
	.selectCountry("India")
	
	.enterMobile("8008195106")
	
	.enterPassword("Test@123")
	
	.enterConfirmPassword("Test@123")
	
	.clickonGeneratepassword();
	
	}

}
