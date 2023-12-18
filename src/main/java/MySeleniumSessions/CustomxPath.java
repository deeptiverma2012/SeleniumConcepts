package MySeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomxPath {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();
    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		// xPath: address of the element in HTML DOM
		
		//1. absolute xPath:/html/body/header/div/div/div[2]/div/input
		//2. relative xPath:
		
		//htmltag[@attrName ='value']
		//input[@name='search']
		// Search: //input[@name='search' and @placeholder ='Search']
		// Search: //input[@type='text' and @placeholder='Search']
		//email : //input[@id='input-email']
		//email: //input[@id='input-email' and @name='email']
		//email: //input[@id='input-email' and @name='email' and @placeholder='E-Mail Address']
		
		
		//-- If id is given & it is static, it is not a good approach to use id in xpath. We can locate the element directly using id
		// Locating an element through By.id is a faster way to access the element
		// When name, id or class is not available, we'll use xPath. Otherwise, we'll use it directly.
		// we can use any number of attributes in order to get a unique xPath
		
		//   //input[@id]- 6 Elements
    
       // Total no. of links available on a page
		//driver.findElements(By.xpath("//input[@id]"));
       List<WebElement> list=  driver.findElements(By.xpath("//a"));
      int linkCount = list.size();
      System.out.println(linkCount);
      
      ////input[@id and @type]
    //input[@type='text' or @type ='password' or @type ='telephone' or @type ='email']
      
      // print all the links name on the console
      
     List<WebElement> linksList =  driver.findElements(By.xpath("//a[@class='list-group-item']"));
     for(WebElement e : linksList)
     {
    	String text=  e.getText();
    	System.out.println(text);
     }
		//To get total number of elements on a page: xpath -->//*     
         driver.findElements(By.xpath("//*"));
         
         //* --> 315
       //*[@class='form-control'] // 6 out of 315( Slow xPath)
       //input --> 14
       //input[@class='form-control']// 6 out of 14 (faster way)
         
        // using tagname is a better approach
         
         
         // text() in xPath( text() is available as a function)// used for text in header, links, span, p(paragraph)
         
         //htmltag[text() ='value'];
         
   //    //h2[text() ='New Customer']
  //     //h2[text() ='Returning Customer']
  //     //a[text() ='Forgotten Password']
         
         driver.get("https://classic.crmpro.com/");
         driver.findElement(By.className("https://classic.crmpro.com/"));
		
         //Q: Can we use text with attribute
         //A:Yes      
         
   //      //htmltagname[tex() ='value' and @attrName ='value']
         
   //    //a[text() ='Login' and @class = 'list-group-item']
  //     //a[text() ='My Account' and @class ='list-group-item']
         
   //    //htmltagname[tex() ='value' and @attr1Name ='value' and @attr2Name ='value']
         
         
         // contains() in xPath: It is a function & we can use it with text & attribute both
         //contains with attribute
         
   //      //htmltag[contains(@attrName,'value']
   //      //input[contains(@name,'email')]
   //      //input[contains(@placeholder,'E-Mail')]    We can pass partial value/ partial text when using contains()  
   //     //input[contains(@placeholder,'Address')]   
         
         // We can use multiple attributes with contains() but it is not mandatory to write the second or other attribute using contains
         
        // //input[contains(@placeholder,'Address') and @id ='input-email']
       //input[contains(@placeholder,'Address') and @id ='input-email' and contains(@type, 'text')]
         
        // Q What is the difference b/w xpath with attribute & xpath with contains()?
         //A: In case of xpath with attribute, we have to provide the exact value of the attribute & its syntax is //htmltag[@attriName ='value'].
         // Whereas in case of contains we can pass the partial value or complete value of the attribute
         
      //   //input[contains( @id, 'input-email') ]
         //   //input[@id = 'input-email']
         
       //  Q: When we should use contains()?
         // 1. In case of long text /Paragraph         
         //2. With dynamic id
         
         // contains() with text()
         
         //  //htmltag[contains(text(),'value']
         
   //    //h2[contains(text(),'Returning')] ---> text() with header
         
    // //p[contains(text(),'By creating an account')] ---> text() with paragraph
    //   //p[contains(text(),'By creating an account') and contains(text(),'previously ')]     
         
         //Q: Can i use contains() with text & attribute both?
         //A: Yes
   // //htmltag[contains(text(),'value') and contains(@attrName, 'value')]  
   //  //a[contains(text(),'Register') and contains(@class, 'list-group-item')]       
         
         
         // Dynamic attributes
         
         //<input  id = firstName_123>
       //<input  id = firstName_456>
       //<input  id = firstName_789>
       
      //   //input[contains(@id, 'firstName_')   
         
      // starts-with() in xPath
         
      // //htmltag[starts-with(text(),'value')]   
      // //p[starts-with(text(),'By creating')]   
      // //input[starts-with(@id, 'firstName_')]   
         
     // ends-with() in xPath  // deprecated -- not allowed now
      // //htmltag[ends-with(text(),'value')]  
         
         
     
         
         
         
         
         
         
		
		

	}

}
