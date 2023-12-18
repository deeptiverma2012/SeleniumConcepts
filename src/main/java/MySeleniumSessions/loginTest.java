package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest {

	 static WebDriver driver;

		public static void main(String[] args) {
			
			 driver = new ChromeDriver();
			 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			 
			 String email = "input-email";
			 String pwd = "input-password";
			 String lgnBtn = "//input[@value='Login']";
			 
			 ElementUtil eUtil = new  ElementUtil(driver);
		eUtil.doSendKeys("id", email, "abc@123.com");
		eUtil.doSendKeys("id", pwd, "abc@123");
	  WebElement lgbtn= eUtil.getElement( "xPath",lgnBtn);
	  lgbtn.click();
		
		
 	}

}
