package testscripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import objectrepository.CreateNewAccountPage;
import objectrepository.Homepage;

public class CreateNewAccountTest extends Baseclass {
	@Test
    public void CreateNewAccount() {
		Homepage homepage = new Homepage(driver);
		CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage(driver);
		homepage.getCreateAnAccountlink().click();
		createNewAccountPage.getFirstName().sendKeys("vignesh");
		createNewAccountPage.getLastName().sendKeys("saran");
		createNewAccountPage.getEmailAddress().sendKeys("vignesh@gmail.com");
		createNewAccountPage.getPassword().sendKeys("vignesh@123");
		createNewAccountPage.getConfirmPassword().sendKeys("vignesh@123");
		createNewAccountPage.getCreateAnAccountButton().click();
	}
}
