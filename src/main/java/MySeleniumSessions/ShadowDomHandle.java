package MySeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomHandle {


	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
	
	String Pizza_Box_Script =	"return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";

	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement PizzaInput = (WebElement) js.executeScript(Pizza_Box_Script);
	PizzaInput.sendKeys("Pineapple pizza");
	}

}
