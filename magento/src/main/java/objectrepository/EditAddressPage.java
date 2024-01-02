package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAddressPage extends Basepage {

	public EditAddressPage(WebDriver driver) {
		super(driver);
	}
@FindBy(id = "firstname")
private WebElement editFirstNameTextField;
@FindBy(id = "lastname")
private WebElement editLastNameTextField;
@FindBy(id = "street_1")
private WebElement editStreet1TextField;
@FindBy(id = "street_2")
private WebElement editStreet2TextField;
@FindBy(id = "street_3")
private WebElement editStreet3TextField;
@FindBy(id = "city")
private WebElement editCityTextField;
@FindBy(id = "telephone")
private WebElement edittelephoneTextField;
@FindBy(id = "region_id")
private WebElement editStateDropDown;
@FindBy(id = "zip")
private WebElement editZipCodeDropDown;
@FindBy(id = "country")
private WebElement editCountryDropDown;
@FindBy(xpath = "//span[.='Save Address']")
private WebElement saveAddressLink;
@FindBy(id = "primary_billing")
private WebElement defaultBillingAddressCheckBox;
@FindBy(id = "primary_shipping")
private WebElement defaultShippingAddressCheckBox;
public WebElement getEditFirstNameTextField() {
	return editFirstNameTextField;
}
public WebElement getEditLastNameTextField() {
	return editLastNameTextField;
}
public WebElement getEditStreet1TextField() {
	return editStreet1TextField;
}
public WebElement getEditStreet2TextField() {
	return editStreet2TextField;
}
public WebElement getEditStreet3TextField() {
	return editStreet3TextField;
}
public WebElement getEditCityTextField() {
	return editCityTextField;
}
public WebElement getEdittelephoneTextField() {
	return edittelephoneTextField;
}
public WebElement getEditStateDropDown() {
	return editStateDropDown;
}
public WebElement getEditZipCodeDropDown() {
	return editZipCodeDropDown;
}
public WebElement getEditCountryDropDown() {
	return editCountryDropDown;
}
public WebElement getSaveAddressLink() {
	return saveAddressLink;
}
public WebElement getDefaultBillingAddressCheckBox() {
	return defaultBillingAddressCheckBox;
}
public WebElement getDefaultShippingAddressCheckBox() {
	return defaultShippingAddressCheckBox;
}

}
