package MySeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownHandlingWithOutSelect {
static WebDriver driver;
	
	public static void main(String[] args){ 
   			
		//Q: Without using select class, choose an option from the dropdown
		 driver = new ChromeDriver();
		 driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		 
		 By country = By.cssSelector("select#Form_getForm_Country>option");
		 
//	     List<WebElement> optionsList =	 driver.findElements(country); 
//	     System.out.println(optionsList.size());
//	     
//	     for(WebElement e: optionsList)
//	     {
//	    	String text = e.getText();
//	    	System.out.println(text);
//	    	
//	    	if(text.equals("India"))
//	    	{
//	    		e.click();
//	    		break;
//	    	}
//	    }
		 selectDropdwnValueWithOutSelect(country,"Colombia");
		 
	     }
	
	public static void selectDropdwnValueWithOutSelect(By locator, String value)
	{
		 List<WebElement> optionsList =	 driver.findElements(locator); 
	     System.out.println(optionsList.size());
	     
	     for(WebElement e: optionsList)
	     {
	    	String text = e.getText();
	    	System.out.println(text);
	    	
	    	if(text.equals(value))
	    	{
	    		e.click();
	    		break;
	    	}
	    }
	}
	     
		 
		 
		 

	}

	

