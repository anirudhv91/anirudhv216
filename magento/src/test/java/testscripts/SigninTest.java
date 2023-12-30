package testscripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import objectrepository.Homepage;
import objectrepository.Loginpage;

public class SigninTest extends Baseclass {
	@Test
	public void Signin() {
			Homepage homepage = new Homepage(driver);
			Loginpage loginpage = new Loginpage(driver);
			homepage.getSignInLink().click();
			loginpage.getEmailtextfield().sendKeys("anirudhv91@gmail.com");
			loginpage.getPasswordtextfield().sendKeys("Aniche@211");
			loginpage.getSignInButton().click();
	}

}
