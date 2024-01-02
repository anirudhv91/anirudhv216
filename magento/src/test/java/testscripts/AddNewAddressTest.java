package testscripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import objectrepository.AddNewAddressPage;
import objectrepository.AddressBookPage;
import objectrepository.Homepage;
import objectrepository.MyAccountPage;

public class AddNewAddressTest extends Baseclass {
	@Test
	public void AddNewAddress() {
	Homepage homepage = new Homepage(driver);
	MyAccountPage myAccountPage = new MyAccountPage(driver);
	AddressBookPage addressBookPage = new AddressBookPage(driver);
	AddNewAddressPage addNewAddressPage = new AddNewAddressPage(driver);
	homepage.getLogoutSelectDropdown().click();
	myAccountPage.getMyAccountLink().click();
	myAccountPage.getAddressBookLink().click();
	addressBookPage.getAddNewAddressButton().click();
	addNewAddressPage.getPhoneNumberTextField().sendKeys("9653728538");
	addNewAddressPage.getStreet1TextField().sendKeys("C1 Asvirvaad apartments");
	addNewAddressPage.getStreet2TextField().sendKeys("No 5, Raman Street");
	addNewAddressPage.getStreet3TextField().sendKeys("Behind Kasi Arcade, T Nagar");
	addNewAddressPage.getCityTextField().sendKeys("chennai");
	selectOptionByVisibleText(addNewAddressPage.getCountryDropDown(), "India");
	selectOptionByVisibleText(addNewAddressPage.getStateDropDown(), "Tamil Nadu");
	addNewAddressPage.getZipCode().sendKeys("600017");
	addNewAddressPage.getDefaultBillingAddressCheckBox().click();
	addNewAddressPage.getDefaultshippingaddressCheckBox().click();
	addNewAddressPage.getSaveAddressButton().click();
	
	
	}
}
