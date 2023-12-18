package MySeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropdownConcept {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException { 
   			
		 driver = new ChromeDriver();
		 driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		 
		// Thread.sleep(2000);
		// driver.findElement(By.cssSelector("input#justAnInputBox")).click();
		 
		 //Thread.sleep(2000);
//		 List<WebElement> dropdownOptions = driver.findElements(By.cssSelector("span.comboTreeItemTitle "));
//		 System.out.println(dropdownOptions.size());
//		 
//		 for(WebElement e: dropdownOptions)
//		 {
//			String text=  e.getText();
//			System.out.println(text);
//			
//			if(text.equals("choice 2 3"))
//			{
//				e.click();
//			}
//			
//		 }
//		
		By locator = By.cssSelector("input#justAnInputBox");
	    By optionsLocator = By.cssSelector("span.comboTreeItemTitle");
		
	    selectMultipleValNonSelectDropdown(locator, optionsLocator,"choice 2 3","choice 4" );
	    //selectMultipleValNonSelectDropdown(locator,optionsLocator,"all");
	   // selectMultipleValNonSelectDropdown(locator,optionsLocator,"choice 2 3");
	}
	

	public static WebElement getElement(By locator)
	{
	  return driver.findElement(locator);
	}
	
	public static List<WebElement> getElements(By locator)
	{
	  return driver.findElements(locator);
	}
	
	public int getDropdownOptionsSize(By locator)
	{
		List<WebElement> optionsList = getElements(locator);
		return optionsList.size();
	}
	
	/* This method is going to select dropdown values from a non select dropdown
	 * It can select multiple dropdown values
	 * Singlr dropdown value
	 *  All selection : To select all the dropdown options available pass all 
	 * @param locator
	 * @param values */
	public static void selectMultipleValNonSelectDropdown(By locator,By optionsLocator, String... optionsValue) throws InterruptedException
	{
		 Thread.sleep(1000);
         getElement(locator).click();
		 
		 Thread.sleep(2000);		
		
		
			if(optionsValue[0].equals("all"))
			{
				List<WebElement> optionsList =  getElements(optionsLocator);
				for(WebElement e : optionsList)
				{ 
					try {
			   		       e.click();
			   		 }
					catch(ElementNotInteractableException ex)
					{
					   System.out.println("ElementNotInteractableException occurred");
					   break;
						
					}
								
				}
			}
			else
			{
				List<WebElement> optionsList =  getElements(optionsLocator);
				for(WebElement e : optionsList)
				{
					String text = e.getText();
					System.out.println(text);
					for(String val:optionsValue)
					{
						if(val.equals(text))
						{
							e.click();
							break;
						}
						
					}
					
				}
				
			
			}
			
	}
		
}


