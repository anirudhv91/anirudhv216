package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountInformationPage extends Basepage {

	public EditAccountInformationPage(WebDriver driver) {
		super(driver);
	}
@FindBy(id = "firstname")
private WebElement editFirstNameTextField;
@FindBy(id = "lastname")
private WebElement editLastNameTextField;
@FindBy(id = "change-email")
private WebElement changeEmailCheckBox;
@FindBy(id = "email")
private WebElement changeEmailTextField;
@FindBy(id = "current-password")
private WebElement changeCurrentPasswordTextField;
@FindBy(id = "change-password")
private WebElement changePasswordCheckBox;
@FindBy(id = "password")
private WebElement newPasswordTextField;
@FindBy(id = "password-confirmation")
private WebElement confirmationPasswordTextField;
@FindBy(css = "[title='Save']")
private WebElement SaveButton;
public WebElement getEditFirstNameTextField() {
	return editFirstNameTextField;
}
public WebElement getEditLastNameTextField() {
	return editLastNameTextField;
}
public WebElement getChangeEmailCheckBox() {
	return changeEmailCheckBox;
}
public WebElement getChangeEmailTextField() {
	return changeEmailTextField;
}
public WebElement getChangeCurrentPasswordTextField() {
	return changeCurrentPasswordTextField;
}
public WebElement getChangePasswordCheckBox() {
	return changePasswordCheckBox;
}
public WebElement getNewPasswordTextField() {
	return newPasswordTextField;
}
public WebElement getConfirmationPasswordTextField() {
	return confirmationPasswordTextField;
}
public WebElement getSaveButton() {
	return SaveButton;
}

}
