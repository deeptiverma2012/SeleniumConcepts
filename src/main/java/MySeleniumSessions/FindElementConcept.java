package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementConcept {
   static WebDriver driver;

	public static void main(String[] args) {
		
		//SRP: Single responsibility principle means a specific class take care of some specific thing like browser utility for browser related things
		// & element utility to take care if the elements related things.
		
		// Link text & partialLinkText will work with <a> (anchor tag) only
		 driver = new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 
		 // Create the WebElement+Perform action(click, sendKeys, isDisplayed, getText)
		 
		 //Q. If I add 111265after the id, will it work? what kind of exception it will throw.
		 //A: Adding anything after the id or any locator will throw NoSuchElementException because during execution selenium will look for id in DOM but that id doesn't exists

		// driver.findElement(By.id("input-email1354")).sendKeys("test@123.com");// NoSuchElementFoundException
		 
		 //Q: Which part of the driver.findElement(By.id("input-email1354")).sendKeys("test@123.com"); is throwing NoSuchElementFoundException?
		 //A:First part where we are creating the WebElement driver.findElement(By.id("input-email1354"))
		 
		 //Q:int intBill = 123;Now, it wand to enter value throw
		 //driver.findElement(By.id("input-email1354")).sendKeys(intBill);can I do that how?
		 // A: First we have to convert int into String because FindElement method accepts input only in form of String
		 
//		int intBill = 123;
//		String value =String.valueOf(intBill);
//		driver.findElement(By.id("input-email1354")).sendKeys(value);
		 
		//Q : What will happen If I pass null instead of a string value. Null is the default value of a string.
		 //driver.findElement(By.id("input-email1354")).sendKeys(null);
		 //A:   It will throw IllegalArgumentException: Keys to send should be a not null CharSequence & it will not enter null in the text field
		 
		 //Q: Can i pass stringbuilder or buffer in sendKeys methos? Is it going to support?
		 
		 StringBuilder sb = new StringBuilder("test@gmail.com");
		// driver.findElement(By.id("input-email")).sendKeys(sb);
		 
		 //A: SendKeys will work with String, StringBuilder & StringBuffer.
		 // Because sendKeys method accepts Charactersequence which is an interface in java which is implemented by  String, StringBuilder & StringBuffer class .
		 // That is why it supports all String, StringBuilder & StringBuffer. Charactersequence<---- Implemented by String, StringBuilder & StringBuffer classes
		 
		 //Q: if i append the string, will it work?		 driver.findElement(By.id("input-email")).sendKeys(sb+"automation");
		 // Yes, it will work.
		 
		 driver.findElement(By.id("input-email")).sendKeys(sb+"automation");
	}

}
