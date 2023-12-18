package MySeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();
    driver.get("https://selectorshub.com/xpath-practice-page/");
    
    //Q1: Click on all the checkboxes
    //   List <WebElement> list =  driver.findElements(By.xpath("//input[contains(@id, 'ohrmList_chkSelectRecord_')]"));
//   System.out.println(list.size());
//   
//   for(int i=0;i<=list.size()-1;i++ )
//   {
//	  list.get(i).click();
//	 System.out.println(list.get(i).getAttribute("id"));
//	 // System.out.println(i+"clicked");
//   }
   
   //Q2: Click on a specific checkbox(move from name to check box to write the xPath i.e from name towards check box)
   
//   driver.findElement(By.xpath("//a[contains(text(),'John.Smith')]/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
//   System.out.println("Check box clicked");
    
//    selectUserCheckbox("Jordan.Mathews");
//   	
//   	
//   	
    //Q3: Get all the corresponding values of a user i.e User Role, Employee name & Status
    
//   List<WebElement> list= driver.findElements(By.xpath("//a[contains(text(),'John.Smith')]/parent::td/following-sibling::td"));
//   System.out.println(list.size());
//   for(WebElement e: list)
//   {
//	   String text= e.getText();
//	   System.out.println(text);
//   }

  List<String> userDetails= getUserDetails("Jasmine.Morgan");
  System.out.println(userDetails);
	
	
	}
   
   public static void selectUserCheckbox(String userName)// Dynamic locator
	{
		 driver.findElement(By.xpath("//a[contains(text(),'"+userName+"')]/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	public static List<String> getUserDetails(String userName)
	{
		List<WebElement> list= driver.findElements(By.xpath("//a[contains(text(),'"+userName+"')]/parent::td/following-sibling::td"));
	   System.out.println(list.size());
	   List<String> detailsList = new ArrayList<String>();
	   
	   for(WebElement e: list)
	   {
		   String text= e.getText();
		   detailsList.add(text);
	   }
	   return detailsList;
	   }
		
	}
	

