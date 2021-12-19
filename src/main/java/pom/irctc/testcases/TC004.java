package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC004  extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC004";
		testCaseDescription="To Verify OTP Validation";
		author="Venkatesh";
		category="smoke";
		browser="chrome";
		appName="IRCTC";
		
	}
	
	@Test
	public void hotelBookingOtpValidation() {
		
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
    
	.selectGst("No")

	.verifingHotelName("Treebo Trend Acsys")
	
	.verifingHotelPrice("₹ 4013")
	
	.clickonContinue()
	
	.clickonIAgree()
	
	.clickonMakePayment()
	
	.clickonVerifyOtp()
	
	.verifyifOtprequiredMsgisDispayed("otp is required.");
	
		
	}

}
