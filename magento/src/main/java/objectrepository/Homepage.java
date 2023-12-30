package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage {

	public Homepage(WebDriver driver) {
		super(driver);
	}
@FindBy(id = "ui-id-3")
private WebElement WhatsNewpage;
@FindBy(id = "ui-id-4")
private WebElement Womenspage;
@FindBy(id = "ui-id-5")
private WebElement menspage;
@FindBy(id = "ui-id-6")
private WebElement gearspage;
@FindBy(id = "ui-id-7")
private WebElement trainingpage;
@FindBy(id = "ui-id-8")
private WebElement salepage;
@FindBy(className = "authorization-link")
private WebElement SignInLink;
@FindBy(linkText = "Create an Account")
private WebElement createAnAccountlink;
@FindBy(id = "search")
private WebElement searchbox;
@FindBy(className = "showcart")
private WebElement cartbutton;
@FindBy(xpath = "//span[.='Shop New Yoga']")
private WebElement shopNewYogaButton;
@FindBy(linkText = "Contact us")
private WebElement contactUsLink;
@FindBy(linkText = "Hire a Sofware Testing/QA Company")
private WebElement hireASofwareTestingQACompanyLink;
@FindBy(className = "authorization-link")
private WebElement logOutLink;
@FindBy(className = "customer-name")
private WebElement logoutSelectDropdown;
@FindBy(id = "ui-id-17")
private WebElement TopsLink;
@FindBy(id = "ui-id-19")
private WebElement JacketsLink;
@FindBy(id = "ui-id-20")
private WebElement HoodiesAndSweatshirtsLink;
@FindBy(id = "ui-id-22")
private WebElement womensTanksLink;
@FindBy(id = "ui-id-9")
private WebElement WomensTopsLink;
@FindBy(id =  "ui-id-10")
private WebElement WomensBottomLink;
@FindBy(id = "ui-id-11")
private WebElement womensJacketsLink;
@FindBy(id = "ui-id-20")
private WebElement womensHoodiesandSweatshirtsLink;
@FindBy(id = "ui-id-13")
private WebElement womensTeesLink;
@FindBy(id = "ui-id-14")
private WebElement womensBrasAndTanksLink;
@FindBy(id = "ui-id-18")
private WebElement bottomslink;
@FindBy(id = "ui-id-23")
private WebElement PantsLink;
@FindBy(id = "ui-id-24")
private WebElement shortsLink;
@FindBy(id = "ui-id-15")
private WebElement womensPantsLink;
@FindBy(id = "ui-id-16")
private WebElement womensShortsLink;
@FindBy(id = "ui-id-25")
private WebElement BagsLink;
@FindBy(id = "ui-id-26")
private WebElement fitnessEquipmentLink;
@FindBy(id = "ui-id-27")
private WebElement watchesLink;
@FindBy(id = "ui-id-28")
private WebElement videoDownloadLink;
@FindBy(xpath = "//span[.='Shop Erin Recommends']")
private WebElement shopErinRecommendsLink;
@FindBy(xpath = "//span[.='Shop Performance']")
private WebElement shopPerformanceLink;
@FindBy(xpath = "//span[.='Shop Eco-Friendly']")
private WebElement shopEcoFriendlyLink;
@FindBy(linkText = "My Account")
private WebElement myAccountLink;
@FindBy(linkText = "My Wish List ")
private WebElement myWishListLink;

public WebElement getMyAccountLink() {
	return myAccountLink;
}
public WebElement getMyWishListLink() {
	return myWishListLink;
}
public WebElement getWhatsNewpage() {
	return WhatsNewpage;
}
public WebElement getWomenspage() {
	return Womenspage;
}
public WebElement getMenspage() {
	return menspage;
}
public WebElement getGearspage() {
	return gearspage;
}
public WebElement getTrainingpage() {
	return trainingpage;
}
public WebElement getSalepage() {
	return salepage;
}
public WebElement getSignInLink() {
	return SignInLink;
}
public WebElement getCreateAnAccountlink() {
	return createAnAccountlink;
}
public WebElement getSearchbox() {
	return searchbox;
}
public WebElement getCartbutton() {
	return cartbutton;
}
public WebElement getShopNewYogaButton() {
	return shopNewYogaButton;
}
public WebElement getContactUsLink() {
	return contactUsLink;
}
public WebElement getHireASofwareTestingQACompanyLink() {
	return hireASofwareTestingQACompanyLink;
}
public WebElement getLogOutLink() {
	return logOutLink;
}
public WebElement getLogoutSelectDropdown() {
	return logoutSelectDropdown;
}
public WebElement getTopsLink() {
	return TopsLink;
}
public WebElement getJacketsLink() {
	return JacketsLink;
}
public WebElement getHoodiesAndSweatshirtsLink() {
	return HoodiesAndSweatshirtsLink;
}
public WebElement getWomensTanksLink() {
	return womensTanksLink;
}
public WebElement getWomensTopsLink() {
	return WomensTopsLink;
}
public WebElement getWomensBottomLink() {
	return WomensBottomLink;
}
public WebElement getWomensJacketsLink() {
	return womensJacketsLink;
}
public WebElement getWomensHoodiesandSweatshirtsLink() {
	return womensHoodiesandSweatshirtsLink;
}
public WebElement getWomensTeesLink() {
	return womensTeesLink;
}
public WebElement getWomensBrasAndTanksLink() {
	return womensBrasAndTanksLink;
}
public WebElement getBottomslink() {
	return bottomslink;
}
public WebElement getPantsLink() {
	return PantsLink;
}
public WebElement getShortsLink() {
	return shortsLink;
}
public WebElement getWomensPantsLink() {
	return womensPantsLink;
}
public WebElement getWomensShortsLink() {
	return womensShortsLink;
}
public WebElement getBagsLink() {
	return BagsLink;
}
public WebElement getFitnessEquipmentLink() {
	return fitnessEquipmentLink;
}
public WebElement getWatchesLink() {
	return watchesLink;
}
public WebElement getVideoDownloadLink() {
	return videoDownloadLink;
}
public WebElement getShopErinRecommendsLink() {
	return shopErinRecommendsLink;
}
public WebElement getShopPerformanceLink() {
	return shopPerformanceLink;
}
public WebElement getShopEcoFriendlyLink() {
	return shopEcoFriendlyLink;
}

}


