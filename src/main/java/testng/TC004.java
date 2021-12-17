package testng;

import org.testng.annotations.Test;

import utils.DP004;
import wrappers.GenericWrappers;

public class TC004 extends GenericWrappers 
{
     @Test(dataProvider = "fetchdata",dataProviderClass=DP004.class)
	public void indianfrroRegistration(String userid,String password,String confirmpassword,String secqst,String answer,String gender,String name,
			
			String dob,String designation,String email,String mobile,String phonenumber,String nationality,String hotelname,
			
			String capacity,String address,String state,String city,String frro,String accomodationtype,String accomodationgrade,String emailid,
			
			String mobilenum,String phonenum,String name1,String address1,String state1,String city1,String email1,String phone1,
			
			String mobile1,String name2,String address2,String state2,String city2,String email2,String phone2,
			
			String mobile2,String name3,String address3,String state3,String city3,String email3,String phone3,String mobile3) 
     
     {
		
    invokeApp("chrome", "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");	 
		
	clickByLink("Sign Up (Registration)");
	
	enterById("u_id", userid);
	
	enterById("u_pwd", password);
		
	enterById("u_repwd",confirmpassword);
	
	waitproperty(3000);
	
	selectIndexById("u_secques",Integer.parseInt(secqst));
	
	enterById("u_secans", answer);
	
	enterById("u_name",name );
	
	selectIndexById("u_gender", Integer.parseInt(gender));
	
	enterById("u_dob", dob);
	
	enterById("u_designation",designation );
	
	enterById("u_emailid", email);
	
	enterById("u_mobile", mobile);
	
	enterById("u_phone", phonenumber);
		
	selectVisibileTextById("u_nationality", nationality);	
	
	enterById("name", hotelname);
	
	enterById("capacity", capacity);
	
	enterById("address", address);
	
	selectIndexById("state",Integer.parseInt(state));
	
	waitproperty(3000);
		
	selectIndexById("city_distr",Integer.parseInt(city));
	
	waitproperty(3000);
	
	selectVisibileTextById("frrodata", frro);
	
	waitproperty(3000);
	
	selectVisibileTextById("acco_type", accomodationtype);
	
	waitproperty(3000);
	
	selectVisibileTextById("star_rat", accomodationgrade);
	
	waitproperty(3000);
	
	enterById("email", emailid);
	
	enterById("mcontact", mobilenum);
	
	enterById("contact",phonenum);
	
	enterByName("name_o", name1);
	
	enterByName("address_o", address1);
	
	selectIndexById("state_o",Integer.parseInt(state1));
	
	waitproperty(3000);
	
	selectbyvalue("citydistr_o", city1);
	
	enterByName("emailid_o",email1);
	
	enterByName("phoneno_o", phone1);
	
	enterByName("mobile_o",mobile1);
	
	clickByName("add");
	
	waitproperty(3000);
	
    enterByName("name_o", name2);
	
	enterByName("address_o", address2);
	
	selectIndexById("state_o",Integer.parseInt(state2));
	
	waitproperty(3000);
	
	
	selectbyvalue("citydistr_o", city2);
	
	enterByName("emailid_o", email2);
	
	enterByName("phoneno_o", phone2);
	
	enterByName("mobile_o", mobile2);
	
	waitproperty(3000);
	
	clickByName("add");
	
    enterByName("name_o", name3);
	
	enterByName("address_o", address3);
	
	selectIndexById("state_o",Integer.parseInt(state3));
	
	waitproperty(3000);
	
	selectbyvalue("citydistr_o", city3);
	
	enterByName("emailid_o", email3);
	
	enterByName("phoneno_o", phone3);
	
	enterByName("mobile_o", mobile3);
	
	waitproperty(3000);
	
	clickByName("add");
		
	clickByName("submitb");
	
	closeAllBrowsers();
	
	}
	
	
}
