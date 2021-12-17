package testcases;



import org.junit.Test;

import wrappers.GenericWrappers;

public class TC004 extends GenericWrappers 
{
     @Test
	public void indianfrroRegistration() {
		
    invokeApp("chrome", "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");	 
		
	clickByLink("Sign Up (Registration)");
	
	enterById("u_id", "Venky123");
	
	enterById("u_pwd", "Test@123");
		
	enterById("u_repwd", "Test@123");
	
	selectIndexById("u_secques", 3);
	
	enterById("u_secans", "The war iam in");
	
	enterById("u_name", "Venkatesh");
	
	selectIndexById("u_gender", 1);
	
	enterById("u_dob", "14/12/1996");
	
	enterById("u_designation", "Senior Analyst");
	
	enterById("u_emailid", "venkateshvadduri99@gmail.com");
	
	enterById("u_mobile", "8008195106");
	
	enterById("u_phone", "8008195106");
		
	selectVisibileTextById("u_nationality", "INDIA");	
	
	enterById("name", "Lotuspond");
	
	enterById("capacity", "4");
	
	enterById("address", "D.no:8-110,vivekananda colony");
	
	selectIndexById("state", 2);
		
	selectIndexById("city_distr", 4);
	
	selectVisibileTextById("frrodata", "FRO GUNTUR URBAN");
	
	selectVisibileTextById("acco_type", "Hotel");
	
	selectVisibileTextById("star_rat", "Five Star");
	
	enterById("email", "test@123.com");
	
	enterById("mcontact", "1234567890");
	
	enterById("contact", "1234567890");
	
	enterByName("name_o", "Ramesh");
	
	enterByName("address_o", "D.no:56-110,Sharadha colony");
	
	selectIndexById("state_o", 2);
	
	selectbyvalue("citydistr_o", "6D");
	
	enterByName("emailid_o", "rameshraj@gmail.com");
	
	enterByName("phoneno_o", "1234561234");
	
	enterByName("mobile_o", "1234561234");
	
	clickByName("add");
	
    enterByName("name_o", "Suresh");
	
	enterByName("address_o", "D.no:12-450,Sandyaa colony");
	
	selectIndexById("state_o", 2);
	
	selectbyvalue("citydistr_o", "15D");
	
	enterByName("emailid_o", "sureshgopi@gmail.com");
	
	enterByName("phoneno_o", "1234561222");
	
	enterByName("mobile_o", "1234561222");
	
	clickByName("add");
	
    enterByName("name_o", "Mahesh");
	
	enterByName("address_o", "D.no:5-541, Rajeswari colony");
	
	selectIndexById("state_o", 2);
	
	selectbyvalue("citydistr_o", "10D");
	
	enterByName("emailid_o", "Maheshnanda@gmail.com");
	
	enterByName("phoneno_o", "1234098763");
	
	enterByName("mobile_o", "1234098763");
	
	clickByName("add");
		
	//clickByName("submitb");
	
	closeAllBrowsers();
	
	}
	
	
}
