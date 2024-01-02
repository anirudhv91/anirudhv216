package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GearPage extends Basepage {

	public GearPage(WebDriver driver) {
		super(driver);
	}
@FindBy(linkText = "Bags")
private WebElement BagsLink;
@FindBy(linkText = "Fitness Equipment")
private WebElement FitnessEquipmentLink;
@FindBy(linkText = "Watches")
private WebElement WatchesLink;
@FindBy(xpath  = "//span[.='Shop Yoga Kit']")
private WebElement ShopYogaKitLink;
@FindBy(xpath = "//span[.='Shop Fitness']")
private WebElement ShopFitnessLink;
@FindBy(xpath = "//strong[.='Here’s to you!']")
private WebElement HereIsToYouLink;
@FindBy(xpath = "//span[.='Shop Bags']")
private WebElement ShopBagsLink;
@FindBy(xpath = "//span[.='Shop Equipment']")
private WebElement ShopEquipmentLink;
@FindBy(xpath = "//span[.='Shop Watches']")
private WebElement ShopWatchesLink;
@FindBy(css = "[alt='Fusion Backpack']")
private WebElement FusionBackpackLink;
public WebElement getBagsLink() {
	return BagsLink;
}
public WebElement getFitnessEquipmentLink() {
	return FitnessEquipmentLink;
}
public WebElement getWatchesLink() {
	return WatchesLink;
}
public WebElement getShopYogaKitLink() {
	return ShopYogaKitLink;
}
public WebElement getShopFitnessLink() {
	return ShopFitnessLink;
}
public WebElement getHereIsToYouLink() {
	return HereIsToYouLink;
}
public WebElement getShopBagsLink() {
	return ShopBagsLink;
}
public WebElement getShopEquipmentLink() {
	return ShopEquipmentLink;
}
public WebElement getShopWatchesLink() {
	return ShopWatchesLink;
}
public WebElement getFusionBackpackLink() {
	return FusionBackpackLink;
}

}
