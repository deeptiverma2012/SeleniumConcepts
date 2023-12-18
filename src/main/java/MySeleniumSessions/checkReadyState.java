package MySeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkReadyState {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		Boolean b = isPageLoaded(15);
		System.out.println(b);

	}
 public static Boolean isPageLoaded(int timeout)
 {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 String flag = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState =='complete'")).toString();
     return Boolean.parseBoolean(flag);
 } 
 }
