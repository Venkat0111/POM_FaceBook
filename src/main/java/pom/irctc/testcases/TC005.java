package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC005";
		testCaseDescription="GST Validation";
		author="Venkatesh";
		category="smoke";
		browser="chrome";
		appName="IRCTC";
		
	}
	
	@Test
	public void hotelBookingGstValidation() {
		
		new CovidAlertPage(driver,test)
		
		.clickonOK()
		
		.mouseHoveronHolidays()
		
		.mouseHoveronStays()
		
		.clickonLounge()
		
		.switchtoNextwindow()
		
		.clickonMenu()
		
		.clickonHotels()
		
		.switchtoNextwindow()
		
		.clickonLogin()
		
		.clickonGuestUser()
		
		.enterEmail("venkateshvadduri@gmail.com")
		
		.enterMobile("8008195106")
		
		.clickonLogin()
		
		.enterCityName("Hyderabad")
		
		.clickonCity()
		
		.clickonCheckinCalander()
		
		.clickonCheckindate("19")
		
		.clickonCheckOutCalander()
		
		.clickonCheckOutDate("20")
		
		.clickonRoomandGuests()
		
		.selectNumOfRooms("1")
		
		.selectNumOfAdults("3")
		
		.clickonDone()
		
		.clickonFindHotels()
		
		.clickonDesiredHotel()
		
		.switchtoNextwindow()
		
		.getHotelNameText()
		
		.getHotelPriceText()
		
		.clickonBooking()
			
		.selectTitle("Mr")
		
		.enterFirstName("Venkatesh")
		
		.enterLastName("Vadduri")
		
		.selectCountry("India")
			
		.selectState("TELANGANA")
		
		.pageDown()
		
		.selectGst("Yes")
		
		.enterGstNumber("123456789")
		
		.enterCompanyName("HCL Technologies")
		
		.enterCompanyAddress("5-112,sholinganallur,Hyderabad")
		
		.clickonContinue1()
		
		.verifingGstText("Please Enter Valid GSt number");
		
	}
}
