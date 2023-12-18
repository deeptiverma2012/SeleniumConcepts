package MySeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcepts {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();
  //  driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
    
    //JavascriptExecutor is an interface
    //RemoteWebDriver class implements JavascriptExecutor
    //Script() --> excecuteScript(Script)--> Excecute script on browser page 
   
    JavascriptExecutor js = (JavascriptExecutor) driver;
//    String title = js.executeScript("return document.title").toString();
//    System.out.println(title);
    
   JavaScriptUtil javaSc = new JavaScriptUtil(driver);
//      String title =  javaSc.getTitleByJS();
//      System.out.println(title);
//      
//    String url=  javaSc.getUrlByJS();
//    System.out.println(url);
//   
//    
//    javaSc.generateJSAlert("Are you sure?");
//    
//    Thread.sleep(2000);
//    javaSc.generateJSConfirmationAlert("Do you want to proceed?");
//    
//    Thread.sleep(2000);
//    javaSc.generateJSPromptAlert("Are you sure", "Yes");
//    
//    Thread.sleep(2000);
//    javaSc.goBackWithJS();
//    Thread.sleep(2000);
//    javaSc.goForwardWithJS();
//    Thread.sleep(2000);
//    javaSc.refreshPageWithJS();
//    Thread.sleep(2000);
//    javaSc.scrollPageDownWithJS();
//    Thread.sleep(2000);
//    javaSc.scrollPageUpWithJS();
//    driver.get("https://classic.freecrm.com/index.html");
//    WebElement element = driver.findElement(By.xpath("//h3[text()='Import & Export']"));
    //javaSc.scrollInToView(element);
   // Thread.sleep(2000);
    //javaSc.zoomChromeSafariEdge("150");
  //  javaSc.drawBorder(element);

    
//    driver.get("https://app.hubspot.com/login");
//    
//    Thread.sleep(2000);
//    WebElement userName =driver.findElement(By.id("username"));
//    WebElement passwd = driver.findElement(By.id("password"));
////    javaSc.flash(userName);
////    userName.sendKeys("abc@123.com");
////    javaSc.flash(passwd);
////    passwd.sendKeys("abc@123");    
//    WebElement rememberBox =driver.findElement(By.id("remember"));
//    javaSc.clickByJS(rememberBox);
    
    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    javaSc.sendKeysUsingIdWithJS("input-email", "abc@123.com");
   
    
    
	}
	
	

}
