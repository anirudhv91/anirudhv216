package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Basepage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath = "//strong[.='My Account']")
private WebElement myAccountLink;
@FindBy(linkText = "My Orders")
private WebElement myOrdersLink;
@FindBy(linkText = "My Downloadable Products")
private WebElement myDownloadableProductsLink;
@FindBy(linkText = "My Wish List")
private WebElement myWishList;
@FindBy(linkText = "Address Book")
private WebElement addressBookLink;
@FindBy(linkText = "Account Information")
private WebElement accountInformationLink;
@FindBy(linkText = "Stored Payment Methods")
private WebElement storedPaymentMethodsLink;
@FindBy(linkText = "My Product Reviews")
private WebElement myProductReviews;
@FindBy(xpath = "//span[.='Edit']")
private WebElement EditContactLink;
@FindBy(className = "change-password")
private WebElement changePasswordLink;
@FindBy(xpath = "//span[.='Manage Addresses']")
private WebElement manageAddressesLink;
@FindBy(id = "default-billing-edit-link")
private WebElement editDefaultBillingAddressLink;
@FindBy(id = "default-shipping-edit-link")
private WebElement editDefaultShippingAddressLink;
public WebElement getMyAccountLink() {
	return myAccountLink;
}
public WebElement getMyOrdersLink() {
	return myOrdersLink;
}
public WebElement getMyDownloadableProductsLink() {
	return myDownloadableProductsLink;
}
public WebElement getMyWishList() {
	return myWishList;
}
public WebElement getAddressBookLink() {
	return addressBookLink;
}
public WebElement getAccountInformationLink() {
	return accountInformationLink;
}
public WebElement getStoredPaymentMethodsLink() {
	return storedPaymentMethodsLink;
}
public WebElement getMyProductReviews() {
	return myProductReviews;
}
public WebElement getEditContactLink() {
	return EditContactLink;
}
public WebElement getChangePasswordLink() {
	return changePasswordLink;
}
public WebElement getManageAddressesLink() {
	return manageAddressesLink;
}
public WebElement getEditDefaultBillingAddressLink() {
	return editDefaultBillingAddressLink;
}
public WebElement getEditDefaultShippingAddressLink() {
	return editDefaultShippingAddressLink;
}

}
