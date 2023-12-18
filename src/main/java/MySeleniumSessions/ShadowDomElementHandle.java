package MySeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElementHandle {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("chrome://settings/");
	String searchScript ="return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";

	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//html element ---> Selenium WebElement
	WebElement search = (WebElement) js.executeScript(searchScript);
	search.sendKeys("notification");
	}

}
