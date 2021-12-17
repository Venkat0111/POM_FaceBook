package testng;

import org.testng.annotations.Test;

import utils.DP008;
import wrappers.GenericWrappers;

public class TC008 extends GenericWrappers {
	
	@Test(dataProvider="fetchdata",dataProviderClass=DP008.class)
	
	public void otpValidation(String email,String mobile,String cityname,String hotelroom,String hoteladult,String title,
			
			String firstname,String lastname,String country,String state,String gst,String verification) 
	
	{
		
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
		
		enterByName("email",email);
		
		enterByName("mobileNo", mobile);
		
		clickByXpath("//*[@id=\"profile\"]/div/form/div[3]/button");
		
		waitproperty(2000);
		
		enterByXpath("//*[@id=\"filterText\"]", cityname);
		
		clickByXpath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[1]/searchbox/div/ul/li[1]/a");
		
		clickByName("dt12");
		
		clickByXpath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[4]/td[3]/span");
		
		waitproperty(3000);
		
		clickByName("dt13");
		
		clickByXpath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[4]/td[4]/span");
		
		clickById("user-data-wrapper-id");
	
		selectVisibileTextByname("hotelRoom", hotelroom);
		
		selectVisibileTextByname("hotelAdult", hoteladult);
		
		waitproperty(2000);
		
		clickByXpath("//*[@id=\"user-data-wrapper\"]/div[2]/button");
		
		clickByXpath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[5]/button");
		
		waitproperty(2000);
		
		clickByXpath("/html/body/app-root/app-fulllayout/app-hotellist/div[2]/div/div/div[3]/div[2]/a/div/div[1]/div/img");
		
		switchToLastWindow();
		
		waitproperty(2000);
		
		String hotelname1 = getTextByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[1]/div/h5");
		 
		System.out.println("The Hotel name is "+hotelname1);
		
	    String price1 = getTextByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/strong");
		
		System.out.println("The price is "+price1);
		 
		clickByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div/div[3]/button");
		
		waitproperty(3000);
		
		selectVisibileTextByname("title", title);

		enterByName("firstName", firstname);
		
		enterByName("lastName",lastname);
		
		waitproperty(3000);
		
		selectVisibileTextByname("country",country); 
		
		selectVisibileTextByname("state", state);
		
		pagedown();
		
		selectVisibileTextByname("gst", gst);
	
		waitproperty(2000);
		
		verifyTextByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[1]/div/div/h5", hotelname1);
		
		verifyTextByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[2]/div[2]/div/div/div[3]/strong", price1);
	
		waitproperty(2000);
		
		clickByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[9]/button[2]");
		
		waitproperty(5000);
		
		clickByXpath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[2]/form/div[1]/ul/li/label/span");
		
		clickByXpath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[2]/form/div[2]/button[2]");
		
		waitproperty(3000);
		
		clickByXpath("//*[@id=\"modalOTP\"]/div/div/form/div/div[2]/button");
		
		waitproperty(2000);
		
		verifyTextByXpath("//*[@id=\"modalOTP\"]/div/div/form/div/div[1]/span", verification);
		
		closeAllBrowsers();
		
	}

}
