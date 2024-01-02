package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyOrdersPage extends Basepage {

	public MyOrdersPage(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/sales/order/view/order_id/37119/']")
private WebElement viewOrderLink000037120;
@FindBy(xpath = "//*[@id=\"my-orders-table\"]/tbody/tr[1]/td[6]/a[2]/span")
private WebElement reOrderLink000037120;
@FindBy(xpath = "//span[.='Print Order']")
private WebElement printOrderLink;
public WebElement getViewOrderLink000037120() {
	return viewOrderLink000037120;
}
public WebElement getReOrderLink000037120() {
	return reOrderLink000037120;
}
public WebElement getPrintOrderLink() {
	return printOrderLink;
}

}
