package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhatsNewPage extends Basepage {

	public WhatsNewPage(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath = "//span[.='Shop New Yoga']")
private WebElement shopNewYogaLink;
@FindBy(xpath = "//span[.='Performance Fabrics']")
private WebElement PerformanceFabricsLink;
@FindBy(xpath = "//span[.='Shop Eco Friendly ']")
private WebElement shopEcoFriendlyLink;
@FindBy(linkText = "Hoodies & Sweatshirts")
private WebElement womenhoodiesAndSweatshirtsLink;
@FindBy(linkText = "Jackets")
private WebElement womenjacketsLink;
@FindBy(linkText = "Tees")
private WebElement womenteesLink;
@FindBy(linkText = "Bras & Tanks")
private WebElement womenbrasAndTanksLink;
@FindBy(linkText = "Pants")
private WebElement womenPantsLink;
@FindBy(linkText = "Shorts")
private WebElement womenShortsLink;
@FindBy(linkText = "Hoodies & Sweatshirts")
private WebElement HoodiesAndSweatshirtsLink;
@FindBy(linkText = "Jackets")
private WebElement JacketsLink;
@FindBy(linkText = "Tees")
private WebElement TeesLink;
@FindBy(linkText = "Tanks")
private WebDriver TanksLink;
@FindBy(linkText = "Pants")
private WebElement PantsLink;
@FindBy(linkText = "Shorts")
private WebElement ShortsLink;
public WebElement getShopNewYogaLink() {
	return shopNewYogaLink;
}
public WebElement getPerformanceFabricsLink() {
	return PerformanceFabricsLink;
}
public WebElement getShopEcoFriendlyLink() {
	return shopEcoFriendlyLink;
}
public WebElement getWomenhoodiesAndSweatshirtsLink() {
	return womenhoodiesAndSweatshirtsLink;
}
public WebElement getWomenjacketsLink() {
	return womenjacketsLink;
}
public WebElement getWomenteesLink() {
	return womenteesLink;
}
public WebElement getWomenbrasAndTanksLink() {
	return womenbrasAndTanksLink;
}
public WebElement getWomenPantsLink() {
	return womenPantsLink;
}
public WebElement getWomenShortsLink() {
	return womenShortsLink;
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
public WebDriver getTanksLink() {
	return TanksLink;
}
public WebElement getPantsLink() {
	return PantsLink;
}
public WebElement getShortsLink() {
	return ShortsLink;
}




}
