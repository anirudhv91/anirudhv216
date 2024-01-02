package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MensPage extends Basepage {

	public MensPage(WebDriver driver) {
		super(driver);
	}
@FindBy(linkText = "Tops")
private WebElement TopsLink;
@FindBy(linkText = "Bottoms")
private WebElement BottomsLink;
@FindBy(linkText = "Hoodies & Sweatshirts")
private WebElement HoodiesAndSweatshirtsLink;
@FindBy(linkText = "Jackets")
private WebElement JacketsLink;
@FindBy(linkText = "Tees")
private WebElement TeesLink;
@FindBy(linkText = "Tanks")
private WebElement TanksLink;
@FindBy(linkText = "Pants")
private WebElement PantsLink;
@FindBy(linkText = "Shorts")
private WebElement ShortsLink;
@FindBy(xpath = "//span[.='Shop Performance']")
private WebElement ShopPerformanceLink;
@FindBy(xpath = "//span[.='Buy 3 Luma tees, get 4 instead']")
private WebElement Buy3LumaTeesGet4InsteadLink;
@FindBy(xpath = "//span[.='Shop Pants']")
private WebElement ShopPantsLink;
@FindBy(xpath = "//span[.='Shop Shorts']")
private WebElement ShopShortsLink;
@FindBy(xpath = "//strong[.='Luma tees']")
private WebElement LumateesLink;
@FindBy(xpath = "//span[.='Shop Hoodies']")
private WebElement ShopHoodiesLink;
@FindBy(css = "[alt='Hero Hoodie']")
private WebElement HeroHoodielink;
public WebElement getTopsLink() {
	return TopsLink;
}
public WebElement getBottomsLink() {
	return BottomsLink;
}
public WebElement getHoodiesAndSweatshirtsLink() {
	return HoodiesAndSweatshirtsLink;
}
public WebElement getJacketsLink() {
	return JacketsLink;
}
public WebElement getTeesLink() {
	return TeesLink;
}
public WebElement getTanksLink() {
	return TanksLink;
}
public WebElement getPantsLink() {
	return PantsLink;
}
public WebElement getShortsLink() {
	return ShortsLink;
}
public WebElement getShopPerformanceLink() {
	return ShopPerformanceLink;
}
public WebElement getBuy3LumaTeesGet4InsteadLink() {
	return Buy3LumaTeesGet4InsteadLink;
}
public WebElement getShopPantsLink() {
	return ShopPantsLink;
}
public WebElement getShopShortsLink() {
	return ShopShortsLink;
}
public WebElement getLumateesLink() {
	return LumateesLink;
}
public WebElement getShopHoodiesLink() {
	return ShopHoodiesLink;
}
public WebElement getHeroHoodielink() {
	return HeroHoodielink;
}

}
