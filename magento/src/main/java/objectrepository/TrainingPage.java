package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrainingPage extends Basepage {

	public TrainingPage(WebDriver driver) {
		super(driver);
	}
@FindBy(linkText = "Video Download")
private WebElement VideoDownloadLink;
@FindBy(xpath = "//span[.='Motivate']")
private WebElement MotivateLink;
@FindBy(xpath = "//strong[.='Before creating Luma, pro trainer Erin Renny helped world-class athletes reach peak fitness']")
private WebElement erinLink;
@FindBy(xpath = "//span[.='Videos']")
private WebElement VideosLink;
public WebElement getVideoDownloadLink() {
	return VideoDownloadLink;
}
public WebElement getMotivateLink() {
	return MotivateLink;
}
public WebElement getErinLink() {
	return erinLink;
}
public WebElement getVideosLink() {
	return VideosLink;
}
}
