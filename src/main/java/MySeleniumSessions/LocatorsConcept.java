package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		//1. id : is an attribute. Always unique  -- I
		
	 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        //driver.findElement(By.id("input-email")).sendKeys("test@123.com");
        
        
        //2. name: it is an attribute. can be duplicate --- II
		//driver.findElement(By.name("email")).sendKeys("test@123.com");
		
		// 3. className: it is an attribute. Most of the time, it is duplicate. The moment it finds first element & enter values --- III
		//driver.findElement(By.className("form-control")).sendKeys("test@123.com");
        //What is the purpose of the class
		// it is a style class to style the elements like color, brightness..., etc.
		//c1 or c1 c2 or c1 c2 c3 or c1 c2 c3 c4.... & so on
		
		//4. xPath: not an attribute. Address of the element in the html DOM.(XML path of the element in DOM)
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@123.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
//		By eId = By.id("input-email");
//    	By pwd = By.id("input-password");
//    	By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//    	doSendKeys(eId, "abc@gmail.com");
//    	doSendKeys(pwd, "abc@123");
//    	doClick(loginBtn);
		
		//5. cssSelector: not an attribute : 
//		By eId = By.cssSelector("#input-email");
//    	By pwd = By.cssSelector("#input-password");
//    	By loginBtn = By.cssSelector("#content > div > div:nth-child(2) > div > form > input");
//    	doSendKeys(eId, "abc@gmail.com");
//    	doSendKeys(pwd, "abc@123");
//    	doClick(loginBtn);
    	
		//6. LinkText: link text is not an attribute , this is the text of the link. Can be duplicate
		//driver.findElement(By.linkText("Register")).click();
//		By reg = By.linkText("Register");
//		doClick(reg);
		
		//7. Partial link text: only for links: 99% links will not have any id because they contain unique links but links can be duplicate
		
//		By fgtn = By.partialLinkText("Forgotten");
//		//Forgotten Id
//		//Forgotten pwd
//		doClick(fgtn);
		
		//8. tagname: html tag name
//		String text = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(text);
//		if(text.equals("New Customer"))
//		{
//			System.out.println("Text is correct --Pass");
//		}
//		else
//		{
//			System.out.println("Text is incorrect --Fail");
//		}
//		
//		to check the uniqueness of id & cssSelector
		// 1. Ctrl+f in DOM 2. for class write .classname in the search field 3. for cssSelector write #
		//2. If you get 1 of 1 it means it is unique
		
		driver.findElement(By.className("img-responsive")).click();
		System.out.println("Image clicked");
		
		
	}
	
	public static String doElementGetText(By locator)
	{
		return getElement(locator).getText();
		
	}
	
	public static void doClick(By locator)
	{
		getElement( locator).click();
	}
	public static  WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}	
	
	public static void doSendKeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}

}
