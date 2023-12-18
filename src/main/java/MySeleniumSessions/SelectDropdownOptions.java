package MySeleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownOptions {

static WebDriver driver;
	
	public static void main(String[] args){ 
   			
		//Q: Get all the options available in the country dropdown
		 driver = new ChromeDriver();
		 driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		 
		 By country = By.cssSelector("select#Form_getForm_Country");
		 
		 selectDropdownOptions(country,"Malaysia");
		 List <String> countryOptions = getDropdownOptions(country);
		 
		 if(countryOptions.contains("India"))
		 {
			System.out.println("PASS"); 
		 }
		 else
		 {
			 System.out.println("FAIL");
		 }
		 	
		 List<String> selectedOptionsList = Arrays.asList("India","Malawi","Oman","Qatar","Sudan" );
		 
		 if(countryOptions.containsAll(selectedOptionsList))
		 {
			 System.out.println("All the countries found");
		 }
		 else
		 {
			 System.out.println("All the countries not found");
		 }
			
		int count = getDropdownOptionsCount(country);
		if((count-1) ==232)
		{
			System.out.println("Correct country count");
		}
		else
		{
			System.out.println("Incorrect country count");
		}

	}
	
	public static WebElement getElement(By locator)
	 {
		 return driver.findElement(locator);
	 }

	
	public static int getDropdownOptionsCount(By locator)
	{
		Select select = new Select(getElement(locator));
		List<WebElement>optionsList = select.getOptions();
		return optionsList.size();
	}
	
	public static List<String> getDropdownOptions(By locator)
	{
		Select select = new Select(getElement(locator));
		List<WebElement>optionsList = select.getOptions();
		System.out.println(optionsList.size());
		List<String> optionsTextList = new ArrayList<String>();
		for(WebElement e:optionsList )
		{
			String text = e.getText();
		    optionsTextList.add(text);
		}
		return optionsTextList;
	}
	public static void selectDropdownOptions(By locator, String dropdownText)
	{
		Select select = new Select(getElement(locator));
		 
		 List<WebElement> countryList = select.getOptions();
		 System.out.println(countryList.size());
		 
		 for(WebElement e:countryList ) {
			String text = e.getText();
			System.out.println(text);
			// Now, select a specific value without using selectByValue, SelectByIndex & SelectByVisibleText
			if(text.equals(dropdownText))
			{
				e.click();
				break;
			}
		 }
	}
}
