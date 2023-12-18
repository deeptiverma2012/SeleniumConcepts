package MySeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShadowDomInsideIframe {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(3000);
//		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
//		driver.switchTo().frame("pact");
//	
//	String tea_input =	"return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
//	
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	WebElement teaBox = (WebElement) js.executeScript(tea_input);
//	teaBox.sendKeys("Absolutely");
		
	driver.get("https://books-pwakit.appspot.com/");
	String inputBox = "return document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"#input\")";
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement searchBox =(WebElement) js.executeScript(inputBox);
	searchBox.sendKeys("Wonderland");
	
//	String searchIcon = "return document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"#input\")" ;
//	Thread.sleep(3000);
//	WebElement search =(WebElement) js.executeScript(searchIcon);

	
	Actions act = new Actions(driver);
	act.sendKeys(searchBox, Keys.ENTER);
	
	

	}

}
