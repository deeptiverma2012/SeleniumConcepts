package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Registration_Assignment {
	
		static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			By firstName = By.id("input-firstname");
			
			doSendKeys(firstName,"Deepti");
			
			//String FirstNValue = driver.findElement(By.id("input-firstname")).getAttribute("value");
			String fName = getAttributeValue(firstName,"value");
			System.out.println(fName );            
			System.out.println("******************************************");
			
			By lastName = By.id("input-lastname");
			doSendKeys(lastName,"Verma");
			String lName = getAttributeValue(lastName,"value");
			System.out.println(lName );
			System.out.println("******************************************");
			
			By emailId = By.id("input-email");
			doSendKeys(emailId, "test@123.com");
			String email = getAttributeValue(emailId, "value");
			System.out.println(email);
			System.out.println("******************************************");
			
			By telephone = By.id("input-telephone");
			doSendKeys(telephone, "9111111111");
			String phone = getAttributeValue(telephone, "value");
			System.out.println(phone);
			System.out.println("******************************************");
			
			By passwd = By.id("input-password");
			doSendKeys(passwd, "abc@123");
			String pwd = getAttributeValue(passwd,"value");
			System.out.println(pwd);
			System.out.println("******************************************");
			
			By Confmpasswd = By.id("input-confirm");
			doSendKeys(Confmpasswd, "abc@123");
			String cpwd = getAttributeValue(Confmpasswd,"value");
			System.out.println(cpwd);
			System.out.println("******************************************");
			
			By subscribeOption = By.xpath("//input[@name='newsletter' and @ value =\"0\"]");
			 getElement(subscribeOption).click();
			String NotSubscribe = getAttributeValue(subscribeOption, "value");
			System.out.println(NotSubscribe);
			 
			
			
	}
		
		public static void doSendKeys(By locator, String value) {
			
		   getElement(locator).sendKeys(value);
}
		
		public static WebElement getElement(By locator)
		{
			return driver.findElement(locator);
		}

		public static String getAttributeValue(By locator, String attributeName)
		{
			String text = getElement(locator).getAttribute(attributeName);
			return text;
		}
}
