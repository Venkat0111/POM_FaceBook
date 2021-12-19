package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC003";
		testCaseDescription="Charter Booking";
		author="Venkatesh";
		category="smoke";
		browser="chrome";
		appName="IRCTC";
		
	}
	
    @Test
	public void saloonCharter() {
		
		new CovidAlertPage(driver,test)
		
		.clickonOK()
		
		.mouseHoveronHolidays()
		
		.mouseHoveronStays()
		
		.clickonLounge()
		
		.switchtoNextwindow()
		
		.clickonMenu()
		
		.clickonCharter()
		
		.pageDown()
		
		.clickonEnquiryForm()
		
		.enterName("Venkatesh")
		
		.enterOrganisationName("HCL Technologies")
		
		.enterAddress("4-110,Immadisetty Vari Palem")
		
		.enterMobile("8008195")
		
		.enterEmail("venkateshvadduri99@gmail.com")
		
		.selectRequestFor("Saloon Charter")

		.enterOriginStation("Bapatla")
		
		.enterDestinationStation("Hyderabad")
		
		.clickonCheckInDateCalender()
		
		.clickonCheckInDate("19")
		
		.clickonCheckOutDateCalender()
		
		.clickonCheckOutDate("21")
			
		.enterDurationDays("3")
		
		.enterCoachDetails("4")
		
		.enterNumberOfPassengers("4")
		
		.enterPurposeOfCharter("Travelling")
		
		.enterAdditionalServices("Water Bottles and blankets")
		
		.clickonSubmit()
		
		.verifyMobileNumberNotValidMessage("Mobile no. not valid");
				
		}

}
