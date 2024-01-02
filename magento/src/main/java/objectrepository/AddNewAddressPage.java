package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewAddressPage extends Basepage {

	public AddNewAddressPage(WebDriver driver) {
		super(driver);
	}
@FindBy(id = "firstname")
private WebElement firstNameTextField;
@FindBy(id = "lastname")
private WebElement lastNameTextField;
@FindBy(id = "telephone")
private WebElement phoneNumberTextField;
@FindBy(id = "street_1")
private WebElement street1TextField;
@FindBy(id = "street_2")
private WebElement street2TextField;
@FindBy(id = "street_3")
private WebElement street3TextField;
@FindBy(id = "city")
private WebElement cityTextField;
@FindBy(id = "region_id")
private WebElement StateDropDown;
@FindBy(id = "zip")
private WebElement zipCode;
@FindBy(id = "country")
private WebElement countryDropDown;
@FindBy(id = "primary_billing")
private WebElement defaultBillingAddressCheckBox;
@FindBy(id = "primary_shipping")
private WebElement defaultshippingaddressCheckBox;
@FindBy(xpath = "//span[.='Save Address']")
private WebElement SaveAddressButton;
public WebElement getFirstNameTextField() {
	return firstNameTextField;
}
public WebElement getLastNameTextField() {
	return lastNameTextField;
}
public WebElement getPhoneNumberTextField() {
	return phoneNumberTextField;
}
public WebElement getStreet1TextField() {
	return street1TextField;
}
public WebElement getStreet2TextField() {
	return street2TextField;
}
public WebElement getStreet3TextField() {
	return street3TextField;
}
public WebElement getCityTextField() {
	return cityTextField;
}
public WebElement getStateDropDown() {
	return StateDropDown;
}
public WebElement getZipCode() {
	return zipCode;
}
public WebElement getCountryDropDown() {
	return countryDropDown;
}
public WebElement getDefaultBillingAddressCheckBox() {
	return defaultBillingAddressCheckBox;
}
public WebElement getDefaultshippingaddressCheckBox() {
	return defaultshippingaddressCheckBox;
}
public WebElement getSaveAddressButton() {
	return SaveAddressButton;
}

}
