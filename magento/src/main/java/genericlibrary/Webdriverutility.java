package genericlibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Webdriverutility implements FrameworkConstants {
	public static Actions action;
	public static JavascriptExecutor je;
	public static ExtentReports report;
	public static ExtentTest test;
	
	
public static void selectOptionByIndex(WebElement dropdown, int index) {
	Select select = new Select(dropdown);
	select.selectByIndex(index);
	
}
public static void selectOptionByValue(WebElement dropdown, String value) {
	Select select = new Select(dropdown);
	select.selectByValue(value);
}
public static void selectOptionByVisibleText(WebElement dropdown, String text) {
	Select select = new Select(dropdown);
	select.selectByVisibleText(text);
}

public static void clickOnHiddenOrDisabledElement(WebDriver driver,WebElement element) {
	JavascriptExecutor je = (JavascriptExecutor) driver;
	je.executeScript("arguments[0].click():", element);
	
}
public static void enterTextToHiddenOrDisabledElement(WebDriver driver,WebElement element,String value) {
	JavascriptExecutor je = (JavascriptExecutor) driver;
	je.executeScript("arguments[0].value='"+value+"';", element);
	}
public static void switchToWindowByTitle(WebDriver driver, String title) {
	Set<String> allwindows = driver.getWindowHandles();
	for (String window : allwindows) {
		driver.switchTo().window(window);
		if (driver.getTitle().contains(title)) {
			break;
			
		}
		
	}
}
public static void switchToFrameByIndex(WebDriver driver, int index) {
	driver.switchTo().frame(index);
	}
public static void switchToFrameByNameOrId(WebDriver driver, String NameOrId) {
	driver.switchTo().frame(NameOrId);
	}
public static void switchToFrameByWebElement(WebDriver driver, WebElement frameElement) {
	driver.switchTo().frame(frameElement);
	}
public static void clickElement(WebElement element) {
	element.click();
}
public static void entertext(WebElement element, String text) {
	element.sendKeys(text);
}
public static String getSystemDate() {
	return LocalDateTime.now().toString().replace(":", "_").replace("-", "_");
	
}
public static String getScreenshotOfWebpage(WebDriver driver) {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	String imagepath = SCREENSHOT_PATH+getSystemDate()+".png";
	File perm = new File(imagepath);
	try {
		FileHandler.copy(temp, perm);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "."+imagepath;
}
public static String getScreenshotOfWebElement(WebElement element) {
	File temp = element.getScreenshotAs(OutputType.FILE);
	String imagepath = SCREENSHOT_PATH+getSystemDate()+".png";
	File perm = new File(imagepath);
	try {
		FileHandler.copy(temp, perm);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "."+imagepath;
}
public static void switchToAlertAndAccept(WebDriver driver) {
	driver.switchTo().alert().accept();
	
}
public static void switchToAlertAndDismiss(WebDriver driver) {
	driver.switchTo().alert().dismiss();
	
}
public static void switchToAlertAndGetText(WebDriver driver) {
	driver.switchTo().alert().getText();
	
}
public static void switchToAlertAndSendText(WebDriver driver, String text) {
	driver.switchTo().alert().sendKeys(text);
	
}
public static void mouseHover(WebDriver driver, WebElement element) {
	action.moveToElement(element).perform();		
}
public static void mouseClick(WebDriver driver, WebElement element) {
	action.click(element).perform();		
}
public static void rightClick(WebDriver driver, WebElement element) {
	action.contextClick(element).perform();		
}
public static void scrollByXAndYvalue(WebDriver driver,int x, int y) {
	je.executeScript("window.scrollBy("+x+","+y+");");
	}
public static void scrollToXAndYvalue(WebDriver driver,int x, int y) {
	je.executeScript("window.scrollTo("+x+","+y+");");
	}
public static void scrollIntoView(WebDriver driver,WebElement element,boolean position) {
	je.executeScript("arguments[0].scrollIntoView("+position+");", element);
	}
public static void initObjects(WebDriver driver) {
	action = new Actions(driver);
	je = (JavascriptExecutor) driver;
	
}
}
