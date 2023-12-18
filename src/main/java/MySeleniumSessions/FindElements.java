package MySeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

		// findElement : find single element+Perform action
		// findElements : fimd multiple elements+ No action 
		static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		// WAF to count the text fields on registeration form
		List<WebElement> textField = driver.findElements(By.className("form-control"));
		
		for(int i=0; i<textField.size(); i++)
		{
			System.out.println(textField.get(i).getAttribute("name"));
		}
		System.out.println("Total text Fields"+textField.size());

	}

}
