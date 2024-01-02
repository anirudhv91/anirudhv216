package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends Basepage {

	public AddToCartPage(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath = "//span[.='View and Edit Cart']")
private WebElement ViewAndEditCartLink;
@FindBy(id = "cart-555845-qty")
private WebElement cartQtyTextField;
@FindBy(xpath = "//span[.='Move to Wishlist']")
private WebElement MoveToWishlistLink;
@FindBy(className = "action-edit")
private WebElement editItemParametersLink;
@FindBy(className = "action-delete")
private WebElement removeItemLink;
@FindBy(css = "[value='update_qty']")
private WebElement updateShoppingCartButton;
@FindBy(id = "block-discount-heading")
private WebElement applyDiscountCodeLink;
@FindBy(xpath = "//span[.='Proceed to Checkout']")
private WebElement proceedToCheckoutLink;
@FindBy(xpath = "//span[.='Check Out with Multiple Addresses']")
private WebElement checkOutWithMultipleAddressesLink;

}
