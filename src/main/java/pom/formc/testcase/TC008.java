package pom.formc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC008";
		testCaseDescription="FormC Registration for New User";
		author="Venkatesh";
		category="smoke";
		browser="chrome";
		appName="FormC";
		
	}
	
	@Test
	public void formcUserRegistration() {
		
	new HomePage(driver,test)
	
	.clickonSignup()
	
	.enterUserId("Venky123")
	
	.enterPassword("Test@123")
	
	.enterConfirmPassword("Test@123")
	
	.selectSequrityQuestion("What is the name of your favorite book?")
	
	.enterSequrityAnswer("The War Iam In")
	
	.enterName("Venkatesh")
	
	.selectGender("Male")
	
	.enterDateOfBirth("14/12/1996")

	.enterDesignation("Senior Analyst")
	
	.enterEmail("venkateshvadduri99@gmail.com")
	
	.enterMobile("8008195106")
	
	.enterPhoneNumber("8008195106")
	
	.selectCountry("INDIA")
	
	.enterHotelName("LotusPond")
	
	.enterCapacity("4")
	
	.enterAddress("4-110,Immadisetty Vari Palem,Bapatla")
	
	.selectState("ANDHRA PRADESH")
	
	.selectCity("GUNTUR")
	
	.selectFrro("FRO GUNTUR URBAN")
	
	.selectHotelAccomodationType("Hotel")
	
	.selectHotelAccomodationGrade("Five Star")
	
	.enterHotelEmailid("Test123@gmail.com")
	
	.enterHotelMobileNumber("8008195106")
	
	.enterHotelPhoneNumber("1234567890")
	
	.enterOwnerName1("Ram")
	
	.enterOwnerAddress1("4-111,Vivekanandha Colony")
	
	.selectOwnerState1("ANDHRA PRADESH")
	
	.selectOwnerCity1("15D")
	
	.enterOwnerEmailid1("rampo@gmail.com")
	
	.enterOwnerPhoneNumber1("12312312354")
	
	.enterOwnerMobileNumber1("1231231234")
	
	.clickonAdd()
	
    .enterOwnerName2("Sam")
	
	.enterOwnerAddress2("4-112,Sharadha Colony")
	
	.selectOwnerState1("ANDHRA PRADESH")
	
	.selectOwnerCity1("17D")
	
	.enterOwnerEmailid1("sampo@gmail.com")

	.enterOwnerPhoneNumber1("12312312356")
	
	.enterOwnerMobileNumber1("1231231256")
	
	.clickonAdd2()
	
    .enterOwnerName3("Ramesh")
	
	.enterOwnerAddress3("4-123,Nalandha Colony")
	
	.selectOwnerState1("ANDHRA PRADESH")
	
	.selectOwnerCity1("19D")
	
	.enterOwnerEmailid1("ramesh@gmail.com")
	
	.enterOwnerPhoneNumber1("1231231267")
	
	.enterOwnerMobileNumber1("1231231267")
	
	.clickonAdd3();
	
	
	
	
	
	
		
	}
}
