package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelsListPage extends GenericWrappers {
	
	public HotelsListPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public PreferredHotelPage clickonDesiredHotel() {
		
		clickByXpath(prop.getProperty("IrctcHotelsListPage.DesiredHotel.Xpath"));
		
		//clickByXpath("//div[@class='filtersearch-packages']");
		
		return new PreferredHotelPage(driver,test);
	}
	

}
