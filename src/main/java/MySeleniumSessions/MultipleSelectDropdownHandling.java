package MySeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDropdownHandling {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException{ 
   			
		//Q: Without using select class, choose an option from the dropdown
		 driver = new ChromeDriver();
		 driver.get("https://html.com/attributes/select-multiple/");
		 
		 Thread.sleep(5000);
//		 
//		WebElement multiSelectdropdown = driver.findElement(By.xpath("//select"));
//		
//		Select select = new Select(multiSelectdropdown); 		
//		
//		 if(select.isMultiple())
//		 {
//			 System.out.println("It's a multi select dropdown");
//			 select.selectByVisibleText("American flamingo");
//			 select.selectByVisibleText("Greater flamingo");
//			 select.selectByVisibleText("Chilean flamingo");
//			 
//		 }
//		 List<WebElement> eleList = select.getAllSelectedOptions();
//		 System.out.println(eleList.size());
//		 Thread.sleep(1000);
//		 select.deselectByVisibleText("Chilean flamingo");
//		 Thread.sleep(1000);
//		 select.deselectByVisibleText("American flamingo");
		 
	   By multiValueDropdown = By.xpath("//select");
	   By optionslocator = By.xpath("//select/option");
	   //TC1: Multiple values
	  // selectDropdownMultipleValues(multiValueDropdown,optionslocator, "Chilean flamingo","American flamingo","Greater flamingo");
	  
	   //TC2: Single values
	  // selectDropdownMultipleValues(multiValueDropdown,optionslocator, "Chilean flamingo");
	   
	   //TC3: Select All
	   
	
	   selectDropdownMultipleValues(multiValueDropdown, optionslocator, "all");
		
	}
	
	public static WebElement getElement(By locator)
	{
	   return driver.findElement(locator);
	}
	public static List<WebElement> getElements(By locator)
	{
	   return driver.findElements(locator);
	}
	
	public static boolean isDropdownMultiple(By locator)
	{
		Select select = new Select(getElement(locator));
		return select.isMultiple() ? true: false;
		
	}
	
	/*This method is used to select values from dropdown. It can select
	 * 1. Multiple dropdown values
	 * 2. Single dropdown value
	 * 3. All selection : To select all the dropdown options available pass all 
	 * @param locator
	 * @param values
	 * */
	public static void selectDropdownMultipleValues(By locator,By optionsLocator, String... values)
	{
		Select select = new Select(getElement(locator));
		
		
		 if(isDropdownMultiple(locator))
		 {
			 if(values[0].equals("all"))
			 {
				List <WebElement> optionsList = getElements(optionsLocator);
				for(WebElement e: optionsList)
				{
					e.click();
				}
				
			 }
			 else {
			 for(String eval:values)
			 {
				 select.selectByVisibleText(eval);
			 }
			 }
			 
		 }
	}

}
