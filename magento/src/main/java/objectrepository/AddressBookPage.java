package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBookPage extends Basepage {

	public AddressBookPage(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath = "//span[.='Change Billing Address']")
private WebElement changeBillingAddressLink;
@FindBy(xpath = "//span[.='Change Shipping Address']")
private WebElement changeShippingAddress;
@FindBy(xpath = "//span[.='Add New Address']")
private WebElement addNewAddressButton;

}
