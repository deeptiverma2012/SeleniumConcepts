package MySeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

static WebDriver driver;
	
	public static void main(String[] args)  {
   
	driver = new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//css---> cascade styling sheet. It is responsible for styling of the elements(color, shadow, brightness) look & feel
		// cSS --> locator approach
		
		//id ---> #id
		//class ---> .class
		
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Deepti");// #input-firstname ---> css using id
//		
//	    List<WebElement>list = 	driver.findElements(By.cssSelector("form-control"));// .form-control ---> css using class name
//	    
//	    list.size();
//	    for(WebElement e: list)
//	    {
//	      String Text =	e.getAttribute("placeholder");
//	      System.out.println(Text);
//	    }
//	    
	    
	    //Q: Can we use id & class together? A: Yes
	    // #id.className
	    //.className#id
	    //e.g. 1. #input-lastname.form-control     2. .form-control#input-lastname
	    //Q: What if you have multiple classes? A: We will use all the classes separated by .(dot)
	    // .c1.c2.c3.c3....................cn
	    // https://app.hubspot.com/login
	    //e.g,    .form-control.input-lg(two classes both separated by .)
	    // .form-control.private-form__control.login-email(3 classes separated by .)
	    //.form-control.private-form__control.login-email#username    and   #username.form-control.private-form__control.login-email(multiple classes with id) 
	   
	    //.uiButton.private-button.private-button--primary.private-button--default.m-bottom-4.login-submit.private-button--non-link ( css using 7 classes)
	    
	    // If we don't have Id & class is giving multiple elements exists with same class. We'll not go with css bdecause css cannot identify an element uniquely
	    
	    
	    // Other attributes : type, name or any other attribute
	    
	    // tagname[attr ='value']( In css no // & @) 
	    
	   // By.cssSelector("input[name='firstname']");
	    // Q can we use multiple attributes? A: Yes but each attribute should be enclosed in []
	    // e.g, input[name='firstname'][placeholder='First Name']
	    // input[name][placeholder][type]
	    //input[name='firstname'][placeholder='First Name'][type ='text']
	    
	    //Q: Can we use id with attributes? A: yes
	    //e.g, 1. input[name='firstname'][placeholder='First Name'][type ='text']#input-firstname
	    // 2. input#input-firstname[name='firstname'][placeholder='First Name'][type ='text']
	    //Q: Can we use class with attributes? A://Yes
	    // e.g, input[name='firstname'][placeholder='First Name'][type ='text'].form-control  and input.form-control[name='firstname'][placeholder='First Name'][type ='text']
	    
	    //Q: Will the below code work(multiple classNames with locating texhnique By,ClassName)? 
	    // driver.findElement(By.className("uiButton private-button private-button--primary private-button--default m-bottom-4 login-submit private-button--non-link"));// Invalid
 
	    //A: Invalid selector Exception: Compound classe names not permitted
	    
	    //driver.findElement(By.cssSelector(".uiButton.private-button.private-button--primary.private-button--default.m-bottom-4.login-submit.private-button--non-link")); // Valid
	    
	  
	    //Q: driver.findElement(By.id(//input[@@@@@id ='userName'])); will it work
	   // A: It will throw invalid selector exception
	   
	    // text() in css ---> Not available
	    // Contains concept in css(functions are not applicable in css but we have some formulas to check contains with some spl. characters)
	   // contains formula : htmltag[ attr*='value']
	   //e.g, input[placeholder*= 'Password Confirm']
	    
	   // starts-with formula: htmltag[attr^='value']
	   //e.g, input[placeholder^= 'Password']
	    
	   //ends-with formula: htmltag[attr$='value']
	    //e.g, input[placeholder$= 'Confirm']
	    
	    
	    //Parent to child in css   : parent> child
	    
	   // driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
	    
	    //xPath for country dropdown : //select[@id='Form_getForm_Country']/option
	    // css for country dropdown for direct child :select[id='Form_getForm_Country']>option( Css using parent child)
	
	    // css for indirect+ indirect child: parent child(parent space child)
	    // child to parent: Not allowed(backward traversing not allowed in css) 
	    // Preceding sibling : Not allowed (backward traversing not allowed in css) 
	    
	    //following sibling( We have to use + sign for the following sibling):   label[for='input-firstname']+div>input
	    
	    // Comma(,) in css: If we want to use a single locator for all the fields available on a form, we can do that by using the css for different elements separated by ,
	    
	int elementCount =    driver.findElements(By.cssSelector("input#input-email,input#input-password")).size();
	System.out.println(elementCount);
	
	if(elementCount==2)
	{
		System.out.println("Both elements present---PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	
	// not in css(To exclude the elements from the list)
	
	//          div[class='form-group']>input:not(#input-password)
	//          div.col-sm-10>input:not(#input-firstname)
	//          div.col-sm-10>input:not([name='firstname'])
	//Q: Can we use , while excluding the elements
	//A: yes. we can use , to exclude more than 1 element from the list
	//e.g,   div.col-sm-10>input:not([name='firstname'],[type='email' ])
	
	//indexing in css
	
	// [id='Form_getForm_Country'] option:nth-of-type(10)// where 10= index no.
	// [id='Form_getForm_Country'] option:nth-of-type(n)// where n = all the elements
	// [id='Form_getForm_Country'] option:first-child
	// [id='Form_getForm_Country'] option:last-child(2) 
	// select[id='Form_getForm_Country'] option:nth-child(2)// second last child 
	// select[id='Form_getForm_Country'] option:nth-child(even)
	// select[id='Form_getForm_Country'] option:nth-child(odd)
	// select[id='Form_getForm_Country'] option:nth-child(n+5) // 5th element
	// select[id='Form_getForm_Country'] option:nth-child(4n) // elements at the positions 4,8...40...(table of 4)
	
	
	// Q: How to capture even & odd xPaths separately?
	//A: For even no. (//select[@id='Form_getForm_Country'] /option)[position() mod 2 =0]
	//For odd no. (//select[@id='Form_getForm_Country'] /option)[position() mod 2 =1]
	
	
	// 				             xPath    				 vs     					 css
	// syntax                    complex											Simple
	// performance               good                                               good
	// backward traversing       yes                                                no
	// sibling                   yes                                                yes but only following
	// ancestor                  yes                                                no
	// text                      yes                                                no
	// indexing                  yes                                                yes+1
	// comma                     no                                                 yes
	//exclude/not                no                                                 yes
	//svg(scalar vector graph)   yes                                                no
	//shadowDom                  no                                                 yes   
	//ends-with                  no                                                 yes
	
	
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
