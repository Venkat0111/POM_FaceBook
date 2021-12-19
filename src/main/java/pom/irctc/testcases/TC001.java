package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC001";
		testCaseDescription="IRCTC Registration for New User";
		author="Venkatesh";
		category="smoke";
		browser="chrome";
		appName="IRCTC";
		
	}
	
    @Test
	public void irctcRegistaration() {
		
	new CovidAlertPage(driver,test)
	
	.clickonOK()
	
	.clickonRegister()
	
	.enterUserName("Venky123")
	
	.enterPassword("Test@123")
	
	.enterConfirmPassword("Test@123")
	
	.clickonPreferedLanguage()
	
	.clickonLanguage("English")
	
	.clickonSecurityQuestion()
	
	.clickonQuestion("Who was your Childhood hero?")
	
	.enterSecurityAnswer("Pavan Kalyan")
	
	.clickonContinue()
	
	.enterFirstName("Venkatesh")
	
	.enterMiddleName("V")
	
	.enterLastName("Vadduri")
	
	.clickonOccupation()
	
	.clickonYourOccupation("PROFESSIONAL")
	
	.enterDateOfBirth("14-12-1996")
	
	.clickonDate()
	
	.clickonMaritalStatus("Unmarried")
	
	.selectCountry("India")
	
	.clickonGender("Male")
	
	.enterEmail("venkateshvadduri@gmail.com")
	
	.enterMobile("8008195567")
	
	.selectNationality("India")
	
	.clickonContinue1()
	
	.enterResidentialAddress1("4-110")
	
	.enterResidentialAddress2("Immadisetty Vari Palem")
	
	.enterResidentialAddress3("Bapatla")
	
	.enterResidentialPincode("522101")
	
	.enterResidentialState("ANDHRA PRADESH")
	
	.selectResidentialCity("Guntur")
	
	.selectResidentialPostOffice("Bapatla H.O")
	
	.enterResidentialPhone("8008195106")
	
	.clickonCopyResidencetoOfficeAddress()
	
	.enterOfficeAddress1("4-112")
	
	.enterOfficeAddress2("Sholinganallur")
	
	.enterOfficeAddress3("Chennai")
	
	.clickonCountry1()
	
	.clickonCountryOption("India")
	
	.enterOfficePincode("600001")
	
	.pageDown()
	
	.enterOfficeState("Tamil Nadu")
	
	.enterOfficeCity("Chennai")
	
    .enterOfficePostOffice("Edapalayam S.O")
	
	.enterOfficePhone("8008195112")
	
	.clickonCreditCardInformation()
	
	.clickonTermsandConditions()
	
	.clickonRegister();
			
	}
}
