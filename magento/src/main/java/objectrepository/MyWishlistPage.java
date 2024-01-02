package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyWishlistPage extends Basepage {

	public MyWishlistPage(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath = "//span[.='Update Wish List']")
private WebElement updateWishListButton;
@FindBy(xpath = "//span[.='Share Wish List']")
private WebElement ShareWishListButton;
@FindBy(xpath = "//span[.='Add All to Cart']")
private WebElement AddAllToCartButton;
@FindBy(xpath = "//span[.='Compare']")
private WebElement CompareButton;
@FindBy(xpath = "//span[.='Clear All']")
private WebElement ClearAllLink;

}
