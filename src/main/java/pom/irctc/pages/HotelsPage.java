package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelsPage extends GenericWrappers {
	
	public HotelsPage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
		
	}
	
    public HotelsPage switchtoNextwindow() {
    	 
    	 switchToLastWindow();
    	 
    	 return this;
     }
	
	public UserLoginPage clickonLogin() {
		
		clickByXpath(prop.getProperty("IrctcHotelsPage.Login.Xpath"));
		
		return new UserLoginPage(driver,test);
	}
	
	
	public HotelsPage enterCityName(String data) {
		
		enterByXpath(prop.getProperty("IrctcHotelsPage.CityName.Xpath"), data);
		
		return this;
	}
	
   public HotelsPage clickonCity() {
		
	   clickByXpath(prop.getProperty("IrctcHotelsPage.City.Xpath"));
		
		return this;
	}
	
	
    public HotelsPage clickonCheckinCalander(){
		
		clickByXpath(prop.getProperty("IrctcHotelsPage.CheckinCalander.Xpath"));
		
		return this;
	}
	
     public HotelsPage clickonCheckindate(String Date){
		
		clickByXpath(prop.getProperty("IrctcHotelsPage.Checkindate.Xpath"),Date);
		
		return this;
	}
	
 
     public HotelsPage clickonCheckOutCalander() {
	
    	 clickByXpath(prop.getProperty("IrctcHotelsPage.CheckOutCalander.Xpath"));
 		
 		return this;
   }
     
     public HotelsPage clickonCheckOutDate(String Date){
 		
 		clickByXpath(prop.getProperty("IrctcHotelsPage.CheckOutDate.Xpath"),Date);
 		
 		return this;
 	}
 	

     public HotelsPage clickonRoomandGuests(){
  		
  		clickByXpath(prop.getProperty("IrctcHotelsPage.RoomandGuests.Xpath"));
  		
  		return this;
  	}
  	

     public HotelsPage selectNumOfRooms(String data){
  		
  		selectvisibletextbyxpath(prop.getProperty("IrctcHotelsPage.NumOfRooms.Xpath"), data);
  		
  		return this;
  	}
  	

     public HotelsPage selectNumOfAdults(String data){
   		
   		selectvisibletextbyxpath(prop.getProperty("IrctcHotelsPage.NumOfAdults.Xpath"), data);
   		
   		return this;
   	}
     
     public HotelsPage clickonDone() {
    	 
    	 clickByXpath(prop.getProperty("IrctcHotelsPage.Done.Xpath"));
   		
   		return this;
   	}
     
   public HotelsListPage clickonFindHotels() {
    	 
    	 clickByXpath(prop.getProperty("IrctcHotelsPage.FindHotels.Xpath"));
   		
   		return new HotelsListPage(driver,test);
   	}
	

}
