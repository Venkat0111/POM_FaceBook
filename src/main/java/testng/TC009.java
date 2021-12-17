package testng;

import org.testng.annotations.Test;

import utils.DP009;
import wrappers.GenericWrappers;

public class TC009 extends GenericWrappers {
	
	@Test(dataProvider="fetchdata",dataProviderClass=DP009.class)
	public void gstValidation(String email,String mobile,String cityname,String hotelroom,String hoteladult,String title,
			
			String firstname,String lastname,String country,String state,String gst,String gstnumber,String companyname,String companyaddress,String verification)
	
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
		
		enterByName("email", email);
		
		enterByName("mobileNo", mobile);
		
		clickByXpath("//*[@id=\"profile\"]/div/form/div[3]/button");
		
		enterByXpath("//*[@id=\"filterText\"]", cityname);
		
		clickByXpath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[1]/searchbox/div/ul/li[1]/a");
		
		clickByName("dt12");
		
		clickByXpath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[4]/td[3]/span");
		
		clickByName("dt13");
		
		clickByXpath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[4]/td[4]/span");
		
		clickById("user-data-wrapper-id");
	
		selectVisibileTextByname("hotelRoom",hotelroom);
		
		selectVisibileTextByname("hotelAdult", hoteladult);
		
		clickByXpath("//*[@id=\"user-data-wrapper\"]/div[2]/button");
		
		clickByXpath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[5]/button");
		
		clickByXpath("/html/body/app-root/app-fulllayout/app-hotellist/div[2]/div/div/div[3]/div[2]/a/div/div[2]/div/h5");
		
		switchToLastWindow();
		
		getTextByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[1]/div");
		
		getTextByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/strong");
		
		clickByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div/div[3]/button");
		
		selectVisibileTextByname("title", title);

		enterByName("firstName", firstname);
		
		enterByName("lastName", lastname);
		
		selectVisibileTextByname("country", country);
		
		selectVisibileTextByname("state", state);
		
		selectVisibileTextByname("gst", gst);
		
		enterByName("gstNumber", gstnumber);
		
		enterByName("companyName", companyname);
		
		waitproperty(2000);
		
		enterByName("companyAddress", companyaddress);
		
		pagedown();
		
		clickByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[12]/button[2]");
		
		verifyTextByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[9]/div/span",verification);
		
		closeAllBrowsers();
	}

}
