package pom.pan.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.pan.pages.PanRegistrationpage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC009";
		testCaseDescription="Pan Registaration for New User";
		author="Venkatesh";
		category="smoke";
		browser="chrome";
		appName="Pan";
		
	}
	
	@Test
	public void panRegistration() {
		
		new PanRegistrationpage(driver,test)
		
		.selectTitle("MR.")
		
		.enterFirstName("Venkatesh")
		
		.enterMiddleName("V")
		
		.enterLastName("Vadduri")
		
		.enterFatherFirstName("Yedukondalu")
		
		.enterFatherMiddleName("Rao")
		
		.enterFatherLastName("Vadduri")
		
		.enterMobileNumber("8008195106")
		
		.enterEmail("venkateshvadduri99@gmail.com")
		
		.selectIncome("Salary")
		
		.clickonAddressOfCommunication("office")
		
		.enterDateOfBirth("14121996")
		
		.enterResidentialAddress1("4-110")
		
		.enterResidentialAddress2("Immadisetty Vari Palem")
		
		.enterResidentialAddressCity("Bapatla")
		
		.selectResidentialAddressState("Andhra Pradesh")
		
		.enterResidentialAddressPincode("522101")

		.selectResidentialAddressCountry("INDIA")
		
		.enterOfficeName("HCL Technologies")
		
		.enterOfficeAddress1("5-112")
		
		.enterOfficeAddress2("Sholonganallur")
	
		.enterOfficeAddressCity("Chennai")
		
		.selectOfficeAddressState("Tamil Nadu")
		
		.enterOfficeAddressPincode("600003")
		
		.selectOfficeAddressCountry("INDIA")
		
		.selectIdentityProof("Aadhar Card issued by UIDAI(In Copy)")
		
		.selectAddressProof("PASSPORT (In Copy)")
		
		.selectDOBProof("Matriculation certificate or mark sheet of recognised board (In Copy)")
		
		.selectAadhaarProof("Copy of Aadhaar Card / Letter")
		
		.selectOfficeAddressProof("Employer Certificate carrying Office Address")
		
		.pageDown()
		
		.clickonCheckbox();
		
	}

}
