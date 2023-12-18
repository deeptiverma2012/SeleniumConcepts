package MySeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitWithIntervalTime {

	static WebDriver driver;
	public static void main(String[] args) {
			
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		By passwd = By.id("input-password");
		By loginBtn = By.xpath("//input[@type='submit']");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("abc@123.com");
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("abc@123.com");
		//Expected condition failed: waiting for visibility of element located by By.id: input-email1 (tried for 10 second(s) with 500 milliseconds interval)
		
		
	}

}
