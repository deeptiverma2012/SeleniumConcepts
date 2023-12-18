package MySeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TotalLinks {
	
static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
	    driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
//		List <WebElement>listLink  = driver.findElements(By.tagName("a"));
//		System.out.println(listLink.size());
//		for(int i=0; i<listLink.size(); i++)
//		{
//		
//			String text = listLink.get(i).getText();
//			if(text.length()!=0)
//			{
//				System.out.println(text);
//			}
//		}
		
     		By linktag = By.tagName("a");
     		int count = getElementCount(linktag);
     		System.out.println("Count of links:"+ count);
     		
     		
     		//WAF to capture the text of all page links and return List<String>
     		
     		
     		List<String> ls = getElementsTextList(linktag);
     		System.out.println(ls);
     		
     		List <String> attrValues= getElementsAttributeList(linktag, "href");
     		System.out.println(attrValues);
     		
		}
		
		public static List<String> getElementsTextList(By locator)
		{
			List<WebElement> li = getElements(locator);
			List<String> strList = new ArrayList<String>();
			for(WebElement e : li)
			{
				String text = e.getText();
				if(text.length()!=0)
				{
					 strList.add(text);
				}
			}
			return strList;
				
		}
		public static List<String> getElementsAttributeList(By locator, String attributeName)
		{
			List<WebElement>list = getElements(locator);
			List<String> li = new ArrayList<String>();
			for(WebElement e: list)
			{
				String text = e.getAttribute(attributeName);
				
				if(text.length()!=0)
				{
					li.add(text);
				}
				
			}
			System.out.println(li);
			
			return li;
		}
		
		public static int getElementCount(By locator)
		{
			List <WebElement>li = getElements(locator);
			return li.size();
			
		}
		public static List<WebElement> getElements(By locator)
		{
			List <WebElement> list = driver.findElements(locator);
			return list;
					
		}

}
