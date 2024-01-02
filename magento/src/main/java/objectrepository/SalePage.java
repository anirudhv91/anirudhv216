package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalePage extends Basepage {

	public SalePage(WebDriver driver) {
		super(driver);
	}
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
	@FindBy(linkText = "Hoodies & Sweatshirts")
	private WebElement womensHoodiesAndSweatshirtsLink;
	@FindBy(linkText = "Jackets")
	private WebElement womensJacketsLink;
	@FindBy(linkText = "Tees")
	private WebElement womensTeesLink;
	@FindBy(linkText = "Bras & Tanks")
	private WebElement womensBrasAndTanksLink;
	@FindBy(linkText = "Pants")
	private WebElement womensPantsLink;
	@FindBy(linkText = "Shorts")
	private WebElement womensShortsLink;
	@FindBy(linkText = "Bags")
	private WebElement BagsLink;
	@FindBy(linkText = "Fitness Equipment")
	private WebElement FitnessEquipmentLink;
	@FindBy(xpath = "//span[.='Shop Women’s Deals']")
	private WebElement ShopWomensDealsLink;
	@FindBy(xpath = "//span[.='Shop Men’s Deals']")
	private WebElement ShopMensDealsLink;
	@FindBy(xpath = "//span[.='Shop Luma Gear']")
	private WebElement ShopLumaGearLink;
	@FindBy(xpath = "//span[.='Tees on sale']")
	private WebElement TeesOnSaleLink;
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
	public WebElement getWomensHoodiesAndSweatshirtsLink() {
		return womensHoodiesAndSweatshirtsLink;
	}
	public WebElement getWomensJacketsLink() {
		return womensJacketsLink;
	}
	public WebElement getWomensTeesLink() {
		return womensTeesLink;
	}
	public WebElement getWomensBrasAndTanksLink() {
		return womensBrasAndTanksLink;
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
		return FitnessEquipmentLink;
	}
	public WebElement getShopWomensDealsLink() {
		return ShopWomensDealsLink;
	}
	public WebElement getShopMensDealsLink() {
		return ShopMensDealsLink;
	}
	public WebElement getShopLumaGearLink() {
		return ShopLumaGearLink;
	}
	public WebElement getTeesOnSaleLink() {
		return TeesOnSaleLink;
	}
	
}
