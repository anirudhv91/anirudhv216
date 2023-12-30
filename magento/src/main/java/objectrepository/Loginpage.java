package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericlibrary.Fileutility;

public class Loginpage extends Basepage {

	public Loginpage(WebDriver driver) {
		super(driver);
	}
@FindBy(id = "email")
private WebElement emailtextfield;
@FindBy(id = "pass")
private WebElement passwordtextfield;
@FindBy(id = "send2")
private WebElement SignInButton;
@FindBy(className = "remind")
private WebElement forgotYourPasswordLink;
public WebElement getEmailtextfield() {
	return emailtextfield;
}
public WebElement getPasswordtextfield() {
	return passwordtextfield;
}
public WebElement getSignInButton() {
	return SignInButton;
}
public WebElement getForgotYourPasswordLink() {
	return forgotYourPasswordLink;
}
public void login(WebDriver driver) {
	
	Homepage homepage = new Homepage(driver);
	Loginpage loginpage = new Loginpage(driver);
	homepage.getSignInLink().click();
	loginpage.getEmailtextfield().sendKeys(Fileutility.getproperty("email"));
	loginpage.getPasswordtextfield().sendKeys("password");
	loginpage.getSignInButton().click();

}
public void logout(WebDriver driver) {
   
   Homepage homepage = new Homepage(driver);
   homepage.getLogoutSelectDropdown().click();
   homepage.getLogOutLink().click();
}
}
