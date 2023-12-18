package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
   		//Select dropdown handling
		// htmltag ---> <select> --> <option>(child tag)
		
		 driver = new ChromeDriver();
		 driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		 
		 By country = By.cssSelector("select#Form_getForm_Country");
		 Thread.sleep(1000);
		 
	   //WebElement cdropdwn =   driver.findElement(country);
	//	WebElement cdropdwn = getElement(country);
	     // Select select = new Select(cdropdwn);
	     // select.selectByValue("India");// SelectByVisibleText is the best method to use among these 3 methods.Index  may change but we can use the visible text
	      //select.selectByValue("Bahamas");
	     // Thread.sleep(1000);
	    // select.selectByVisibleText("El Salvador");
	    // Thread.sleep(1000);
	     // select.selectByIndex(6);// use in case of fixed/static data like months, days etc.
	    //  System.out.println("Value selected");
	     doSelectDropdownByValue(country,"Bulgaria");
	     Thread.sleep(1000);
	     doSelectDropdownByIndex(country,15);
	     Thread.sleep(1000);
	     
	     doSelectDropdownByVisibleText(country,"India");
		 
	   
	}
	 public static WebElement getElement(By locator)
	 {
		 return driver.findElement(locator);
	 }
	 
	 public static void doSelectDropdownByValue(By locator, String value)
	 {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	 }

	 public static void doSelectDropdownByIndex(By locator, int indexNo)
	 {
		Select select = new Select(getElement(locator));
		select.selectByIndex(indexNo);
	 }
	 public static void doSelectDropdownByVisibleText(By locator, String value)
	 {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	 }

}
