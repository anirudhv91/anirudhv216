package genericlibrary;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;

import objectrepository.Loginpage;

public class Baseclass extends Webdriverutility {
	public WebDriver driver;

	@BeforeSuite
	public void beforesuite() {
		report.flush();
        report=new ExtentReports(REPORT_PATH+getSystemDate()+".html");
	}

	@AfterSuite
	public void aftersuite() {
		report.flush();
		Reporter.log("close connection to database", true);
	}

	@BeforeTest
	public void beforetest() {
		Reporter.log("before test");
	}

	@AfterTest
	public void aftertest() {
		Reporter.log("aftertest");
	}

	@BeforeClass
	public void beforeclass() {
		Reporter.log("Before class", true);
		String browser = Fileutility.getproperty("browser");
		String url = Fileutility.getproperty("url");
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}

	@AfterClass
	public void afterclass() {
		driver.quit();
	}

	@BeforeMethod
	public void beforemethod(Method method) {
		String methodName=method.getName();
		test=report.startTest(methodName);
		Reporter.log("login", true);
		Loginpage loginpage = new Loginpage(driver);
		loginpage.login(driver);
	}

	@AfterMethod
	public void aftermethod() {
		Reporter.log("log out", true);
		Loginpage loginpage = new Loginpage(driver);
		loginpage.logout(driver);
		report.endTest(test);
	}
}
