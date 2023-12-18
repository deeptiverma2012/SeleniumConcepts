package MySeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class customXpath1 {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();
    driver.get("https://www.amazon.com/");
//    driver.findElement(By.xpath("(//input[@class ='form-control'])[1]")).sendKeys("Deepti");  
//  String text=   driver.findElement(By.xpath("(//label[@class='radio-inline'])[position()=1]")).getText();
//  System.out.println(text);
//  if(text.equals("Yes"))
//  {
//	  System.out.println("PASS");
//  }
//  else
//	  {
//        System.out.println("FAIL");
//	 }
    
    //Q: Print the list of currency from currency dropdown using form
//    driver.findElement(By.xpath("//i[@class='fa fa-caret-down']")).click();
//    
//   List <WebElement> list = driver.findElements(By.xpath("//form[@id ='form-currency']//ul[@class = 'dropdown-menu']//button"));// //form[@id ='form-currency']//ul//button
//   
//  System.out.println(list.size());
//  
//  for(WebElement e : list)
//  {
//	  String text = e.getText();
//	  System.out.println(text);
//  }
    
    //Q: From radio button, print the label "subscribe"
//    
//   String text = driver.findElement(By.xpath("//label[@class ='radio-inline']/../../label")).getText();
//   System.out.println(text);
//   if(text.equals("Subscribe"))
//   {
//	   System.out.println("PASS");
//   }
//   else
//   {
//	   System.out.println("Try again");
//   }
    
    //Q:From email field traverse backward & print label "E-Mail Address" on login screen
    
//    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//   String label= driver.findElement(By.xpath("//input[@id ='input-email']/../label")).getText();
    
    //above xpath with parent keyword 
//  //input[@id ='input-email']/parent::div/label
  //input[@id ='input-email']/parent::div[@class='form-group required']/child::/label
    
//   System.out.println(label);
   
   //Q: On registration page print label First Name from the firstname text field
   
// String label = driver.findElement(By.xpath("//input[@id = 'input-firstname']/ancestor::div/label")).getText();
// System.out.println(label);
 ////input[@id='input-firstname']/ancestor::div/child::label[@for= 'input-firstname']
//input[@id = 'input-firstname']/parent::div/preceding-sibling::label
 // //input[@id = 'input-firstname']/parent::div/preceding-sibling::label
    
   // ((//div[@class ='navFooterLinkCol navAccessibility'])[last()]//li)[last()]
   //((//div[@class ='navFooterLinkCol navAccessibility'])[last()]//a)[last()]
//    System.out.println("***************************************************************************");
//  driver.get("https://www.amazon.com/");
//  String text =  driver.findElement(By.xpath("((//div[@class ='navFooterLinkCol navAccessibility'])[last()]//a)[last()]")).getText();
//  System.out.println(text);  	
//  if(text.equals("Help"))
//  {
//	  System.out.println("PASS");
//  }
//  else
//  {
//	  System.out.println("FAIL");
//  }
//  System.out.println("***************************************************************************");
//  driver.get("https://www.freshworks.com/");
//  String text =  driver.findElement(By.xpath("((//div[contains(@class, 'sc-b323b31-0 kwWHQr')])[last()-1]/..//a)[last()]/span")).getText();
//  
//  System.out.println(text);
//  if(text.equals("Community"))
//  {
//	  System.out.println("PASS");
//  }
//  else
//  {
//	  System.out.println("FAIL"); 
//  }
// System.out.println("***************************************************************************");
		
    //Q: on login screen print label "E-Mail Address" from its sibling email input box 
//    String label = driver.findElement(By.xpath("//input[@id ='input-email']/preceding-sibling::label")).getText();
//    System.out.println(label);
    
    //Q: On amazon, you have to check that in footer carrier is under Get To Know Us
//  driver.get("https://www.amazon.com/");
// String header = driver.findElement(By.xpath("(//li[@class ='nav_first']/parent::ul/preceding-sibling::div[@class ='navFooterColHead'])[position()=1]")).getText();
// System.out.println(header);
	
//Q: On login page starting from password label, print the placeholder text
    
//    Thread.sleep(3000);
//  
//    String text1 = driver.findElement(By.xpath("//label[text() ='Password']/following-sibling::input[@id ='input-password']")).getAttribute("placeholder");
//	System.out.println(text1);
	
//Q: On amazon home page, get all the options available under "Get To Know Us"
	
List<WebElement> elelist =driver.findElements(By.xpath("//div[text()='Get to Know Us']/following-sibling::ul/li"));	
System.out.println(elelist.size());

for(WebElement e: elelist)
{
	String text = e.getText();
	System.out.println(text);
}
	}

}
