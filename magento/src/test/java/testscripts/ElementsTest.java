package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ElementsTest {
	@Test
	public void signup() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("signup", true);
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("authorization-link")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("anirudhv91@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Aniche@211");
		Thread.sleep(2000);
		driver.findElement(By.id("send2")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("customer-name")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("authorization-link")).click();
		Thread.sleep(2000);
		driver.quit(); 
	}


}
