package testscripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import objectrepository.EditAddressPage;
import objectrepository.Homepage;
import objectrepository.MyAccountPage;

public class EditBillingAddressTest extends Baseclass {
	@Test
	public void EditBillingAddress() {
		Homepage homepage = new Homepage(driver);
		MyAccountPage myAccountPage = new MyAccountPage(driver);
		EditAddressPage editAddressPage = new EditAddressPage(driver);
		homepage.getLogoutSelectDropdown().click();
		myAccountPage.getMyAccountLink().click();
		myAccountPage.getEditDefaultBillingAddressLink().click();
		editAddressPage.getEditStreet1TextField().sendKeys("GB asvini Athreya");
		editAddressPage.getEditStreet2TextField().sendKeys("rajendra colony");
		editAddressPage.getEditStreet3TextField().sendKeys("saligrammam");
		editAddressPage.getSaveAddressLink().click();

	}
}
