package testcases;



import org.junit.Test;

import wrappers.GenericWrappers;

public class TC008 extends GenericWrappers {
	
	@Test
	public void otpValidation() {
		
		invokeApp("chrome", " https://www.irctc.co.in/nget/train-search");
    	
	    clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");	
		
		clickByLink("HOLIDAYS");	
			
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]");
		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span");
			
		switchToLastWindow();	
		
		clickByXpath("/html/body/app-root/accommodation/div[2]/div[1]/ul/li[2]/a");
		
		switchToLastWindow();
		
		clickByLink("Login");
		
		clickByLink("Guest User Login");
		
		enterByName("email", "venkateshvadduri@gmail.com");
		
		enterByName("mobileNo", "8008195106");
		
		clickByXpath("//*[@id=\"profile\"]/div/form/div[3]/button");
		
		enterByXpath("//*[@id=\"filterText\"]", "hyderabad");
		
		clickByXpath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[1]/searchbox/div/ul/li[1]/a");
		
		clickByName("dt12");
		
		clickByXpath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[1]/td[3]/span");
		
		waitproperty(3000);
		
		clickByName("dt13");
		
		clickByXpath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[1]/td[4]/span");
		
		clickById("user-data-wrapper-id");
	
		selectVisibileTextByname("hotelRoom", "1");
		
		selectVisibileTextByname("hotelAdult", "3");
		
		waitproperty(2000);
		
		clickByXpath("//*[@id=\"user-data-wrapper\"]/div[2]/button");
		
		clickByXpath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[5]/button");
		
		waitproperty(2000);
		
		clickByXpath("/html/body/app-root/app-fulllayout/app-hotellist/div[2]/div/div/div[3]/div[2]/a/div/div[1]/div/img");
		
		switchToLastWindow();
		
		waitproperty(2000);
		
		 String hotelname1 = getTextByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[1]/div");
		 
		 System.out.println("The Hotel name is "+hotelname1);
		
		 String price1 = getTextByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/strong");
		
		 System.out.println("The price is "+price1);
		 
		clickByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div/div[3]/button");
		
		selectVisibileTextByname("title", "Mr");

		enterByName("firstName", "Venkatesh");
		
		enterByName("lastName", "Vadduri");
		
		selectVisibileTextByname("country", "India"); 
		
		selectVisibileTextByname("state", "TELANGANA");
		
		selectVisibileTextByname("gst", "No");
	
		verifyTextByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[1]/div/div/h5", hotelname1);
		
		verifyTextByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[2]/div[2]/div/div/div[3]/strong", price1);
		
		clickByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[9]/button[2]");
		
		clickByXpath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[2]/form/div[1]/ul/li/label/span");
		
		clickByXpath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[2]/form/div[2]/button[2]");
		
		clickByXpath("//*[@id=\"modalOTP\"]/div/div/form/div/div[2]/button");
		
		waitproperty(2000);
		
		verifyTextByXpath("//*[@id=\"modalOTP\"]/div/div/form/div/div[1]/span", "otp is required.");
		
		closeAllBrowsers();
		
	}

}
