package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewAccountPage extends Basepage {

	public CreateNewAccountPage(WebDriver driver) {
		super(driver);
	}
@FindBy(id = "firstname")
private WebElement firstName;
@FindBy(id = "lastname")
private WebElement lastName;
@FindBy(id = "email_address")
private WebElement emailAddress;
@FindBy(id = "password")
private WebElement password;
@FindBy(id = "password-confirmation")
private WebElement confirmPassword;
@FindBy(xpath = "//button//span[.='Create an Account']")
private WebElement createAnAccountButton;
public WebElement getFirstName() {
	return firstName;
}
public WebElement getLastName() {
	return lastName;
}
public WebElement getEmailAddress() {
	return emailAddress;
}
public WebElement getPassword() {
	return password;
}
public WebElement getConfirmPassword() {
	return confirmPassword;
}
public WebElement getCreateAnAccountButton() {
	return createAnAccountButton;
}

}
