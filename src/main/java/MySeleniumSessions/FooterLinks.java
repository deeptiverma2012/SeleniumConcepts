package MySeleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FooterLinks {

	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();
    driver.get("https://naveenautomationlabs.com/opencart/");
    // Absolute xpath: //footer/div/div/div/ul/li/a
    // In case of direct child use /(e.g, //footer/div) & in case of indirect child use //(e.g, //footer//a)
 
    By links = (By.xpath("//footer//a"));
    
//    List<WebElement> linkslist =  driver.findElements(links);
//    List <String> li = new ArrayList<String>();
//    for(WebElement e: linkslist)
//    {
//    	String text = e.getText();
//    	if(text.length()!=0)
//    	{
//    		li.add(text);
//    		
//    	}
//       	
//    }
//    System.out.println(li);
    ElementUtil eUtil = new ElementUtil(driver);
    int count =  eUtil.getElementCount(links);
    System.out.println("Count of links ="+ count);
   
    List<String> list = eUtil.getElementsTextList(links);
    System.out.println(list);
   List <String>  expectedFooter = Arrays.asList("Privacy Policy", "Terms & Conditions", "Contact Us", "Returns");
   
   if(list.containsAll(expectedFooter))
    {
	  System.out.println("Footer links found ---- Pass");
    }
   else
    {
    	System.out.println("Footer links not found ---- Fail");
    }
   
   
   
   
		

	}

}
