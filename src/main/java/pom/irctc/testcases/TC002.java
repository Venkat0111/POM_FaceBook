package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC002";
		testCaseDescription="Book your Coach";
		author="Venkatesh";
		category="smoke";
		browser="chrome";
		appName="IRCTC";
		
	}
	
	@Test
	public void bookYourCoach() {
		
	new CovidAlertPage(driver,test)
	
	.clickonOK()
	
	.mouseHoveronHolidays()
	
	.mouseHoveronStays()
	
	.clickonLounge()
	
	.switchtoNextwindow()
	
	.clickonMenu()
	
	.clickonBookYourCoach()
	
	.switchtoNextwindow()
	
	.clickonFtrSignup()
	
	.enterUserid("Venky123")
	
	.enterPassword("Test@123")
	
	.enterConfirmPassword("Test@123")
	
	.selectSequrityQuestion("Who was your Childhood hero?")

	.enterSequrityAnswer("Pavan Kalyan")
	
	.clickonDateOfBirth()
	
	.selectYear("1996")
	
	.selectMonth("Dec")

	.clickonDay("14")
	
	.clickonGender("Male")
	
	.clickonMaritalStatus("UnMarried")
	
	.enterEmail("venkateshvadduri99@gmail.com")
	
	.selectOccupation("Professional")
	
	.enterFirstName("Venkatesh")
	
	.enterMiddleName("V")
	
	.enterLastName("Vadduri")
	
	.selectNationality("Indian")
	
	.enterFlatNo("4-110")
	
	.enterStreet("Immadisetty Vari Palem")
	
	.enterArea("Bapatla")
	
	.selectCountry("India")
	
	.enterMobile("8008195106")
	
	.enterPincode("522101")
	
	.pageDown()
	
	.selectCity("Guntur")

    .selectState("ANDHRA PRADESH")
    
    .selectPostOffice("Bapatla H.O")
    
    .clickonResidentialAddressasNo()
    
    .enterOfficeFlatNo("3-123")
    
    .enterOfficeStreet("Sholinganallur")

    .enterOfficeArea("Chennai")
    
    .selectOfficeCountry("India")
    
    .enterOfficeMobile("8008195112")
    
    .enterOfficePincode("600003")
    
    .pageDown()
    
    .selectOfficeCity("Chennai")
    
    .selectOfficeState("TAMIL NADU")
    
    .pageDown()
    
    .selectOfficePostOffice("Ripon Buildings S.O")
    
    .clickonCreateProfile();
			
	}

}
