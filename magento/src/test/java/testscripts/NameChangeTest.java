package testscripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import objectrepository.EditAccountInformationPage;
import objectrepository.Homepage;
import objectrepository.MyAccountPage;

public class NameChangeTest extends Baseclass {
	@Test
	public void NameChange() {
		Homepage homepage = new Homepage(driver);
		MyAccountPage myAccountPage = new MyAccountPage(driver);
		EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
		homepage.getLogoutSelectDropdown().click();
		myAccountPage.getMyAccountLink().click();
		myAccountPage.getEditContactLink().click();
		editAccountInformationPage.getEditFirstNameTextField().sendKeys("ganesh");
		editAccountInformationPage.getEditLastNameTextField().sendKeys("raj");
		editAccountInformationPage.getSaveButton().click();
	}

}
