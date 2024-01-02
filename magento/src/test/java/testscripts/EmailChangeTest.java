package testscripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import objectrepository.EditAccountInformationPage;
import objectrepository.Homepage;
import objectrepository.MyAccountPage;

public class EmailChangeTest extends Baseclass {
	@Test
	public void EmailChange() {
		Homepage homepage = new Homepage(driver);
		MyAccountPage myAccountPage = new MyAccountPage(driver);
		EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
		homepage.getLogoutSelectDropdown().click();
		myAccountPage.getMyAccountLink().click();
		myAccountPage.getEditContactLink().click();
		editAccountInformationPage.getChangeEmailCheckBox().click();
		editAccountInformationPage.getChangeEmailTextField().sendKeys("ganesh@gmail.com");
		editAccountInformationPage.getChangeCurrentPasswordTextField().sendKeys("Aniche@211");
		editAccountInformationPage.getChangePasswordCheckBox().click();
		editAccountInformationPage.getNewPasswordTextField().sendKeys("Ganesh@123");
		editAccountInformationPage.getConfirmationPasswordTextField().sendKeys("Ganesh@123");
		editAccountInformationPage.getSaveButton().click();
		
	}

}
