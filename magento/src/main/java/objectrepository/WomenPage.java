package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenPage extends Basepage {

	public WomenPage(WebDriver driver) {
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
@FindBy(linkText = "Bras & Tanks")
private WebElement BrasAndTanksLink;
@FindBy(linkText = "Pants")
private WebElement PantsLink;
@FindBy(linkText = "Shorts")
private WebElement ShortsLink;
@FindBy(xpath = "//span[.='Shop New Yoga']")
private WebElement ShopNewYogaLink;
@FindBy(xpath = "//span[.='Women’s Tees']")
private WebElement WomenTeesLink;
@FindBy(xpath = "//span[.='20% OFF']")
private WebElement shopPantsLink;
@FindBy(xpath = "//span[.='Shop Erin Recommends']")
private WebElement ShopErinRecommendsLink;
@FindBy(xpath = "//span[.='Pants for yoga, gym and outdoors']")
private WebElement PantsForYogaGymAndOutdoorslink;
@FindBy(xpath = "//span[.='Shop Shorts']")
private WebElement ShopShortsLink;
@FindBy(xpath = "//span[.='Shop Now']")
private WebElement ShopNowLink;
@FindBy(css = "[alt='Radiant Tee']")
private WebElement RadiantTeeImage;
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
public WebElement getBrasAndTanksLink() {
	return BrasAndTanksLink;
}
public WebElement getPantsLink() {
	return PantsLink;
}
public WebElement getShortsLink() {
	return ShortsLink;
}
public WebElement getShopNewYogaLink() {
	return ShopNewYogaLink;
}
public WebElement getWomenTeesLink() {
	return WomenTeesLink;
}
public WebElement getShopPantsLink() {
	return shopPantsLink;
}
public WebElement getShopErinRecommendsLink() {
	return ShopErinRecommendsLink;
}
public WebElement getPantsForYogaGymAndOutdoorslink() {
	return PantsForYogaGymAndOutdoorslink;
}
public WebElement getShopShortsLink() {
	return ShopShortsLink;
}
public WebElement getShopNowLink() {
	return ShopNowLink;
}
public WebElement getRadiantTeeImage() {
	return RadiantTeeImage;
}


}
