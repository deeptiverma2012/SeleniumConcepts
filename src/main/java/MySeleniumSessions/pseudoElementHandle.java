package MySeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pseudoElementHandle {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException{
    driver = new ChromeDriver();
    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//    Thread.sleep(2000);
//    String script = "return window.getComputedStyle(document.querySelector(\"label[for ='input-firstname']\"),'::before').getPropertyValue('content');";
//		
//   JavascriptExecutor js = (JavascriptExecutor) driver;
//   String mand_text = js.executeScript(script).toString();
//   System.out.println(mand_text);
//   if(mand_text.contains("*") )
//   {
//	   System.out.println("First Name is mandatory");
//   }
//   else
//   {
//	   System.out.println("First Name is not mandatory");
//   }
    String css = "label[for ='input-firstname']";
    checkFieldIsMandatoryWithJS(css);
	}
	
	public static void checkFieldIsMandatoryWithJS(String css)
	{
		 String script = "return window.getComputedStyle(document.querySelector('"+css+"'),'::before').getPropertyValue('content');";
			
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   String mand_text = js.executeScript(script).toString();
		   System.out.println(mand_text);
		   if(mand_text.contains("*") )
		   {
			   System.out.println("First Name is mandatory");
		   }
		   else
		   {
			   System.out.println("First Name is not mandatory");
		   }
		    
	}

}
